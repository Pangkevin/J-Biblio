//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.31 à 09:33:29 AM CEST 
//


package io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour originInfoDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="originInfoDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.loc.gov/mods/v3}place"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}publisher"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateIssued"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateCreated"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateCaptured"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateValid"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateModified"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}copyrightDate"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}dateOther"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}edition"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}issuance"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}frequency"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languagePlusDisplayLabelAttributeGroup"/>
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "originInfoDefinition", propOrder = {
    "placeOrPublisherOrDateIssued"
})
public class OriginInfoDefinition {

    @XmlElementRefs({
        @XmlElementRef(name = "dateCreated", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "issuance", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateIssued", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateOther", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "edition", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateValid", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publisher", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "copyrightDate", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateCaptured", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "frequency", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "place", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateModified", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> placeOrPublisherOrDateIssued;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "lang")
    protected String lang2;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Gets the value of the placeOrPublisherOrDateIssued property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeOrPublisherOrDateIssued property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceOrPublisherOrDateIssued().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link IssuanceDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link DateOtherDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusSupplied }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusSupplied }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusAuthority }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link DateDefinition }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPlaceOrPublisherOrDateIssued() {
        if (placeOrPublisherOrDateIssued == null) {
            placeOrPublisherOrDateIssued = new ArrayList<JAXBElement<?>>();
        }
        return this.placeOrPublisherOrDateIssued;
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
     * Obtient la valeur de la propriété lang2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang2() {
        return lang2;
    }

    /**
     * Définit la valeur de la propriété lang2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang2(String value) {
        this.lang2 = value;
    }

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Obtient la valeur de la propriété script.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Définit la valeur de la propriété script.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Obtient la valeur de la propriété transliteration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Définit la valeur de la propriété transliteration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }

}
