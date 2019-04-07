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
 * <p>Classe Java pour codeOrTextDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="codeOrTextDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codeOrTextDefinition")
@XmlEnum
public enum CodeOrTextDefinition {

    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    CodeOrTextDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeOrTextDefinition fromValue(String v) {
        for (CodeOrTextDefinition c: CodeOrTextDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
