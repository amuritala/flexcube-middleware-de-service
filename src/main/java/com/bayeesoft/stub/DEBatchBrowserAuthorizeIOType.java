
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEBatchBrowser-Authorize-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEBatchBrowser-Authorize-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_BATCH_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_LAST_OPER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTH_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEBatchBrowser-Authorize-IO-Type", propOrder = {
    "debrn",
    "debatchnumber",
    "delastoperid",
    "authstat"
})
public class DEBatchBrowserAuthorizeIOType {

    @XmlElement(name = "DE_BRN")
    protected String debrn;
    @XmlElement(name = "DE_BATCH_NUMBER")
    protected String debatchnumber;
    @XmlElement(name = "DE_LAST_OPER_ID")
    protected String delastoperid;
    @XmlElement(name = "AUTH_STAT")
    protected String authstat;

    /**
     * Gets the value of the debrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBRN() {
        return debrn;
    }

    /**
     * Sets the value of the debrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBRN(String value) {
        this.debrn = value;
    }

    /**
     * Gets the value of the debatchnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBATCHNUMBER() {
        return debatchnumber;
    }

    /**
     * Sets the value of the debatchnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBATCHNUMBER(String value) {
        this.debatchnumber = value;
    }

    /**
     * Gets the value of the delastoperid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELASTOPERID() {
        return delastoperid;
    }

    /**
     * Sets the value of the delastoperid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELASTOPERID(String value) {
        this.delastoperid = value;
    }

    /**
     * Gets the value of the authstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHSTAT() {
        return authstat;
    }

    /**
     * Sets the value of the authstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHSTAT(String value) {
        this.authstat = value;
    }

}
