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
 * <p>Classe Java pour dateEncodingAttributeDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dateEncodingAttributeDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="w3cdtf"/>
 *     &lt;enumeration value="iso8601"/>
 *     &lt;enumeration value="marc"/>
 *     &lt;enumeration value="temper"/>
 *     &lt;enumeration value="edtf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dateEncodingAttributeDefinition")
@XmlEnum
public enum DateEncodingAttributeDefinition {

    @XmlEnumValue("w3cdtf")
    W_3_CDTF("w3cdtf"),
    @XmlEnumValue("iso8601")
    ISO_8601("iso8601"),
    @XmlEnumValue("marc")
    MARC("marc"),
    @XmlEnumValue("temper")
    TEMPER("temper"),
    @XmlEnumValue("edtf")
    EDTF("edtf");
    private final String value;

    DateEncodingAttributeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateEncodingAttributeDefinition fromValue(String v) {
        for (DateEncodingAttributeDefinition c: DateEncodingAttributeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
