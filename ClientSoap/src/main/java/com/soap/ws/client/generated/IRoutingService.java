
package com.soap.ws.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRoutingService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRoutingService {


    /**
     * 
     * @param origine
     * @return
     *     returns com.soap.ws.client.generated.Contract
     */
    @WebMethod(operationName = "GetContractWithOrigine", action = "http://tempuri.org/IRoutingService/GetContractWithOrigine")
    @WebResult(name = "GetContractWithOrigineResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContractWithOrigine", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContractWithOrigine")
    @ResponseWrapper(localName = "GetContractWithOrigineResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContractWithOrigineResponse")
    public Contract getContractWithOrigine(
        @WebParam(name = "origine", targetNamespace = "http://tempuri.org/")
        String origine);

    /**
     * 
     * @param destination
     * @return
     *     returns com.soap.ws.client.generated.Contract
     */
    @WebMethod(operationName = "GetContractWithDestination", action = "http://tempuri.org/IRoutingService/GetContractWithDestination")
    @WebResult(name = "GetContractWithDestinationResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContractWithDestination", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContractWithDestination")
    @ResponseWrapper(localName = "GetContractWithDestinationResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContractWithDestinationResponse")
    public Contract getContractWithDestination(
        @WebParam(name = "destination", targetNamespace = "http://tempuri.org/")
        String destination);

    /**
     * 
     * @return
     *     returns com.soap.ws.client.generated.ArrayOfStaticStation
     */
    @WebMethod(operationName = "GetStations", action = "http://tempuri.org/IRoutingService/GetStations")
    @WebResult(name = "GetStationsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetStations", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStations")
    @ResponseWrapper(localName = "GetStationsResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStationsResponse")
    public ArrayOfStaticStation getStations();

    /**
     * 
     * @param contract
     * @return
     *     returns com.soap.ws.client.generated.ArrayOfStaticStation
     */
    @WebMethod(operationName = "GetStationsByContract", action = "http://tempuri.org/IRoutingService/GetStationsByContract")
    @WebResult(name = "GetStationsByContractResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetStationsByContract", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStationsByContract")
    @ResponseWrapper(localName = "GetStationsByContractResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStationsByContractResponse")
    public ArrayOfStaticStation getStationsByContract(
        @WebParam(name = "contract", targetNamespace = "http://tempuri.org/")
        String contract);

    /**
     * 
     * @return
     *     returns com.soap.ws.client.generated.ArrayOfContract
     */
    @WebMethod(operationName = "GetContracts", action = "http://tempuri.org/IRoutingService/GetContracts")
    @WebResult(name = "GetContractsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContracts", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContracts")
    @ResponseWrapper(localName = "GetContractsResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetContractsResponse")
    public ArrayOfContract getContracts();

    /**
     * 
     * @return
     *     returns com.soap.ws.client.generated.ArrayOfstring
     */
    @WebMethod(operationName = "GetCities", action = "http://tempuri.org/IRoutingService/GetCities")
    @WebResult(name = "GetCitiesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCities", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetCities")
    @ResponseWrapper(localName = "GetCitiesResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetCitiesResponse")
    public ArrayOfstring getCities();

    /**
     * 
     * @param arrivee
     * @param depart
     * @return
     *     returns com.soap.ws.client.generated.Itineraire
     */
    @WebMethod(operationName = "GetItineraire", action = "http://tempuri.org/IRoutingService/GetItineraire")
    @WebResult(name = "GetItineraireResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetItineraire", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetItineraire")
    @ResponseWrapper(localName = "GetItineraireResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetItineraireResponse")
    public Itineraire getItineraire(
        @WebParam(name = "depart", targetNamespace = "http://tempuri.org/")
        String depart,
        @WebParam(name = "arrivee", targetNamespace = "http://tempuri.org/")
        String arrivee);

    /**
     * 
     * @return
     *     returns com.soap.ws.client.generated.ArrayOfStatistique
     */
    @WebMethod(operationName = "GetStatistiques", action = "http://tempuri.org/IRoutingService/GetStatistiques")
    @WebResult(name = "GetStatistiquesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetStatistiques", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStatistiques")
    @ResponseWrapper(localName = "GetStatistiquesResponse", targetNamespace = "http://tempuri.org/", className = "com.soap.ws.client.generated.GetStatistiquesResponse")
    public ArrayOfStatistique getStatistiques();

}