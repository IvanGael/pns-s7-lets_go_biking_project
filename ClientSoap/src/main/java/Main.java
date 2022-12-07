import com.soap.ws.client.generated.*;
import utils.TableList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcome();
        System.out.println("-----------------------------------");
        System.out.println(" Obtenir un itinéraire ");
        System.out.println("-----------------------------------");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        RoutingService routingService = new RoutingService();
        IRoutingService iRoutingService = routingService.getBasicHttpBindingIRoutingService();


        System.out.print("Entrez une origine : ");
        String origine = sc.next();
        System.out.print("Entrez une destination : ");
        String destination = sc.next();


        System.out.println("...recherche en cours...");
        Itineraire it = iRoutingService.getItineraire(origine, destination);

        if(it == null){
            System.err.println("Aucun itinéraire trouvé!");
        }
        else {
            String stationDepart = it.getStationDepart().getValue();
            String stationArrive = it.getStationArrivee().getValue();
            OpenRouteService StationDepartStationArrivee =  it.getStationDepartStationArrivee().getValue();
            List<Feature> featureList = StationDepartStationArrivee.getFeatures().getValue().getFeature();


            TableList tl = new TableList(2, "Station_Depart", "Station_Arrivee").sortBy(0).withUnicode(true);
            tl.addRow(stationDepart, stationArrive);
            System.out.println("%%%% -----RESULTATS----------------------------- %%%%");
            tl.print();
            for(Feature feature : featureList){
                System.out.println("Points de coordonnées entre Station_Depart et Station_Arrivee (Lat,Lon)");
                for(ArrayOfdouble arrayOfdouble : feature.getGeometry().getValue().getCoordinates().getValue().getArrayOfdouble()){
                    System.out.println(arrayOfdouble.getDouble());
                }
            }
            System.out.println("%%%% ------------------------------------------- %%%%");
        }


    }

    public static void welcome(){
        for (int i=0; i<6; i++){
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("LET'S GO BIKING");
        for (int i=0; i<6; i++){
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("\n");
    }
}
