//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.31 à 09:33:29 AM CEST 
//


package io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour typeOfResourceDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeOfResourceDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>resourceTypeDefinition">
 *       &lt;attribute name="collection" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *       &lt;attribute name="manuscript" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usage" type="{http://www.loc.gov/mods/v3}usageAttributeDefinition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOfResourceDefinition", propOrder = {
    "value"
})
public class TypeOfResourceDefinition {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "collection")
    protected YesDefinition collection;
    @XmlAttribute(name = "manuscript")
    protected YesDefinition manuscript;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "usage")
    protected UsageAttributeDefinition usage;

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propriété collection.
     * 
     * @return
     *     possible object is
     *     {@link YesDefinition }
     *     
     */
    public YesDefinition getCollection() {
        return collection;
    }

    /**
     * Définit la valeur de la propriété collection.
     * 
     * @param value
     *     allowed object is
     *     {@link YesDefinition }
     *     
     */
    public void setCollection(YesDefinition value) {
        this.collection = value;
    }

    /**
     * Obtient la valeur de la propriété manuscript.
     * 
     * @return
     *     possible object is
     *     {@link YesDefinition }
     *     
     */
    public YesDefinition getManuscript() {
        return manuscript;
    }

    /**
     * Définit la valeur de la propriété manuscript.
     * 
     * @param value
     *     allowed object is
     *     {@link YesDefinition }
     *     
     */
    public void setManuscript(YesDefinition value) {
        this.manuscript = value;
    }

    /**
     * Obtient la valeur de la propriété displayLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Définit la valeur de la propriété displayLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabel(String value) {
        this.displayLabel = value;
    }

    /**
     * Obtient la valeur de la propriété altRepGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRepGroup() {
        return altRepGroup;
    }

    /**
     * Définit la valeur de la propriété altRepGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRepGroup(String value) {
        this.altRepGroup = value;
    }

    /**
     * Obtient la valeur de la propriété usage.
     * 
     * @return
     *     possible object is
     *     {@link UsageAttributeDefinition }
     *     
     */
    public UsageAttributeDefinition getUsage() {
        return usage;
    }

    /**
     * Définit la valeur de la propriété usage.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageAttributeDefinition }
     *     
     */
    public void setUsage(UsageAttributeDefinition value) {
        this.usage = value;
    }

}
