
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TypType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypType2")
@XmlEnum
public enum TypType2 {

    J,
    M,
    T;

    public String value() {
        return name();
    }

    public static TypType2 fromValue(String v) {
        return valueOf(v);
    }

}
