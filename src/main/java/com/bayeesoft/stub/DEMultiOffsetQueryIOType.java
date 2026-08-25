
package com.bayeesoft.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEMultiOffset-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DEMultiOffset-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_BATCH_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DE_CURRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DEMultiOffset-Query-IO-Type", propOrder = {
    "derefno",
    "debatchnumber",
    "decurrno"
})
public class DEMultiOffsetQueryIOType {

    @XmlElement(name = "DE_REF_NO")
    protected String derefno;
    @XmlElement(name = "DE_BATCH_NUMBER")
    protected String debatchnumber;
    @XmlElement(name = "DE_CURRNO")
    protected BigDecimal decurrno;

    /**
     * Gets the value of the derefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEREFNO() {
        return derefno;
    }

    /**
     * Sets the value of the derefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEREFNO(String value) {
        this.derefno = value;
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
     * Gets the value of the decurrno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDECURRNO() {
        return decurrno;
    }

    /**
     * Sets the value of the decurrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDECURRNO(BigDecimal value) {
        this.decurrno = value;
    }

}
