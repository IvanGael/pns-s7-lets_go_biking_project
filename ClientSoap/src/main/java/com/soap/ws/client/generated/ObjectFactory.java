
package com.soap.ws.client.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Contract_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "Contract");
    private final static QName _ArrayOfStaticStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "ArrayOfStaticStation");
    private final static QName _StaticStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "StaticStation");
    private final static QName _Position_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "Position");
    private final static QName _ArrayOfContract_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "ArrayOfContract");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    private final static QName _ArrayOfArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfdouble");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _Itineraire_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Itineraire");
    private final static QName _OpenRouteService_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "OpenRouteService");
    private final static QName _ArrayOfFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "ArrayOfFeature");
    private final static QName _Feature_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Feature");
    private final static QName _Geometry_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Geometry");
    private final static QName _Properties_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Properties");
    private final static QName _ArrayOfSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "ArrayOfSegment");
    private final static QName _Segment_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Segment");
    private final static QName _ArrayOfStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "ArrayOfStep");
    private final static QName _Step_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Step");
    private final static QName _Summary_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "Summary");
    private final static QName _ArrayOfStatistique_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", "ArrayOfStatistique");
    private final static QName _Statistique_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", "Statistique");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetContractWithOrigineOrigine_QNAME = new QName("http://tempuri.org/", "origine");
    private final static QName _GetContractWithOrigineResponseGetContractWithOrigineResult_QNAME = new QName("http://tempuri.org/", "GetContractWithOrigineResult");
    private final static QName _GetContractWithDestinationDestination_QNAME = new QName("http://tempuri.org/", "destination");
    private final static QName _GetContractWithDestinationResponseGetContractWithDestinationResult_QNAME = new QName("http://tempuri.org/", "GetContractWithDestinationResult");
    private final static QName _GetStationsResponseGetStationsResult_QNAME = new QName("http://tempuri.org/", "GetStationsResult");
    private final static QName _GetStationsByContractContract_QNAME = new QName("http://tempuri.org/", "contract");
    private final static QName _GetStationsByContractResponseGetStationsByContractResult_QNAME = new QName("http://tempuri.org/", "GetStationsByContractResult");
    private final static QName _GetContractsResponseGetContractsResult_QNAME = new QName("http://tempuri.org/", "GetContractsResult");
    private final static QName _GetCitiesResponseGetCitiesResult_QNAME = new QName("http://tempuri.org/", "GetCitiesResult");
    private final static QName _GetItineraireDepart_QNAME = new QName("http://tempuri.org/", "depart");
    private final static QName _GetItineraireArrivee_QNAME = new QName("http://tempuri.org/", "arrivee");
    private final static QName _GetItineraireResponseGetItineraireResult_QNAME = new QName("http://tempuri.org/", "GetItineraireResult");
    private final static QName _GetStatistiquesResponseGetStatistiquesResult_QNAME = new QName("http://tempuri.org/", "GetStatistiquesResult");
    private final static QName _StatistiqueContractName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", "contractName");
    private final static QName _StatistiqueStationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", "stationName");
    private final static QName _StatistiqueUsage_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", "usage");
    private final static QName _StepInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "instruction");
    private final static QName _StepName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "name");
    private final static QName _StepWayPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "way_points");
    private final static QName _SegmentSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "steps");
    private final static QName _PropertiesSegments_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "segments");
    private final static QName _PropertiesSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "summary");
    private final static QName _GeometryCoordinates_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "coordinates");
    private final static QName _GeometryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "type");
    private final static QName _FeatureBbox_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "bbox");
    private final static QName _FeatureGeometry_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "geometry");
    private final static QName _FeatureProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "properties");
    private final static QName _OpenRouteServiceFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "features");
    private final static QName _StaticStationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "address");
    private final static QName _StaticStationContractName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "contractName");
    private final static QName _StaticStationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "name");
    private final static QName _StaticStationPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "position");
    private final static QName _ItineraireDepartArrivee_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "depart_arrivee");
    private final static QName _ItineraireDepartStationDepart_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "depart_stationDepart");
    private final static QName _ItineraireStationArrivee_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "stationArrivee");
    private final static QName _ItineraireStationArriveeArrivee_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "stationArrivee_arrivee");
    private final static QName _ItineraireStationDepart_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "stationDepart");
    private final static QName _ItineraireStationDepartStationArrivee_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", "stationDepart_stationArrivee");
    private final static QName _ContractCities_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "cities");
    private final static QName _ContractCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "commercial_name");
    private final static QName _ContractCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", "country_code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContractWithOrigine }
     * 
     */
    public GetContractWithOrigine createGetContractWithOrigine() {
        return new GetContractWithOrigine();
    }

    /**
     * Create an instance of {@link GetContractWithOrigineResponse }
     * 
     */
    public GetContractWithOrigineResponse createGetContractWithOrigineResponse() {
        return new GetContractWithOrigineResponse();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link GetContractWithDestination }
     * 
     */
    public GetContractWithDestination createGetContractWithDestination() {
        return new GetContractWithDestination();
    }

    /**
     * Create an instance of {@link GetContractWithDestinationResponse }
     * 
     */
    public GetContractWithDestinationResponse createGetContractWithDestinationResponse() {
        return new GetContractWithDestinationResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStaticStation }
     * 
     */
    public ArrayOfStaticStation createArrayOfStaticStation() {
        return new ArrayOfStaticStation();
    }

    /**
     * Create an instance of {@link GetStationsByContract }
     * 
     */
    public GetStationsByContract createGetStationsByContract() {
        return new GetStationsByContract();
    }

    /**
     * Create an instance of {@link GetStationsByContractResponse }
     * 
     */
    public GetStationsByContractResponse createGetStationsByContractResponse() {
        return new GetStationsByContractResponse();
    }

    /**
     * Create an instance of {@link GetContracts }
     * 
     */
    public GetContracts createGetContracts() {
        return new GetContracts();
    }

    /**
     * Create an instance of {@link GetContractsResponse }
     * 
     */
    public GetContractsResponse createGetContractsResponse() {
        return new GetContractsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContract }
     * 
     */
    public ArrayOfContract createArrayOfContract() {
        return new ArrayOfContract();
    }

    /**
     * Create an instance of {@link GetCities }
     * 
     */
    public GetCities createGetCities() {
        return new GetCities();
    }

    /**
     * Create an instance of {@link GetCitiesResponse }
     * 
     */
    public GetCitiesResponse createGetCitiesResponse() {
        return new GetCitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetItineraire }
     * 
     */
    public GetItineraire createGetItineraire() {
        return new GetItineraire();
    }

    /**
     * Create an instance of {@link GetItineraireResponse }
     * 
     */
    public GetItineraireResponse createGetItineraireResponse() {
        return new GetItineraireResponse();
    }

    /**
     * Create an instance of {@link Itineraire }
     * 
     */
    public Itineraire createItineraire() {
        return new Itineraire();
    }

    /**
     * Create an instance of {@link GetStatistiques }
     * 
     */
    public GetStatistiques createGetStatistiques() {
        return new GetStatistiques();
    }

    /**
     * Create an instance of {@link GetStatistiquesResponse }
     * 
     */
    public GetStatistiquesResponse createGetStatistiquesResponse() {
        return new GetStatistiquesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatistique }
     * 
     */
    public ArrayOfStatistique createArrayOfStatistique() {
        return new ArrayOfStatistique();
    }

    /**
     * Create an instance of {@link StaticStation }
     * 
     */
    public StaticStation createStaticStation() {
        return new StaticStation();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link ArrayOfdouble }
     * 
     */
    public ArrayOfdouble createArrayOfdouble() {
        return new ArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfdouble }
     * 
     */
    public ArrayOfArrayOfdouble createArrayOfArrayOfdouble() {
        return new ArrayOfArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link OpenRouteService }
     * 
     */
    public OpenRouteService createOpenRouteService() {
        return new OpenRouteService();
    }

    /**
     * Create an instance of {@link ArrayOfFeature }
     * 
     */
    public ArrayOfFeature createArrayOfFeature() {
        return new ArrayOfFeature();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new Geometry();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link ArrayOfSegment }
     * 
     */
    public ArrayOfSegment createArrayOfSegment() {
        return new ArrayOfSegment();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link ArrayOfStep }
     * 
     */
    public ArrayOfStep createArrayOfStep() {
        return new ArrayOfStep();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link Statistique }
     * 
     */
    public Statistique createStatistique() {
        return new Statistique();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "Contract")
    public JAXBElement<Contract> createContract(Contract value) {
        return new JAXBElement<Contract>(_Contract_QNAME, Contract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "ArrayOfStaticStation")
    public JAXBElement<ArrayOfStaticStation> createArrayOfStaticStation(ArrayOfStaticStation value) {
        return new JAXBElement<ArrayOfStaticStation>(_ArrayOfStaticStation_QNAME, ArrayOfStaticStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaticStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StaticStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "StaticStation")
    public JAXBElement<StaticStation> createStaticStation(StaticStation value) {
        return new JAXBElement<StaticStation>(_StaticStation_QNAME, StaticStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "Position")
    public JAXBElement<Position> createPosition(Position value) {
        return new JAXBElement<Position>(_Position_QNAME, Position.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfContract }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "ArrayOfContract")
    public JAXBElement<ArrayOfContract> createArrayOfContract(ArrayOfContract value) {
        return new JAXBElement<ArrayOfContract>(_ArrayOfContract_QNAME, ArrayOfContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdouble")
    public JAXBElement<ArrayOfdouble> createArrayOfdouble(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ArrayOfdouble_QNAME, ArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfdouble")
    public JAXBElement<ArrayOfArrayOfdouble> createArrayOfArrayOfdouble(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_ArrayOfArrayOfdouble_QNAME, ArrayOfArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Itineraire")
    public JAXBElement<Itineraire> createItineraire(Itineraire value) {
        return new JAXBElement<Itineraire>(_Itineraire_QNAME, Itineraire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "OpenRouteService")
    public JAXBElement<OpenRouteService> createOpenRouteService(OpenRouteService value) {
        return new JAXBElement<OpenRouteService>(_OpenRouteService_QNAME, OpenRouteService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "ArrayOfFeature")
    public JAXBElement<ArrayOfFeature> createArrayOfFeature(ArrayOfFeature value) {
        return new JAXBElement<ArrayOfFeature>(_ArrayOfFeature_QNAME, ArrayOfFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Feature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Feature }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Feature")
    public JAXBElement<Feature> createFeature(Feature value) {
        return new JAXBElement<Feature>(_Feature_QNAME, Feature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geometry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Geometry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Geometry")
    public JAXBElement<Geometry> createGeometry(Geometry value) {
        return new JAXBElement<Geometry>(_Geometry_QNAME, Geometry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Properties")
    public JAXBElement<Properties> createProperties(Properties value) {
        return new JAXBElement<Properties>(_Properties_QNAME, Properties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "ArrayOfSegment")
    public JAXBElement<ArrayOfSegment> createArrayOfSegment(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_ArrayOfSegment_QNAME, ArrayOfSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Segment")
    public JAXBElement<Segment> createSegment(Segment value) {
        return new JAXBElement<Segment>(_Segment_QNAME, Segment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "ArrayOfStep")
    public JAXBElement<ArrayOfStep> createArrayOfStep(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_ArrayOfStep_QNAME, ArrayOfStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Step")
    public JAXBElement<Step> createStep(Step value) {
        return new JAXBElement<Step>(_Step_QNAME, Step.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "Summary")
    public JAXBElement<Summary> createSummary(Summary value) {
        return new JAXBElement<Summary>(_Summary_QNAME, Summary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", name = "ArrayOfStatistique")
    public JAXBElement<ArrayOfStatistique> createArrayOfStatistique(ArrayOfStatistique value) {
        return new JAXBElement<ArrayOfStatistique>(_ArrayOfStatistique_QNAME, ArrayOfStatistique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Statistique }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Statistique }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", name = "Statistique")
    public JAXBElement<Statistique> createStatistique(Statistique value) {
        return new JAXBElement<Statistique>(_Statistique_QNAME, Statistique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origine", scope = GetContractWithOrigine.class)
    public JAXBElement<String> createGetContractWithOrigineOrigine(String value) {
        return new JAXBElement<String>(_GetContractWithOrigineOrigine_QNAME, String.class, GetContractWithOrigine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetContractWithOrigineResult", scope = GetContractWithOrigineResponse.class)
    public JAXBElement<Contract> createGetContractWithOrigineResponseGetContractWithOrigineResult(Contract value) {
        return new JAXBElement<Contract>(_GetContractWithOrigineResponseGetContractWithOrigineResult_QNAME, Contract.class, GetContractWithOrigineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetContractWithDestination.class)
    public JAXBElement<String> createGetContractWithDestinationDestination(String value) {
        return new JAXBElement<String>(_GetContractWithDestinationDestination_QNAME, String.class, GetContractWithDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetContractWithDestinationResult", scope = GetContractWithDestinationResponse.class)
    public JAXBElement<Contract> createGetContractWithDestinationResponseGetContractWithDestinationResult(Contract value) {
        return new JAXBElement<Contract>(_GetContractWithDestinationResponseGetContractWithDestinationResult_QNAME, Contract.class, GetContractWithDestinationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStationsResult", scope = GetStationsResponse.class)
    public JAXBElement<ArrayOfStaticStation> createGetStationsResponseGetStationsResult(ArrayOfStaticStation value) {
        return new JAXBElement<ArrayOfStaticStation>(_GetStationsResponseGetStationsResult_QNAME, ArrayOfStaticStation.class, GetStationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contract", scope = GetStationsByContract.class)
    public JAXBElement<String> createGetStationsByContractContract(String value) {
        return new JAXBElement<String>(_GetStationsByContractContract_QNAME, String.class, GetStationsByContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStaticStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStationsByContractResult", scope = GetStationsByContractResponse.class)
    public JAXBElement<ArrayOfStaticStation> createGetStationsByContractResponseGetStationsByContractResult(ArrayOfStaticStation value) {
        return new JAXBElement<ArrayOfStaticStation>(_GetStationsByContractResponseGetStationsByContractResult_QNAME, ArrayOfStaticStation.class, GetStationsByContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfContract }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetContractsResult", scope = GetContractsResponse.class)
    public JAXBElement<ArrayOfContract> createGetContractsResponseGetContractsResult(ArrayOfContract value) {
        return new JAXBElement<ArrayOfContract>(_GetContractsResponseGetContractsResult_QNAME, ArrayOfContract.class, GetContractsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCitiesResult", scope = GetCitiesResponse.class)
    public JAXBElement<ArrayOfstring> createGetCitiesResponseGetCitiesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCitiesResponseGetCitiesResult_QNAME, ArrayOfstring.class, GetCitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "depart", scope = GetItineraire.class)
    public JAXBElement<String> createGetItineraireDepart(String value) {
        return new JAXBElement<String>(_GetItineraireDepart_QNAME, String.class, GetItineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "arrivee", scope = GetItineraire.class)
    public JAXBElement<String> createGetItineraireArrivee(String value) {
        return new JAXBElement<String>(_GetItineraireArrivee_QNAME, String.class, GetItineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Itineraire }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetItineraireResult", scope = GetItineraireResponse.class)
    public JAXBElement<Itineraire> createGetItineraireResponseGetItineraireResult(Itineraire value) {
        return new JAXBElement<Itineraire>(_GetItineraireResponseGetItineraireResult_QNAME, Itineraire.class, GetItineraireResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatistiquesResult", scope = GetStatistiquesResponse.class)
    public JAXBElement<ArrayOfStatistique> createGetStatistiquesResponseGetStatistiquesResult(ArrayOfStatistique value) {
        return new JAXBElement<ArrayOfStatistique>(_GetStatistiquesResponseGetStatistiquesResult_QNAME, ArrayOfStatistique.class, GetStatistiquesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", name = "contractName", scope = Statistique.class)
    public JAXBElement<String> createStatistiqueContractName(String value) {
        return new JAXBElement<String>(_StatistiqueContractName_QNAME, String.class, Statistique.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", name = "stationName", scope = Statistique.class)
    public JAXBElement<String> createStatistiqueStationName(String value) {
        return new JAXBElement<String>(_StatistiqueStationName_QNAME, String.class, Statistique.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", name = "usage", scope = Statistique.class)
    public JAXBElement<String> createStatistiqueUsage(String value) {
        return new JAXBElement<String>(_StatistiqueUsage_QNAME, String.class, Statistique.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "instruction", scope = Step.class)
    public JAXBElement<String> createStepInstruction(String value) {
        return new JAXBElement<String>(_StepInstruction_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "name", scope = Step.class)
    public JAXBElement<String> createStepName(String value) {
        return new JAXBElement<String>(_StepName_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "way_points", scope = Step.class)
    public JAXBElement<ArrayOfint> createStepWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StepWayPoints_QNAME, ArrayOfint.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "steps", scope = Segment.class)
    public JAXBElement<ArrayOfStep> createSegmentSteps(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_SegmentSteps_QNAME, ArrayOfStep.class, Segment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "segments", scope = Properties.class)
    public JAXBElement<ArrayOfSegment> createPropertiesSegments(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_PropertiesSegments_QNAME, ArrayOfSegment.class, Properties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Summary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "summary", scope = Properties.class)
    public JAXBElement<Summary> createPropertiesSummary(Summary value) {
        return new JAXBElement<Summary>(_PropertiesSummary_QNAME, Summary.class, Properties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "way_points", scope = Properties.class)
    public JAXBElement<ArrayOfint> createPropertiesWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StepWayPoints_QNAME, ArrayOfint.class, Properties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "coordinates", scope = Geometry.class)
    public JAXBElement<ArrayOfArrayOfdouble> createGeometryCoordinates(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_GeometryCoordinates_QNAME, ArrayOfArrayOfdouble.class, Geometry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "type", scope = Geometry.class)
    public JAXBElement<String> createGeometryType(String value) {
        return new JAXBElement<String>(_GeometryType_QNAME, String.class, Geometry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "bbox", scope = Feature.class)
    public JAXBElement<ArrayOfdouble> createFeatureBbox(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_FeatureBbox_QNAME, ArrayOfdouble.class, Feature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geometry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Geometry }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "geometry", scope = Feature.class)
    public JAXBElement<Geometry> createFeatureGeometry(Geometry value) {
        return new JAXBElement<Geometry>(_FeatureGeometry_QNAME, Geometry.class, Feature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "properties", scope = Feature.class)
    public JAXBElement<Properties> createFeatureProperties(Properties value) {
        return new JAXBElement<Properties>(_FeatureProperties_QNAME, Properties.class, Feature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "type", scope = Feature.class)
    public JAXBElement<String> createFeatureType(String value) {
        return new JAXBElement<String>(_GeometryType_QNAME, String.class, Feature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "bbox", scope = OpenRouteService.class)
    public JAXBElement<ArrayOfdouble> createOpenRouteServiceBbox(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_FeatureBbox_QNAME, ArrayOfdouble.class, OpenRouteService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "features", scope = OpenRouteService.class)
    public JAXBElement<ArrayOfFeature> createOpenRouteServiceFeatures(ArrayOfFeature value) {
        return new JAXBElement<ArrayOfFeature>(_OpenRouteServiceFeatures_QNAME, ArrayOfFeature.class, OpenRouteService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "type", scope = OpenRouteService.class)
    public JAXBElement<String> createOpenRouteServiceType(String value) {
        return new JAXBElement<String>(_GeometryType_QNAME, String.class, OpenRouteService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "address", scope = StaticStation.class)
    public JAXBElement<String> createStaticStationAddress(String value) {
        return new JAXBElement<String>(_StaticStationAddress_QNAME, String.class, StaticStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "contractName", scope = StaticStation.class)
    public JAXBElement<String> createStaticStationContractName(String value) {
        return new JAXBElement<String>(_StaticStationContractName_QNAME, String.class, StaticStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "name", scope = StaticStation.class)
    public JAXBElement<String> createStaticStationName(String value) {
        return new JAXBElement<String>(_StaticStationName_QNAME, String.class, StaticStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "position", scope = StaticStation.class)
    public JAXBElement<Position> createStaticStationPosition(Position value) {
        return new JAXBElement<Position>(_StaticStationPosition_QNAME, Position.class, StaticStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "depart_arrivee", scope = Itineraire.class)
    public JAXBElement<OpenRouteService> createItineraireDepartArrivee(OpenRouteService value) {
        return new JAXBElement<OpenRouteService>(_ItineraireDepartArrivee_QNAME, OpenRouteService.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "depart_stationDepart", scope = Itineraire.class)
    public JAXBElement<OpenRouteService> createItineraireDepartStationDepart(OpenRouteService value) {
        return new JAXBElement<OpenRouteService>(_ItineraireDepartStationDepart_QNAME, OpenRouteService.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "stationArrivee", scope = Itineraire.class)
    public JAXBElement<String> createItineraireStationArrivee(String value) {
        return new JAXBElement<String>(_ItineraireStationArrivee_QNAME, String.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "stationArrivee_arrivee", scope = Itineraire.class)
    public JAXBElement<OpenRouteService> createItineraireStationArriveeArrivee(OpenRouteService value) {
        return new JAXBElement<OpenRouteService>(_ItineraireStationArriveeArrivee_QNAME, OpenRouteService.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "stationDepart", scope = Itineraire.class)
    public JAXBElement<String> createItineraireStationDepart(String value) {
        return new JAXBElement<String>(_ItineraireStationDepart_QNAME, String.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", name = "stationDepart_stationArrivee", scope = Itineraire.class)
    public JAXBElement<OpenRouteService> createItineraireStationDepartStationArrivee(OpenRouteService value) {
        return new JAXBElement<OpenRouteService>(_ItineraireStationDepartStationArrivee_QNAME, OpenRouteService.class, Itineraire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "cities", scope = Contract.class)
    public JAXBElement<ArrayOfstring> createContractCities(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ContractCities_QNAME, ArrayOfstring.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "commercial_name", scope = Contract.class)
    public JAXBElement<String> createContractCommercialName(String value) {
        return new JAXBElement<String>(_ContractCommercialName_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "country_code", scope = Contract.class)
    public JAXBElement<String> createContractCountryCode(String value) {
        return new JAXBElement<String>(_ContractCountryCode_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", name = "name", scope = Contract.class)
    public JAXBElement<String> createContractName(String value) {
        return new JAXBElement<String>(_StaticStationName_QNAME, String.class, Contract.class, value);
    }

}
