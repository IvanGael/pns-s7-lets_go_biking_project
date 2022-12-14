using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using WebProxyService.ReferenceObjects;

namespace WebProxyService
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" à la fois dans le code et le fichier de configuration.
    public class ProxyCacheService : IProxyCacheService
    {

        public List<StaticStation> stations;

        ProxyCache<JCDecauxElement> cache = null;
        JCDecauxHttpRequests request = new JCDecauxHttpRequests();

        public List<Contract> contracts;

       public ProxyCacheService()
       {
            this.stations = request.FindAllStations().Result; // on recupere toutes les stations au demarage et on les stock dans la variable
            this.contracts = request.FindAllContracts().Result; // on recupere toutes les contracts au demarage et on les stock dans la variable
        }

        public List<StaticStation> GetStations()
        {
            return stations; 
        }

        public List<Contract> GetContracts()
        {
            return contracts;
        }

        public DynamicStation GetOneStation(int numero, string ville)
        {
            string key = numero.ToString()+ "_" + ville;

            if (cache == null)
            {
                cache = new ProxyCache<JCDecauxElement>();                
            }

            return this.cache.Get(key, 60.0).station; //60s de delai d'expiration
        }

        public List<StaticStation> GetStationsByContract(string contract)
        {
            return request.FindAllStationsByContract(contract).Result;
        }
    }
}
