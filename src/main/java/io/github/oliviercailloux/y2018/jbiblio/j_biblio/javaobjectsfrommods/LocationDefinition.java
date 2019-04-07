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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour locationDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="locationDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}physicalLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}url" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingSimple" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingExternal" minOccurs="0"/>
 *       &lt;/sequence>
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
@XmlType(name = "locationDefinition", propOrder = {
    "physicalLocation",
    "shelfLocator",
    "url",
    "holdingSimple",
    "holdingExternal"
})
public class LocationDefinition {

    protected List<PhysicalLocationDefinition> physicalLocation;
    protected List<XsString> shelfLocator;
    protected List<UrlDefinition> url;
    protected HoldingSimpleDefinition holdingSimple;
    protected ExtensionDefinition holdingExternal;
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
     * Gets the value of the physicalLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalLocationDefinition }
     * 
     * 
     */
    public List<PhysicalLocationDefinition> getPhysicalLocation() {
        if (physicalLocation == null) {
            physicalLocation = new ArrayList<PhysicalLocationDefinition>();
        }
        return this.physicalLocation;
    }

    /**
     * Gets the value of the shelfLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelfLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelfLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsString }
     * 
     * 
     */
    public List<XsString> getShelfLocator() {
        if (shelfLocator == null) {
            shelfLocator = new ArrayList<XsString>();
        }
        return this.shelfLocator;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlDefinition }
     * 
     * 
     */
    public List<UrlDefinition> getUrl() {
        if (url == null) {
            url = new ArrayList<UrlDefinition>();
        }
        return this.url;
    }

    /**
     * Obtient la valeur de la propriété holdingSimple.
     * 
     * @return
     *     possible object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public HoldingSimpleDefinition getHoldingSimple() {
        return holdingSimple;
    }

    /**
     * Définit la valeur de la propriété holdingSimple.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public void setHoldingSimple(HoldingSimpleDefinition value) {
        this.holdingSimple = value;
    }

    /**
     * Obtient la valeur de la propriété holdingExternal.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getHoldingExternal() {
        return holdingExternal;
    }

    /**
     * Définit la valeur de la propriété holdingExternal.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setHoldingExternal(ExtensionDefinition value) {
        this.holdingExternal = value;
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
