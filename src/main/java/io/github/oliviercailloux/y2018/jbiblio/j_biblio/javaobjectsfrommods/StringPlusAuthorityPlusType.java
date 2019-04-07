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
 * <p>Classe Java pour stringPlusAuthorityPlusType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="stringPlusAuthorityPlusType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusAuthority">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringPlusAuthorityPlusType")
@XmlSeeAlso({
    StringPlusAuthorityPlusTypePlusDisplayLabel.class
})
public class StringPlusAuthorityPlusType
    extends StringPlusAuthority
{

    @XmlAttribute(name = "type")
    protected String type8;

    /**
     * Obtient la valeur de la propriété type8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType8() {
        return type8;
    }

    /**
     * Définit la valeur de la propriété type8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType8(String value) {
        this.type8 = value;
    }

}
