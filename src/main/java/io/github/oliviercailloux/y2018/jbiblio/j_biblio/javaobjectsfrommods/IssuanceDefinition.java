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
 * <p>Classe Java pour issuanceDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="issuanceDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continuing"/>
 *     &lt;enumeration value="monographic"/>
 *     &lt;enumeration value="single unit"/>
 *     &lt;enumeration value="multipart monograph"/>
 *     &lt;enumeration value="serial"/>
 *     &lt;enumeration value="integrating resource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "issuanceDefinition")
@XmlEnum
public enum IssuanceDefinition {

    @XmlEnumValue("continuing")
    CONTINUING("continuing"),
    @XmlEnumValue("monographic")
    MONOGRAPHIC("monographic"),
    @XmlEnumValue("single unit")
    SINGLE_UNIT("single unit"),
    @XmlEnumValue("multipart monograph")
    MULTIPART_MONOGRAPH("multipart monograph"),
    @XmlEnumValue("serial")
    SERIAL("serial"),
    @XmlEnumValue("integrating resource")
    INTEGRATING_RESOURCE("integrating resource");
    private final String value;

    IssuanceDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssuanceDefinition fromValue(String v) {
        for (IssuanceDefinition c: IssuanceDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
