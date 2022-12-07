using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Threading.Tasks;
using RoutingWithBikesHost.OpenRouteServiceAPI;
using System.Globalization;
using System.Linq;
using System.IO;
using System.Text;
using System.Net.Http.Headers;
using RoutingWithBikesHost.WebProxy;

namespace RoutingWithBikesHost
{
    public class RoutingService : IRoutingService
    {
        static readonly HttpClient client = new HttpClient();
        const string ADDRESS_URL = "https://api-adresse.data.gouv.fr";
        string token = "5b3ce3597851110001cf62487ac7e7a1ea0249d4bf120d945cf3d4db";
        string OpenServiceURL = "https://api.openrouteservice.org/v2";

        static ProxyCacheServiceClient proxy = new ProxyCacheServiceClient();

        StaticStation[] stations = proxy.GetStations();

        Contract[] contracts = proxy.GetContracts();

        static List<Statistique> statistiques = new List<Statistique>();




        private async Task<OpenRouteService> GetDirections(List<double> depart, List<double> arrivee, string directionType)
        {
            //CultureInfo.InvariantCulture pour eviter que le float a un , a la place de . exp : 10.6 au lieu de 10,6
            string start = depart[0].ToString(CultureInfo.InvariantCulture) + "," + depart[1].ToString(CultureInfo.InvariantCulture);
            string end = arrivee[0].ToString(CultureInfo.InvariantCulture) + "," + arrivee[1].ToString(CultureInfo.InvariantCulture);
            string url = OpenServiceURL + "/directions/"+directionType+"?api_key=" + token + "&start=" + start + "&end=" + end;
            try
            {
                var u = new Uri(url);
                client.DefaultRequestHeaders.TryAddWithoutValidation("accept", "application/json, application/geo+json, application/gpx+xml, img/png; charset=utf-8");
                HttpResponseMessage response = await client.GetAsync(u);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                OpenRouteService direction = JsonConvert.DeserializeObject<OpenRouteService>(responseBody);
                return direction;
            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("log-directions.log", true))
                {
                    writer.WriteLine(ex.ToString());
                    writer.WriteLine("url " + url);
                }
                return null;
            }
        }

        
        private async Task<CheckCities> GetCitiesFromCP(int cp)
        {
            try
            {
                //API permettant de retrouver les villes d'une adresse postale
                HttpResponseMessage response = await client.GetAsync("https://vicopo.selfbuild.fr/cherche/" + cp);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                CheckCities tab = JsonConvert.DeserializeObject<CheckCities>(responseBody);
                return tab;
            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("log-cities.log", true))
                {
                    writer.WriteLine(ex.ToString());
                }
                return null;
            }
        }

        public async Task<Contract> GetContractWithOrigine(string origine)
        {
            try
            {
                APIAdresse adresseOrigine = await ConvertAddressToCoordinates(origine);

                //recuperer les coordonnees [lat, long] du depart et de l'arrivee
                List<double> origine_coords = adresseOrigine.features[0].geometry.coordinates;

                //recuperer la ville de l'origine
                string villeOrigine = String.Empty;

                //get the two first digit of the citycode 
                int villeOrigine_CP = int.Parse(adresseOrigine.features[0].properties.citycode.Substring(0, 2));

                CheckCities checkCities_Origine = await this.GetCitiesFromCP(villeOrigine_CP);

                //verifier  que la ville d'origine possede une station jcdecaux
                List<string> jcDeceauxVilles = this.GetCities();


                int test = 0;
                foreach (City city in checkCities_Origine.cities)
                {
                    if (jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).Any())
                    {
                        villeOrigine = jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).First();
                        test++;
                        break;
                    }
                }

                if (test != 1)
                {
                    return null;
                }

                //trouver la station d'origine
                DynamicStation station_Origine = await this.GetStartStationWithDisponibleBikes(origine_coords, villeOrigine);
                
                Contract foundedContract = null;

                foreach(Contract c in contracts)
                {
                    if (c.name.Equals(station_Origine.contractName))
                    {
                        foundedContract = c;
                    }
                }

                return foundedContract;
            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("contractJcDecaux.log", true))
                {
                    writer.WriteLine(ex.ToString());
                }
                return null;
            }
        }

        public async Task<Contract> GetContractWithDestination(string destination)
        {
            try
            {
                APIAdresse adresseDestination = await ConvertAddressToCoordinates(destination);

                //recuperer les coordonnees [lat, long] de destination
                List<double> destination_coords = adresseDestination.features[0].geometry.coordinates;

                //recuperer la ville de destination
                string villeDestination = String.Empty;

                //get the two first digit of the citycode 
                int villeDestination_CP = int.Parse(adresseDestination.features[0].properties.citycode.Substring(0, 2));

                CheckCities checkCities_Destination = await this.GetCitiesFromCP(villeDestination_CP);

                //verifier  que la ville de destination possede une station jcdecaux
                List<string> jcDeceauxVilles = this.GetCities();


                int test = 0;
                foreach (City city in checkCities_Destination.cities)
                {
                    if (jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).Any())
                    {
                        villeDestination = jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).First();
                        test++;
                        break;
                    }
                }

                if (test != 1)
                {
                    return null;
                }

                //trouver la station de destination
                DynamicStation station_Destination = await this.GetStartStationWithDisponibleBikes(destination_coords, villeDestination);

                Contract foundedContract = null;

                foreach (Contract c in contracts)
                {
                    if (c.name.Equals(station_Destination.contractName))
                    {
                        foundedContract = c;
                    }
                }

                return foundedContract;
            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("contractJcDecaux.log", true))
                {
                    writer.WriteLine(ex.ToString());
                }
                return null;
            }
        }



        public async Task<Itineraire> GetItineraire(string depart, string arrivee)
        {
            try
            {
                APIAdresse adresseDepart = await ConvertAddressToCoordinates(depart);
                APIAdresse adresseArrivee = await ConvertAddressToCoordinates(arrivee);

                //recuperer les coordonnees [lat, long] du depart et de l'arrivee
                List<double> depart_coords = adresseDepart.features[0].geometry.coordinates;
                List<double> arrivee_coords = adresseArrivee.features[0].geometry.coordinates;

                //recuperer la ville de depart et d'arrivee
                string villeDepart = String.Empty;
                string villeArrivee = String.Empty;

                //get the two first digit of the citycode 
                int villeDepart_CP = int.Parse(adresseDepart.features[0].properties.citycode.Substring(0, 2));
                int villeArrivee_CP = int.Parse(adresseArrivee.features[0].properties.citycode.Substring(0, 2));

                CheckCities checkCities_D = await this.GetCitiesFromCP(villeDepart_CP);
                CheckCities checkCities_A = await this.GetCitiesFromCP(villeArrivee_CP);

                Console.WriteLine(villeDepart_CP);
                Console.WriteLine(villeArrivee_CP);

                //verifier  que les villes de depart et d'arrivee possedent des stations jcdecaux
                List<string> jcDeceauxVilles = this.GetCities();

                int test = 0;
                foreach (City city in checkCities_D.cities)
                {
                    if (jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).Any())
                    {
                        villeDepart = jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).First();
                        test++;
                        break;
                    }
                }

                foreach (City city in checkCities_A.cities)
                {
                    if (jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).Any())
                    {
                        villeArrivee = jcDeceauxVilles.Where(s => city.city.ToLower().IndexOf(s.ToLower()) != -1).First();
                        test++;
                        break;
                    }
                }

                if (test != 2)
                {
                    return null;
                }

                //trouver les stations de depart et d'arrivee
                DynamicStation station_depart = await this.GetStartStationWithDisponibleBikes(depart_coords, villeDepart);

                // OpenService position = [lng, lat]
                List<double> sD_coords = new List<double> { station_depart.position.longitude, station_depart.position.latitude };


                Itineraire route = new Itineraire();

                //itineraire entre depart et stationDepart
                OpenRouteService oprD_sD = await GetDirections(depart_coords, sD_coords, "foot-walking");

                //itiniraire entre depart et arrivee
                OpenRouteService oprD_A = await GetDirections(depart_coords, arrivee_coords, "foot-walking");

                if (oprD_sD.features[0].properties.summary.duration > oprD_A.features[0].properties.summary.duration)
                {
                    route.depart_arrivee = oprD_A;

                }
                else
                {
                    DynamicStation station_arrivee = await this.GetEndStationWithDisponibleStands(arrivee_coords, villeArrivee);
                    List<double> sA_coords = new List<double> { station_arrivee.position.longitude, station_arrivee.position.latitude };

                    //itineraire entre stationdepart et stationArrivee
                    OpenRouteService oprsD_sA = await GetDirections(sD_coords, sA_coords, "cycling-road");

                    //itineraire entre stationArrivee et arrivee
                    OpenRouteService oprsA_A = await GetDirections(sA_coords, arrivee_coords, "foot-walking");

                    route.depart_stationDepart = oprD_sD;
                    route.stationDepart_stationArrivee = oprsD_sA;
                    route.stationArrivee_arrivee = oprsA_A;
                    route.stationDepart = station_depart.name;
                    route.stationArrivee = station_arrivee.name;

                    //ajout de statistique
                    Statistique s1 = new Statistique(villeDepart, station_depart.name, Usage.DEPART);
                    Statistique s2 = new Statistique(villeArrivee, station_arrivee.name, Usage.ARRIVEE);
                    this.AddStatistique(s1);
                    this.AddStatistique(s2);
                }

                return route;

            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("log-itineraire.log", true))
                {
                    writer.WriteLine(ex.ToString());
                }
                return null;
            }
        }

        
        public StaticStation[] GetStations()
        {
            return this.stations;
        }

        public StaticStation[] GetStationsByContract(string contract)
        {
            return proxy.GetStationsByContract(contract);
        }


        public List<string> GetCities()
        {
            List<string> villes = new List<string>();

            foreach (Contract contract in this.contracts)
            {
                villes.Add(contract.name);
            }
            return villes;
        }

        
        public Contract[] GetContracts()
        {
            return contracts;
        }


        public async Task<APIAdresse> ConvertAddressToCoordinates(string address)
        {
            //appel a l'api adresse.data.gouv.fr pour retrouver les coordonnees d'une adresse
            HttpResponseMessage response = await client.GetAsync(ADDRESS_URL + "/search?q=" + address);
            response.EnsureSuccessStatusCode();
            var responseBody = await response.Content.ReadAsStringAsync();

            APIAdresse tab = JsonConvert.DeserializeObject<APIAdresse>(responseBody);

            return tab;
        }

        
        public async Task<DynamicStation> GetStartStationWithDisponibleBikes(List<double> depart_coords, string ville)
        {
            Position depart_position = new WebProxy.Position();
            depart_position.latitude = depart_coords[0];
            depart_position.longitude = depart_coords[1];

            StaticStation staticStation = null;

            //resuperer toutes les stations de la ville avec requete Linq
            List<WebProxy.StaticStation> ville_stations = this.stations.Where(station => station.contractName.ToLower() == ville).ToList();
            //recuperer les 40 premier stations si trop de stations
            if (ville_stations.Count > 40)
            {
                ville_stations = ville_stations.Take(40).ToList();
            }
            List<double> distances = await this.GetDistanceBetweenCoordinates(depart_position, ville_stations);

            DynamicStation dynamicStation = null;
            while (dynamicStation == null)
            {
                int index = distances.IndexOf(distances.Min());
                staticStation = ville_stations[index];
                dynamicStation = proxy.GetOneStation(staticStation.number, staticStation.contractName);

                if (dynamicStation.status == "OPEN" && dynamicStation.totalStands.availabilities.bikes > 0)
                    return dynamicStation;

                distances.RemoveAt(index);
                dynamicStation = null;
            }
            return null;
        }

       
        public async Task<WebProxy.DynamicStation> GetEndStationWithDisponibleStands(List<double> arrivee_coords, string ville)
        {
            WebProxy.Position arrivee_position = new WebProxy.Position();
            arrivee_position.latitude = arrivee_coords[0];
            arrivee_position.longitude = arrivee_coords[1];

            WebProxy.StaticStation staticStation = null;
            List<WebProxy.StaticStation> ville_stations = this.stations.Where(station => station.contractName.ToLower() == ville).ToList();

            
            if (ville_stations.Count > 40)
            {
                ville_stations = ville_stations.Take(40).ToList();
            }
            List<double> distances = await this.GetDistanceBetweenCoordinates(arrivee_position, ville_stations);


            DynamicStation dynamicStation = null;
            while (dynamicStation == null)
            {
                int index = distances.IndexOf(distances.Min());
                staticStation = ville_stations[index];
                dynamicStation = proxy.GetOneStation(staticStation.number, staticStation.contractName);

                if (dynamicStation.status == "OPEN" && dynamicStation.totalStands.availabilities.stands > 0)
                    return dynamicStation;

                distances.RemoveAt(index);
                dynamicStation = null;
            }
            return null;
        }

        
        private async Task<List<double>> GetDistanceBetweenCoordinates(WebProxy.Position initial, List<WebProxy.StaticStation> villeSt)
        {

            string p1_lat = initial.latitude.ToString(CultureInfo.InvariantCulture);
            string p1_lon = initial.longitude.ToString(CultureInfo.InvariantCulture);


            DistancePayload distancePayload = new DistancePayload();
            distancePayload.units = "km";
            distancePayload.metrics = new List<string> { "distance" };
            distancePayload.destinations = new List<int> { 0 };
            distancePayload.locations = new List<List<double>>();
            distancePayload.locations.Add(new List<double>() { initial.latitude, initial.longitude });

            foreach (var station in villeSt)
            {
                distancePayload.locations.Add(new List<double>() { station.position.longitude, station.position.latitude });
            }

            var payload = JsonConvert.SerializeObject(distancePayload);

            //var payload2 = "{\"locations\":[[" + p1_lat + "," + p1_lon + "],[" + p2_lon + "," + p2_lat + "]],\"metrics\":[\"distance\"],\"units\":\"km\"}";
            try
            {

                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", token);

                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

                HttpContent content = new StringContent(payload, Encoding.UTF8, "application/json");

                HttpResponseMessage response = await client.PostAsync(OpenServiceURL + "/matrix/foot-walking", content);
                response.EnsureSuccessStatusCode();
                var responseBody = await response.Content.ReadAsStringAsync();

                Distance distance = JsonConvert.DeserializeObject<Distance>(responseBody);
                Console.WriteLine("ds: " + distance.distances.Count);
                List<double> distances = new List<double>();
                for (var i = 1; i < distance.distances.Count; i++)
                {
                    distances.Add(distance.distances[i][0]);
                }
                Console.WriteLine("d: " + distances.Count);

                return distances;
            }
            catch (Exception ex)
            {
                using (StreamWriter writer = new StreamWriter("log-distances-coord.log", true))
                {
                    writer.WriteLine(ex.ToString());
                    writer.WriteLine(payload);
                }
                return null;
            }
        }


       
        public List<Statistique> GetStatistiques()
        {
            return statistiques;
        }

        
        private void AddStatistique(Statistique s)
        {
            statistiques.Add(s);
        }

        
    }
}
