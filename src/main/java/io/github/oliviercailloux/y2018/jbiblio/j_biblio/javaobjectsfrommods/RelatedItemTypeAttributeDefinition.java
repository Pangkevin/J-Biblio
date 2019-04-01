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
 * <p>Classe Java pour relatedItemTypeAttributeDefinition.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="relatedItemTypeAttributeDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="preceding"/>
 *     &lt;enumeration value="succeeding"/>
 *     &lt;enumeration value="original"/>
 *     &lt;enumeration value="host"/>
 *     &lt;enumeration value="constituent"/>
 *     &lt;enumeration value="series"/>
 *     &lt;enumeration value="otherVersion"/>
 *     &lt;enumeration value="otherFormat"/>
 *     &lt;enumeration value="isReferencedBy"/>
 *     &lt;enumeration value="references"/>
 *     &lt;enumeration value="reviewOf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relatedItemTypeAttributeDefinition")
@XmlEnum
public enum RelatedItemTypeAttributeDefinition {

    @XmlEnumValue("preceding")
    PRECEDING("preceding"),
    @XmlEnumValue("succeeding")
    SUCCEEDING("succeeding"),
    @XmlEnumValue("original")
    ORIGINAL("original"),
    @XmlEnumValue("host")
    HOST("host"),
    @XmlEnumValue("constituent")
    CONSTITUENT("constituent"),
    @XmlEnumValue("series")
    SERIES("series"),
    @XmlEnumValue("otherVersion")
    OTHER_VERSION("otherVersion"),
    @XmlEnumValue("otherFormat")
    OTHER_FORMAT("otherFormat"),
    @XmlEnumValue("isReferencedBy")
    IS_REFERENCED_BY("isReferencedBy"),
    @XmlEnumValue("references")
    REFERENCES("references"),
    @XmlEnumValue("reviewOf")
    REVIEW_OF("reviewOf");
    private final String value;

    RelatedItemTypeAttributeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedItemTypeAttributeDefinition fromValue(String v) {
        for (RelatedItemTypeAttributeDefinition c: RelatedItemTypeAttributeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
