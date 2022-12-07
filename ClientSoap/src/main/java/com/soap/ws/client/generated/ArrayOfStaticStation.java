
package com.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfStaticStation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStaticStation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StaticStation" type="{http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects}StaticStation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStaticStation", namespace = "http://schemas.datacontract.org/2004/07/WebProxyService.ReferenceObjects", propOrder = {
    "staticStation"
})
public class ArrayOfStaticStation {

    @XmlElement(name = "StaticStation", nillable = true)
    protected List<StaticStation> staticStation;

    /**
     * Gets the value of the staticStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticStation }
     * 
     * 
     */
    public List<StaticStation> getStaticStation() {
        if (staticStation == null) {
            staticStation = new ArrayList<StaticStation>();
        }
        return this.staticStation;
    }

}
