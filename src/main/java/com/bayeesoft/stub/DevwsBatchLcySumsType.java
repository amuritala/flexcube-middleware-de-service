
package com.bayeesoft.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Devws_batch_lcy_sumsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Devws_batch_lcy_sumsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DR_ENT_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CR_ENT_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Devws_batch_lcy_sumsType", propOrder = {
    "brn",
    "batch",
    "drenttotal",
    "crenttotal"
})
public class DevwsBatchLcySumsType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "BATCH", required = true)
    protected String batch;
    @XmlElement(name = "DR_ENT_TOTAL", required = true)
    protected BigDecimal drenttotal;
    @XmlElement(name = "CR_ENT_TOTAL", required = true)
    protected BigDecimal crenttotal;

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
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCH() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCH(String value) {
        this.batch = value;
    }

    /**
     * Gets the value of the drenttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRENTTOTAL() {
        return drenttotal;
    }

    /**
     * Sets the value of the drenttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRENTTOTAL(BigDecimal value) {
        this.drenttotal = value;
    }

    /**
     * Gets the value of the crenttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRENTTOTAL() {
        return crenttotal;
    }

    /**
     * Sets the value of the crenttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRENTTOTAL(BigDecimal value) {
        this.crenttotal = value;
    }

}
