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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cartographicsDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cartographicsDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}scale" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}projection" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}coordinates" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}authorityAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartographicsDefinition", propOrder = {
    "scale",
    "projection",
    "coordinates"
})
public class CartographicsDefinition {

    protected XsString scale;
    protected XsString projection;
    protected List<XsString> coordinates;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;

    /**
     * Obtient la valeur de la propriété scale.
     * 
     * @return
     *     possible object is
     *     {@link XsString }
     *     
     */
    public XsString getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     * 
     * @param value
     *     allowed object is
     *     {@link XsString }
     *     
     */
    public void setScale(XsString value) {
        this.scale = value;
    }

    /**
     * Obtient la valeur de la propriété projection.
     * 
     * @return
     *     possible object is
     *     {@link XsString }
     *     
     */
    public XsString getProjection() {
        return projection;
    }

    /**
     * Définit la valeur de la propriété projection.
     * 
     * @param value
     *     allowed object is
     *     {@link XsString }
     *     
     */
    public void setProjection(XsString value) {
        this.projection = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsString }
     * 
     * 
     */
    public List<XsString> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<XsString>();
        }
        return this.coordinates;
    }

    /**
     * Obtient la valeur de la propriété authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Définit la valeur de la propriété authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Obtient la valeur de la propriété authorityURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityURI() {
        return authorityURI;
    }

    /**
     * Définit la valeur de la propriété authorityURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityURI(String value) {
        this.authorityURI = value;
    }

    /**
     * Obtient la valeur de la propriété valueURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueURI() {
        return valueURI;
    }

    /**
     * Définit la valeur de la propriété valueURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueURI(String value) {
        this.valueURI = value;
    }

}
