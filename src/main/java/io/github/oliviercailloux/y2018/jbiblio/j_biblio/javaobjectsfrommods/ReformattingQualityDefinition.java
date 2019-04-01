//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.03.31 à 09:33:29 AM CEST 
//


package io.github.oliviercailloux.y2018.jbiblio.j_biblio.javaobjectsfrommods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reformattingQualityDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="reformattingQualityDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="access"/>
 *     &lt;enumeration value="preservation"/>
 *     &lt;enumeration value="replacement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reformattingQualityDefinition")
@XmlEnum
public enum ReformattingQualityDefinition {

    @XmlEnumValue("access")
    ACCESS("access"),
    @XmlEnumValue("preservation")
    PRESERVATION("preservation"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement");
    private final String value;

    ReformattingQualityDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReformattingQualityDefinition fromValue(String v) {
        for (ReformattingQualityDefinition c: ReformattingQualityDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
