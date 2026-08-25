
package com.bayeesoft.stub;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Devws_jrnl_misType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Devws_jrnl_misType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BATCHNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MISCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Devws_jrnl_misType", propOrder = {
    "fccref",
    "batchno",
    "currno",
    "brn",
    "miscode",
    "misgrp"
})
public class DevwsJrnlMisType {

    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "BATCHNO", required = true)
    protected String batchno;
    @XmlElement(name = "CURRNO")
    protected BigInteger currno;
    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "MISCODE")
    protected String miscode;
    @XmlElement(name = "MISGRP")
    protected String misgrp;

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the batchno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHNO() {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHNO(String value) {
        this.batchno = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCURRNO(BigInteger value) {
        this.currno = value;
    }

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the miscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISCODE() {
        return miscode;
    }

    /**
     * Sets the value of the miscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISCODE(String value) {
        this.miscode = value;
    }

    /**
     * Gets the value of the misgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRP() {
        return misgrp;
    }

    /**
     * Sets the value of the misgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRP(String value) {
        this.misgrp = value;
    }

}
