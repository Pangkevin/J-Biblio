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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour urlDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="urlDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="dateLastAccessed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="access" type="{http://www.loc.gov/mods/v3}urlAccessAttributeDefinition" />
 *       &lt;attribute name="usage" type="{http://www.loc.gov/mods/v3}urlUsageAttributeDefinition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urlDefinition", propOrder = {
    "value"
})
public class UrlDefinition {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "dateLastAccessed")
    protected String dateLastAccessed;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "access")
    protected UrlAccessAttributeDefinition access;
    @XmlAttribute(name = "usage")
    protected UrlUsageAttributeDefinition usage;

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
     * Obtient la valeur de la propriété dateLastAccessed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastAccessed() {
        return dateLastAccessed;
    }

    /**
     * Définit la valeur de la propriété dateLastAccessed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastAccessed(String value) {
        this.dateLastAccessed = value;
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
     * Obtient la valeur de la propriété note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtient la valeur de la propriété access.
     * 
     * @return
     *     possible object is
     *     {@link UrlAccessAttributeDefinition }
     *     
     */
    public UrlAccessAttributeDefinition getAccess() {
        return access;
    }

    /**
     * Définit la valeur de la propriété access.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlAccessAttributeDefinition }
     *     
     */
    public void setAccess(UrlAccessAttributeDefinition value) {
        this.access = value;
    }

    /**
     * Obtient la valeur de la propriété usage.
     * 
     * @return
     *     possible object is
     *     {@link UrlUsageAttributeDefinition }
     *     
     */
    public UrlUsageAttributeDefinition getUsage() {
        return usage;
    }

    /**
     * Définit la valeur de la propriété usage.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlUsageAttributeDefinition }
     *     
     */
    public void setUsage(UrlUsageAttributeDefinition value) {
        this.usage = value;
    }

}
