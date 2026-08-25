
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEDraftIssuerMaint-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEDraftIssuerMaint-Delete-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BANK_CODE1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INSTRUMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEDraftIssuerMaint-Delete-IO-Type", propOrder = {
    "bankcode1",
    "ccy",
    "instrumenttype"
})
public class DEDraftIssuerMaintDeleteIOType {

    @XmlElement(name = "BANK_CODE1", required = true)
    protected String bankcode1;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "INSTRUMENT_TYPE", required = true)
    protected String instrumenttype;

    /**
     * Gets the value of the bankcode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCODE1() {
        return bankcode1;
    }

    /**
     * Sets the value of the bankcode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCODE1(String value) {
        this.bankcode1 = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the instrumenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRUMENTTYPE() {
        return instrumenttype;
    }

    /**
     * Sets the value of the instrumenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRUMENTTYPE(String value) {
        this.instrumenttype = value;
    }

}
