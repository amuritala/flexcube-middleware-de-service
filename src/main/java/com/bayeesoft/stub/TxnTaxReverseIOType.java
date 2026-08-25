
package com.bayeesoft.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnTax-Reverse-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnTax-Reverse-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnTax-Reverse-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno"
})
public class TxnTaxReverseIOType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;

    /**
     * Gets the value of the conrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONREFNO() {
        return conrefno;
    }

    /**
     * Sets the value of the conrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONREFNO(String value) {
        this.conrefno = value;
    }

    /**
     * Gets the value of the latevnseqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATEVNSEQNO() {
        return latevnseqno;
    }

    /**
     * Sets the value of the latevnseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATEVNSEQNO(BigDecimal value) {
        this.latevnseqno = value;
    }

}
