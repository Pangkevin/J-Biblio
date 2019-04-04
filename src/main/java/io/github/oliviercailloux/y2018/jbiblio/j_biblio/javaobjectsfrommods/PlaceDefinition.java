//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.31 à 09:33:29 AM CEST 
//


package io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour placeDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="placeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}placeTerm" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="supplied" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeDefinition", propOrder = {
    "placeTerm"
})
public class PlaceDefinition {

    @XmlElement(required = true)
    protected List<PlaceTermDefinition> placeTerm;
    @XmlAttribute(name = "supplied")
    protected YesDefinition supplied;

    /**
     * Gets the value of the placeTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceTermDefinition }
     * 
     * 
     */
    public List<PlaceTermDefinition> getPlaceTerm() {
        if (placeTerm == null) {
            placeTerm = new ArrayList<PlaceTermDefinition>();
        }
        return this.placeTerm;
    }

    /**
     * Obtient la valeur de la propriété supplied.
     * 
     * @return
     *     possible object is
     *     {@link YesDefinition }
     *     
     */
    public YesDefinition getSupplied() {
        return supplied;
    }

    /**
     * Définit la valeur de la propriété supplied.
     * 
     * @param value
     *     allowed object is
     *     {@link YesDefinition }
     *     
     */
    public void setSupplied(YesDefinition value) {
        this.supplied = value;
    }

}
