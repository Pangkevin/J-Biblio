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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour dateBaseDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dateBaseDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>xsString">
 *       &lt;attribute name="encoding" type="{http://www.loc.gov/mods/v3}dateEncodingAttributeDefinition" />
 *       &lt;attribute name="qualifier" type="{http://www.loc.gov/mods/v3}dateQualifierAttributeDefinition" />
 *       &lt;attribute name="point" type="{http://www.loc.gov/mods/v3}datePointAttributeDefinition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateBaseDefinition")
@XmlSeeAlso({
    DateDefinition.class
})
public class DateBaseDefinition
    extends XsString
{

    @XmlAttribute(name = "encoding")
    protected DateEncodingAttributeDefinition encoding;
    @XmlAttribute(name = "qualifier")
    protected DateQualifierAttributeDefinition qualifier;
    @XmlAttribute(name = "point")
    protected DatePointAttributeDefinition point;

    /**
     * Obtient la valeur de la propriété encoding.
     * 
     * @return
     *     possible object is
     *     {@link DateEncodingAttributeDefinition }
     *     
     */
    public DateEncodingAttributeDefinition getEncoding() {
        return encoding;
    }

    /**
     * Définit la valeur de la propriété encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link DateEncodingAttributeDefinition }
     *     
     */
    public void setEncoding(DateEncodingAttributeDefinition value) {
        this.encoding = value;
    }

    /**
     * Obtient la valeur de la propriété qualifier.
     * 
     * @return
     *     possible object is
     *     {@link DateQualifierAttributeDefinition }
     *     
     */
    public DateQualifierAttributeDefinition getQualifier() {
        return qualifier;
    }

    /**
     * Définit la valeur de la propriété qualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link DateQualifierAttributeDefinition }
     *     
     */
    public void setQualifier(DateQualifierAttributeDefinition value) {
        this.qualifier = value;
    }

    /**
     * Obtient la valeur de la propriété point.
     * 
     * @return
     *     possible object is
     *     {@link DatePointAttributeDefinition }
     *     
     */
    public DatePointAttributeDefinition getPoint() {
        return point;
    }

    /**
     * Définit la valeur de la propriété point.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePointAttributeDefinition }
     *     
     */
    public void setPoint(DatePointAttributeDefinition value) {
        this.point = value;
    }

}
