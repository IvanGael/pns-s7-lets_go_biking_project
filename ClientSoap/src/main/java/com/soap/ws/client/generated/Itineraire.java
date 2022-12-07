
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Itineraire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Itineraire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depart_arrivee" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI}OpenRouteService" minOccurs="0"/&gt;
 *         &lt;element name="depart_stationDepart" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI}OpenRouteService" minOccurs="0"/&gt;
 *         &lt;element name="stationArrivee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stationArrivee_arrivee" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI}OpenRouteService" minOccurs="0"/&gt;
 *         &lt;element name="stationDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stationDepart_stationArrivee" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI}OpenRouteService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itineraire", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", propOrder = {
    "departArrivee",
    "departStationDepart",
    "stationArrivee",
    "stationArriveeArrivee",
    "stationDepart",
    "stationDepartStationArrivee"
})
public class Itineraire {

    @XmlElementRef(name = "depart_arrivee", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenRouteService> departArrivee;
    @XmlElementRef(name = "depart_stationDepart", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenRouteService> departStationDepart;
    @XmlElementRef(name = "stationArrivee", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stationArrivee;
    @XmlElementRef(name = "stationArrivee_arrivee", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenRouteService> stationArriveeArrivee;
    @XmlElementRef(name = "stationDepart", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stationDepart;
    @XmlElementRef(name = "stationDepart_stationArrivee", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenRouteService> stationDepartStationArrivee;

    /**
     * Obtient la valeur de la propriété departArrivee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public JAXBElement<OpenRouteService> getDepartArrivee() {
        return departArrivee;
    }

    /**
     * Définit la valeur de la propriété departArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public void setDepartArrivee(JAXBElement<OpenRouteService> value) {
        this.departArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété departStationDepart.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public JAXBElement<OpenRouteService> getDepartStationDepart() {
        return departStationDepart;
    }

    /**
     * Définit la valeur de la propriété departStationDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public void setDepartStationDepart(JAXBElement<OpenRouteService> value) {
        this.departStationDepart = value;
    }

    /**
     * Obtient la valeur de la propriété stationArrivee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationArrivee() {
        return stationArrivee;
    }

    /**
     * Définit la valeur de la propriété stationArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationArrivee(JAXBElement<String> value) {
        this.stationArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété stationArriveeArrivee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public JAXBElement<OpenRouteService> getStationArriveeArrivee() {
        return stationArriveeArrivee;
    }

    /**
     * Définit la valeur de la propriété stationArriveeArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public void setStationArriveeArrivee(JAXBElement<OpenRouteService> value) {
        this.stationArriveeArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété stationDepart.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationDepart() {
        return stationDepart;
    }

    /**
     * Définit la valeur de la propriété stationDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationDepart(JAXBElement<String> value) {
        this.stationDepart = value;
    }

    /**
     * Obtient la valeur de la propriété stationDepartStationArrivee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public JAXBElement<OpenRouteService> getStationDepartStationArrivee() {
        return stationDepartStationArrivee;
    }

    /**
     * Définit la valeur de la propriété stationDepartStationArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenRouteService }{@code >}
     *     
     */
    public void setStationDepartStationArrivee(JAXBElement<OpenRouteService> value) {
        this.stationDepartStationArrivee = value;
    }

}
