
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
 *         &lt;element name="GetContractWithOrigineResult" type="{http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects}Contract" minOccurs="0"/&gt;
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
    "getContractWithOrigineResult"
})
@XmlRootElement(name = "GetContractWithOrigineResponse")
public class GetContractWithOrigineResponse {

    @XmlElementRef(name = "GetContractWithOrigineResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Contract> getContractWithOrigineResult;

    /**
     * Obtient la valeur de la propriété getContractWithOrigineResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contract }{@code >}
     *     
     */
    public JAXBElement<Contract> getGetContractWithOrigineResult() {
        return getContractWithOrigineResult;
    }

    /**
     * Définit la valeur de la propriété getContractWithOrigineResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contract }{@code >}
     *     
     */
    public void setGetContractWithOrigineResult(JAXBElement<Contract> value) {
        this.getContractWithOrigineResult = value;
    }

}
