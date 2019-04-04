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


/**
 * <p>Classe Java pour geographicCodeDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="geographicCodeDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>xsString">
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}placeAuthorityAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geographicCodeDefinition")
public class GeographicCodeDefinition
    extends XsString
{

    @XmlAttribute(name = "authority")
    protected PlaceAuthorityAttributeDefinition authority;
    @XmlAttribute(name = "authorityURI")
    @XmlSchemaType(name = "anyURI")
    protected String authorityURI;
    @XmlAttribute(name = "valueURI")
    @XmlSchemaType(name = "anyURI")
    protected String valueURI;

    /**
     * Obtient la valeur de la propriété authority.
     * 
     * @return
     *     possible object is
     *     {@link PlaceAuthorityAttributeDefinition }
     *     
     */
    public PlaceAuthorityAttributeDefinition getAuthority() {
        return authority;
    }

    /**
     * Définit la valeur de la propriété authority.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceAuthorityAttributeDefinition }
     *     
     */
    public void setAuthority(PlaceAuthorityAttributeDefinition value) {
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
