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
 * <p>Classe Java pour abstractDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="abstractDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>unstructuredTextDefinition">
 *       &lt;attribute name="shareable" type="{http://www.loc.gov/mods/v3}noDefinition" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractDefinition")
public class AbstractDefinition
    extends UnstructuredTextDefinition
{

    @XmlAttribute(name = "shareable")
    protected NoDefinition shareable;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;

    /**
     * Obtient la valeur de la propriété shareable.
     * 
     * @return
     *     possible object is
     *     {@link NoDefinition }
     *     
     */
    public NoDefinition getShareable() {
        return shareable;
    }

    /**
     * Définit la valeur de la propriété shareable.
     * 
     * @param value
     *     allowed object is
     *     {@link NoDefinition }
     *     
     */
    public void setShareable(NoDefinition value) {
        this.shareable = value;
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

}
