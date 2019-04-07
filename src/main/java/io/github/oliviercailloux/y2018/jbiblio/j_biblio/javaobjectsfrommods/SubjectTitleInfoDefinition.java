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
 * <p>Classe Java pour subjectTitleInfoDefinition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="subjectTitleInfoDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/mods/v3}titleInfoBaseDefinition">
 *       &lt;attribute name="type" type="{http://www.loc.gov/mods/v3}titleInfoTypeAttributeDefinition" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjectTitleInfoDefinition")
public class SubjectTitleInfoDefinition
    extends TitleInfoBaseDefinition
{

    @XmlAttribute(name = "type")
    protected TitleInfoTypeAttributeDefinition type9;

    /**
     * Obtient la valeur de la propriété type9.
     * 
     * @return
     *     possible object is
     *     {@link TitleInfoTypeAttributeDefinition }
     *     
     */
    public TitleInfoTypeAttributeDefinition getType9() {
        return type9;
    }

    /**
     * Définit la valeur de la propriété type9.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleInfoTypeAttributeDefinition }
     *     
     */
    public void setType9(TitleInfoTypeAttributeDefinition value) {
        this.type9 = value;
    }

}
