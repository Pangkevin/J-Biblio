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


/**
 * <p>Classe Java pour titleInfoDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="titleInfoDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/mods/v3}titleInfoBaseDefinition">
 *       &lt;attribute name="type" type="{http://www.loc.gov/mods/v3}titleInfoTypeAttributeDefinition" />
 *       &lt;attribute name="supplied" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nameTitleGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usage" type="{http://www.loc.gov/mods/v3}usageAttributeDefinition" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titleInfoDefinition")
public class TitleInfoDefinition
    extends TitleInfoBaseDefinition
{

    @XmlAttribute(name = "type")
    protected TitleInfoTypeAttributeDefinition type2;
    @XmlAttribute(name = "supplied")
    protected YesDefinition supplied;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "nameTitleGroup")
    protected String nameTitleGroup;
    @XmlAttribute(name = "usage")
    protected UsageAttributeDefinition usage;

    /**
     * Obtient la valeur de la propriété type2.
     * 
     * @return
     *     possible object is
     *     {@link TitleInfoTypeAttributeDefinition }
     *     
     */
    public TitleInfoTypeAttributeDefinition getType2() {
        return type2;
    }

    /**
     * Définit la valeur de la propriété type2.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleInfoTypeAttributeDefinition }
     *     
     */
    public void setType2(TitleInfoTypeAttributeDefinition value) {
        this.type2 = value;
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
     * Obtient la valeur de la propriété nameTitleGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitleGroup() {
        return nameTitleGroup;
    }

    /**
     * Définit la valeur de la propriété nameTitleGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitleGroup(String value) {
        this.nameTitleGroup = value;
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
