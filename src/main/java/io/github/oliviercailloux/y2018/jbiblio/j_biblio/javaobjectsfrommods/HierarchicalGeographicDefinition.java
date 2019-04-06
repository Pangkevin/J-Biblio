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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hierarchicalGeographicDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hierarchicalGeographicDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.loc.gov/mods/v3}extraterrestrialArea"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}continent"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}country"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}province"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}region"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}state"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}territory"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}county"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}city"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}citySection"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}island"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}area"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}authorityAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hierarchicalGeographicDefinition", propOrder = {
    "extraterrestrialAreaOrContinentOrCountry"
})
public class HierarchicalGeographicDefinition {

    @XmlElementRefs({
        @XmlElementRef(name = "country", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "territory", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "area", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "citySection", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "province", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "island", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "county", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extraterrestrialArea", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "region", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "continent", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "city", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "state", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<XsString>> extraterrestrialAreaOrContinentOrCountry;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;

    /**
     * Gets the value of the extraterrestrialAreaOrContinentOrCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraterrestrialAreaOrContinentOrCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraterrestrialAreaOrContinentOrCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * {@link JAXBElement }{@code <}{@link XsString }{@code >}
     * 
     * 
     */
    public List<JAXBElement<XsString>> getExtraterrestrialAreaOrContinentOrCountry() {
        if (extraterrestrialAreaOrContinentOrCountry == null) {
            extraterrestrialAreaOrContinentOrCountry = new ArrayList<JAXBElement<XsString>>();
        }
        return this.extraterrestrialAreaOrContinentOrCountry;
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
