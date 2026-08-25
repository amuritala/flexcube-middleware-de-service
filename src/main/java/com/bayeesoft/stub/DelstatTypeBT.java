
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelstatTypeBT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DelstatTypeBT"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DelstatTypeBT")
@XmlEnum
public enum DelstatTypeBT {

    Y,
    N;

    public String value() {
        return name();
    }

    public static DelstatTypeBT fromValue(String v) {
        return valueOf(v);
    }

}
