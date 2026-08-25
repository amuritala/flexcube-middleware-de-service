
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEMultiOffset-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEMultiOffset-Delete-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEMultiOffset-Delete-IO-Type", propOrder = {
    "derefno"
})
public class DEMultiOffsetDeleteIOType {

    @XmlElement(name = "DE_REF_NO")
    protected String derefno;

    /**
     * Gets the value of the derefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEREFNO() {
        return derefno;
    }

    /**
     * Sets the value of the derefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEREFNO(String value) {
        this.derefno = value;
    }

}
