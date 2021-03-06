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
 * <p>Classe Java pour digitalOriginDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="digitalOriginDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="born digital"/>
 *     &lt;enumeration value="reformatted digital"/>
 *     &lt;enumeration value="digitized microfilm"/>
 *     &lt;enumeration value="digitized other analog"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "digitalOriginDefinition")
@XmlEnum
public enum DigitalOriginDefinition {

    @XmlEnumValue("born digital")
    BORN_DIGITAL("born digital"),
    @XmlEnumValue("reformatted digital")
    REFORMATTED_DIGITAL("reformatted digital"),
    @XmlEnumValue("digitized microfilm")
    DIGITIZED_MICROFILM("digitized microfilm"),
    @XmlEnumValue("digitized other analog")
    DIGITIZED_OTHER_ANALOG("digitized other analog");
    private final String value;

    DigitalOriginDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalOriginDefinition fromValue(String v) {
        for (DigitalOriginDefinition c: DigitalOriginDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
