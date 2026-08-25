
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsystemstatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SubsystemstatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubsystemstatType")
@XmlEnum
public enum SubsystemstatType {

    D,
    C;

    public String value() {
        return name();
    }

    public static SubsystemstatType fromValue(String v) {
        return valueOf(v);
    }

}
