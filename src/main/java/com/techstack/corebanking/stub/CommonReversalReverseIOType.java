
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonReversal-Reverse-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonReversal-Reverse-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonReversal-Reverse-IO-Type", propOrder = {
    "trnrefno"
})
public class CommonReversalReverseIOType {

    @XmlElement(name = "TRN_REF_NO")
    protected String trnrefno;

    /**
     * Gets the value of the trnrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNREFNO() {
        return trnrefno;
    }

    /**
     * Sets the value of the trnrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNREFNO(String value) {
        this.trnrefno = value;
    }

}
