
package com.bayeesoft.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Decbatop-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Decbatop-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BATCH_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BALANCING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Decbatop-Create-IO-Type", propOrder = {
    "branchcode",
    "batchnumber",
    "description",
    "debit",
    "credit",
    "balancing"
})
public class DecbatopCreateIOType {

    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "BATCH_NUMBER")
    protected String batchnumber;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "DEBIT")
    protected BigDecimal debit;
    @XmlElement(name = "CREDIT")
    protected BigDecimal credit;
    @XmlElement(name = "BALANCING")
    protected String balancing;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the batchnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHNUMBER() {
        return batchnumber;
    }

    /**
     * Sets the value of the batchnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHNUMBER(String value) {
        this.batchnumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEBIT() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEBIT(BigDecimal value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCREDIT() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCREDIT(BigDecimal value) {
        this.credit = value;
    }

    /**
     * Gets the value of the balancing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCING() {
        return balancing;
    }

    /**
     * Sets the value of the balancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCING(String value) {
        this.balancing = value;
    }

}
