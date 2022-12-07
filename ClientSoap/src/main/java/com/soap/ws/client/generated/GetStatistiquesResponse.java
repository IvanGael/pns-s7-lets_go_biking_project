
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetStatistiquesResult" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost}ArrayOfStatistique" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStatistiquesResult"
})
@XmlRootElement(name = "GetStatistiquesResponse")
public class GetStatistiquesResponse {

    @XmlElementRef(name = "GetStatistiquesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatistique> getStatistiquesResult;

    /**
     * Obtient la valeur de la propriété getStatistiquesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatistique> getGetStatistiquesResult() {
        return getStatistiquesResult;
    }

    /**
     * Définit la valeur de la propriété getStatistiquesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatistique }{@code >}
     *     
     */
    public void setGetStatistiquesResult(JAXBElement<ArrayOfStatistique> value) {
        this.getStatistiquesResult = value;
    }

}
