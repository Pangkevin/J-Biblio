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
 * <p>Classe Java pour stringPlusSupplied complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="stringPlusSupplied">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>xsString">
 *       &lt;attribute name="supplied" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stringPlusSupplied")
public class StringPlusSupplied
    extends XsString
{

    @XmlAttribute(name = "supplied")
    protected YesDefinition supplied;

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

}
