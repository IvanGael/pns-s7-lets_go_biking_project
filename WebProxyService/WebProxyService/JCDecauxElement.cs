using System;
using System.Collections.Generic;
using System.Linq; 
using System.Text;
using System.Threading.Tasks;
using WebProxyService.ReferenceObjects;

namespace WebProxyService
{
    public class JCDecauxElement
    {
        JCDecauxHttpRequests request = new JCDecauxHttpRequests();
        public DynamicStation station { get; set; }

        public JCDecauxElement(string key)
        {
            string[] identifiers = key.Split('_');
            int stationNumber = int.Parse(identifiers[0]);
            string contractName = identifiers[1];

            station = request.FindStationByNumberAndContractName(stationNumber, contractName).Result;
        }
    }
}
