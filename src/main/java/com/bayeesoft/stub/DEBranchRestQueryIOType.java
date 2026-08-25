
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEBranchRest-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEBranchRest-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DE_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEBranchRest-Query-IO-Type", propOrder = {
    "debranchcode",
    "desourcecode"
})
public class DEBranchRestQueryIOType {

    @XmlElement(name = "DE_BRANCH_CODE", required = true)
    protected String debranchcode;
    @XmlElement(name = "DE_SOURCE_CODE", required = true)
    protected String desourcecode;

    /**
     * Gets the value of the debranchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBRANCHCODE() {
        return debranchcode;
    }

    /**
     * Sets the value of the debranchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBRANCHCODE(String value) {
        this.debranchcode = value;
    }

    /**
     * Gets the value of the desourcecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESOURCECODE() {
        return desourcecode;
    }

    /**
     * Sets the value of the desourcecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESOURCECODE(String value) {
        this.desourcecode = value;
    }

}
