
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatAuth-DE-Req-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatAuth-DE-Req-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BATNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LASAUTHBY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatAuth-DE-Req-IO-Type", propOrder = {
    "branch",
    "batno",
    "lasauthby"
})
public class BatAuthDEReqIOType {

    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "BATNO", required = true)
    protected String batno;
    @XmlElement(name = "LASAUTHBY", required = true)
    protected String lasauthby;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the batno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATNO() {
        return batno;
    }

    /**
     * Sets the value of the batno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATNO(String value) {
        this.batno = value;
    }

    /**
     * Gets the value of the lasauthby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASAUTHBY() {
        return lasauthby;
    }

    /**
     * Sets the value of the lasauthby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASAUTHBY(String value) {
        this.lasauthby = value;
    }

}
