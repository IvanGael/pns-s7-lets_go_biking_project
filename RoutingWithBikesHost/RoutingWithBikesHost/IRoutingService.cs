using RoutingWithBikesHost.OpenRouteServiceAPI;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Threading.Tasks;

namespace RoutingWithBikesHost
{
    [ServiceContract]
    public interface IRoutingService
    {
        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "origine={origine}")]
        Task<WebProxy.Contract> GetContractWithOrigine(string origine);


        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "destination={destination}")]
        Task<WebProxy.Contract> GetContractWithDestination(string destination);

        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "stations")]
        WebProxy.StaticStation[] GetStations();

        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "stations?contract={contract}")]
        WebProxy.StaticStation[] GetStationsByContract(string contract);

        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "contracts")]
        WebProxy.Contract[] GetContracts();

        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "cities")]
        List<string> GetCities(); 




        [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "itineraire?depart={depart}&arrivee={arrivee}")]
        Task<Itineraire> GetItineraire(string depart, string arrivee);

        [OperationContract]
        List<Statistique> GetStatistiques();


       /* [OperationContract]
        [WebInvoke(Method = "GET", ResponseFormat = WebMessageFormat.Json,
            BodyStyle = WebMessageBodyStyle.Wrapped, UriTemplate = "convert_address_to_coordinates?address={address}")]
        Task<List<double>> ConvertAddressToCoordinates(string address); */

    }

}
