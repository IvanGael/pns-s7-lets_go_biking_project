
package com.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfStatistique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatistique"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Statistique" type="{http://schemas.datacontract.org/2004/07/RoutingWithBikesHost}Statistique" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatistique", namespace = "http://schemas.datacontract.org/2004/07/RoutingWithBikesHost", propOrder = {
    "statistique"
})
public class ArrayOfStatistique {

    @XmlElement(name = "Statistique", nillable = true)
    protected List<Statistique> statistique;

    /**
     * Gets the value of the statistique property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statistique property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatistique().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statistique }
     * 
     * 
     */
    public List<Statistique> getStatistique() {
        if (statistique == null) {
            statistique = new ArrayList<Statistique>();
        }
        return this.statistique;
    }

}
