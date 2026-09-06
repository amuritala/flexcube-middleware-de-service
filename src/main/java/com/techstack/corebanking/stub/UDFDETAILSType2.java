
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDFDETAILSType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDFDETAILSType2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLDNAM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FLDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDFDETAILSType2", propOrder = {
    "fldnam",
    "fldval"
})
public class UDFDETAILSType2 {

    @XmlElement(name = "FLDNAM", required = true)
    protected String fldnam;
    @XmlElement(name = "FLDVAL")
    protected String fldval;

    /**
     * Gets the value of the fldnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDNAM() {
        return fldnam;
    }

    /**
     * Sets the value of the fldnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDNAM(String value) {
        this.fldnam = value;
    }

    /**
     * Gets the value of the fldval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDVAL() {
        return fldval;
    }

    /**
     * Sets the value of the fldval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDVAL(String value) {
        this.fldval = value;
    }

}
