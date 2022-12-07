using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using WebProxyService.ReferenceObjects;
//using System.Text.Json;

namespace WebProxyService
{
    public class JCDecauxHttpRequests
    {
        private const string URL = "https://api.jcdecaux.com/vls/v3";
        private const string API_KEY = "701c9734f7d11501aa7cf778fbc92c5f1c6b7bc0";
        private static readonly HttpClient client = new HttpClient();


        


        public async Task<List<StaticStation>> FindAllStations()
        {
            try
            {
                HttpResponseMessage response = await client.GetAsync(URL + "/stations?apiKey=" + API_KEY);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                List<StaticStation> stations = JsonConvert.DeserializeObject<List<StaticStation>>(responseBody);

                return stations;
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
            }

            return null;
        }

        public async Task<List<StaticStation>> FindAllStationsByContract(string contract)
        {
            try
            {
                HttpResponseMessage response = await client.GetAsync(URL + "/stations?contract=" + contract + "&apiKey=" + API_KEY);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                List<StaticStation> stations = JsonConvert.DeserializeObject<List<StaticStation>>(responseBody);

                return stations;
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
            }

            return null;
        }


        public async Task<List<Contract>> FindAllContracts()
        {
            try
            {
                HttpResponseMessage response = await client.GetAsync(URL + "/contracts?apiKey=" + API_KEY);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                List<Contract> contracts = JsonConvert.DeserializeObject<List<Contract>>(responseBody);

                return contracts;
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
                return null;
            }

        }


        public async Task<DynamicStation> FindStationByNumberAndContractName(int stationNumber, string contractName)
        {
            try
            {
                HttpResponseMessage response = await client.GetAsync(URL + "/stations/" + stationNumber + "?contract=" + contractName + "&apiKey=" + API_KEY);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                DynamicStation station = JsonConvert.DeserializeObject<DynamicStation>(responseBody);

                return station;
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine("\nException Caught!");
                Console.WriteLine("Message :{0} ", e.Message);
                return null;
            }
        }
    }
}
