
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OpenRouteService complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OpenRouteService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bbox" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdouble" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI}ArrayOfFeature" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenRouteService", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", propOrder = {
    "bbox",
    "features",
    "type"
})
public class OpenRouteService {

    @XmlElementRef(name = "bbox", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdouble> bbox;
    @XmlElementRef(name = "features", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeature> features;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost.OpenRouteServiceAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * Obtient la valeur de la propriété bbox.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdouble> getBbox() {
        return bbox;
    }

    /**
     * Définit la valeur de la propriété bbox.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public void setBbox(JAXBElement<ArrayOfdouble> value) {
        this.bbox = value;
    }

    /**
     * Obtient la valeur de la propriété features.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeature> getFeatures() {
        return features;
    }

    /**
     * Définit la valeur de la propriété features.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeature }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfFeature> value) {
        this.features = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}
