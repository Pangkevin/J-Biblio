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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour copyInformationDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="copyInformationDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}form" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}subLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}electronicLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.loc.gov/mods/v3}noteBaseDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}enumerationAndChronology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyInformationDefinition", propOrder = {
    "form",
    "subLocation",
    "shelfLocator",
    "electronicLocator",
    "note",
    "enumerationAndChronology"
})
public class CopyInformationDefinition {

    protected StringPlusAuthorityPlusType form;
    protected List<XsString> subLocation;
    protected List<XsString> shelfLocator;
    protected List<XsString> electronicLocator;
    protected List<NoteBaseDefinition> note;
    protected List<EnumerationAndChronologyDefinition> enumerationAndChronology;

    /**
     * Obtient la valeur de la propriété form.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthorityPlusType }
     *     
     */
    public StringPlusAuthorityPlusType getForm() {
        return form;
    }

    /**
     * Définit la valeur de la propriété form.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthorityPlusType }
     *     
     */
    public void setForm(StringPlusAuthorityPlusType value) {
        this.form = value;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsString }
     * 
     * 
     */
    public List<XsString> getSubLocation() {
        if (subLocation == null) {
            subLocation = new ArrayList<XsString>();
        }
        return this.subLocation;
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
     * Gets the value of the electronicLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsString }
     * 
     * 
     */
    public List<XsString> getElectronicLocator() {
        if (electronicLocator == null) {
            electronicLocator = new ArrayList<XsString>();
        }
        return this.electronicLocator;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteBaseDefinition }
     * 
     * 
     */
    public List<NoteBaseDefinition> getNote() {
        if (note == null) {
            note = new ArrayList<NoteBaseDefinition>();
        }
        return this.note;
    }

    /**
     * Gets the value of the enumerationAndChronology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationAndChronology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationAndChronology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationAndChronologyDefinition }
     * 
     * 
     */
    public List<EnumerationAndChronologyDefinition> getEnumerationAndChronology() {
        if (enumerationAndChronology == null) {
            enumerationAndChronology = new ArrayList<EnumerationAndChronologyDefinition>();
        }
        return this.enumerationAndChronology;
    }

}
