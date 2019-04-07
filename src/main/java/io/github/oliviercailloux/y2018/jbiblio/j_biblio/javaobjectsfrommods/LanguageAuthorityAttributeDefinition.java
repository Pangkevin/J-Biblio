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
 * <p>Classe Java pour languageAuthorityAttributeDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="languageAuthorityAttributeDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rfc3066"/>
 *     &lt;enumeration value="iso639-2b"/>
 *     &lt;enumeration value="iso639-3"/>
 *     &lt;enumeration value="rfc4646"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "languageAuthorityAttributeDefinition")
@XmlEnum
public enum LanguageAuthorityAttributeDefinition {

    @XmlEnumValue("rfc3066")
    RFC_3066("rfc3066"),
    @XmlEnumValue("iso639-2b")
    ISO_639_2_B("iso639-2b"),
    @XmlEnumValue("iso639-3")
    ISO_639_3("iso639-3"),
    @XmlEnumValue("rfc4646")
    RFC_4646("rfc4646");
    private final String value;

    LanguageAuthorityAttributeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageAuthorityAttributeDefinition fromValue(String v) {
        for (LanguageAuthorityAttributeDefinition c: LanguageAuthorityAttributeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
