
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AustatTypeBT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AustatTypeBT"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AustatTypeBT")
@XmlEnum
public enum AustatTypeBT {

    U,
    A;

    public String value() {
        return name();
    }

    public static AustatTypeBT fromValue(String v) {
        return valueOf(v);
    }

}
