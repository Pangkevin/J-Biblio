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
 * <p>Classe Java pour dateDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dateDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>dateBaseDefinition">
 *       &lt;attribute name="keyDate" type="{http://www.loc.gov/mods/v3}yesDefinition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateDefinition")
@XmlSeeAlso({
    TemporalDefinition.class,
    DateOtherDefinition.class
})
public class DateDefinition
    extends DateBaseDefinition
{

    @XmlAttribute(name = "keyDate")
    protected YesDefinition keyDate;

    /**
     * Obtient la valeur de la propriété keyDate.
     * 
     * @return
     *     possible object is
     *     {@link YesDefinition }
     *     
     */
    public YesDefinition getKeyDate() {
        return keyDate;
    }

    /**
     * Définit la valeur de la propriété keyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link YesDefinition }
     *     
     */
    public void setKeyDate(YesDefinition value) {
        this.keyDate = value;
    }

}
