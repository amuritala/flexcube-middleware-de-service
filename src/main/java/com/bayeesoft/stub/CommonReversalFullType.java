
package com.bayeesoft.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonReversal-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonReversal-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT_TAGG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENT_SR_NOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Acvws-All-Ac-Entries-A" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AC_ENTRY_SR_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EVENTT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRCR_INDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FCY_AMOUNTT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_AMOUNTT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="RELATED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RELATED_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonReversal-Full-Type", propOrder = {
    "amounttagg",
    "trnrefno",
    "eventsrnoo",
    "acvwsAllAcEntriesA"
})
public class CommonReversalFullType {

    @XmlElement(name = "AMOUNT_TAGG")
    protected String amounttagg;
    @XmlElement(name = "TRN_REF_NO")
    protected String trnrefno;
    @XmlElement(name = "EVENT_SR_NOO")
    protected String eventsrnoo;
    @XmlElement(name = "Acvws-All-Ac-Entries-A")
    protected List<CommonReversalFullType.AcvwsAllAcEntriesA> acvwsAllAcEntriesA;

    /**
     * Gets the value of the amounttagg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTTAGG() {
        return amounttagg;
    }

    /**
     * Sets the value of the amounttagg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTTAGG(String value) {
        this.amounttagg = value;
    }

    /**
     * Gets the value of the trnrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNREFNO() {
        return trnrefno;
    }

    /**
     * Sets the value of the trnrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNREFNO(String value) {
        this.trnrefno = value;
    }

    /**
     * Gets the value of the eventsrnoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTSRNOO() {
        return eventsrnoo;
    }

    /**
     * Sets the value of the eventsrnoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTSRNOO(String value) {
        this.eventsrnoo = value;
    }

    /**
     * Gets the value of the acvwsAllAcEntriesA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acvwsAllAcEntriesA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcvwsAllAcEntriesA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonReversalFullType.AcvwsAllAcEntriesA }
     * 
     * 
     */
    public List<CommonReversalFullType.AcvwsAllAcEntriesA> getAcvwsAllAcEntriesA() {
        if (acvwsAllAcEntriesA == null) {
            acvwsAllAcEntriesA = new ArrayList<CommonReversalFullType.AcvwsAllAcEntriesA>();
        }
        return this.acvwsAllAcEntriesA;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TRN_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AC_ENTRY_SR_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EVENTT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRCR_INDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRN_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FCY_AMOUNTT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_AMOUNTT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TRN_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="VALUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="RELATED_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RELATED_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT_TAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trnrefno",
        "acentrysrno",
        "eventt",
        "drcrindd",
        "trncode",
        "fcyamountt",
        "exchrate",
        "lcyamountt",
        "trndt",
        "valuedt",
        "relatedaccount",
        "relatedreference",
        "module",
        "amounttag"
    })
    public static class AcvwsAllAcEntriesA {

        @XmlElement(name = "TRN_REF_NO")
        protected String trnrefno;
        @XmlElement(name = "AC_ENTRY_SR_NO")
        protected BigDecimal acentrysrno;
        @XmlElement(name = "EVENTT")
        protected String eventt;
        @XmlElement(name = "DRCR_INDD")
        protected String drcrindd;
        @XmlElement(name = "TRN_CODE")
        protected String trncode;
        @XmlElement(name = "FCY_AMOUNTT")
        protected BigDecimal fcyamountt;
        @XmlElement(name = "EXCH_RATE")
        protected BigDecimal exchrate;
        @XmlElement(name = "LCY_AMOUNTT")
        protected BigDecimal lcyamountt;
        @XmlElement(name = "TRN_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar trndt;
        @XmlElement(name = "VALUE_DT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valuedt;
        @XmlElement(name = "RELATED_ACCOUNT")
        protected String relatedaccount;
        @XmlElement(name = "RELATED_REFERENCE")
        protected String relatedreference;
        @XmlElement(name = "MODULE")
        protected String module;
        @XmlElement(name = "AMOUNT_TAG")
        protected String amounttag;

        /**
         * Gets the value of the trnrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNREFNO() {
            return trnrefno;
        }

        /**
         * Sets the value of the trnrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNREFNO(String value) {
            this.trnrefno = value;
        }

        /**
         * Gets the value of the acentrysrno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACENTRYSRNO() {
            return acentrysrno;
        }

        /**
         * Sets the value of the acentrysrno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACENTRYSRNO(BigDecimal value) {
            this.acentrysrno = value;
        }

        /**
         * Gets the value of the eventt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVENTT() {
            return eventt;
        }

        /**
         * Sets the value of the eventt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVENTT(String value) {
            this.eventt = value;
        }

        /**
         * Gets the value of the drcrindd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRINDD() {
            return drcrindd;
        }

        /**
         * Sets the value of the drcrindd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRINDD(String value) {
            this.drcrindd = value;
        }

        /**
         * Gets the value of the trncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNCODE() {
            return trncode;
        }

        /**
         * Sets the value of the trncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNCODE(String value) {
            this.trncode = value;
        }

        /**
         * Gets the value of the fcyamountt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMOUNTT() {
            return fcyamountt;
        }

        /**
         * Sets the value of the fcyamountt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMOUNTT(BigDecimal value) {
            this.fcyamountt = value;
        }

        /**
         * Gets the value of the exchrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHRATE() {
            return exchrate;
        }

        /**
         * Sets the value of the exchrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHRATE(BigDecimal value) {
            this.exchrate = value;
        }

        /**
         * Gets the value of the lcyamountt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMOUNTT() {
            return lcyamountt;
        }

        /**
         * Sets the value of the lcyamountt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMOUNTT(BigDecimal value) {
            this.lcyamountt = value;
        }

        /**
         * Gets the value of the trndt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTRNDT() {
            return trndt;
        }

        /**
         * Sets the value of the trndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTRNDT(XMLGregorianCalendar value) {
            this.trndt = value;
        }

        /**
         * Gets the value of the valuedt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVALUEDT() {
            return valuedt;
        }

        /**
         * Sets the value of the valuedt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVALUEDT(XMLGregorianCalendar value) {
            this.valuedt = value;
        }

        /**
         * Gets the value of the relatedaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDACCOUNT() {
            return relatedaccount;
        }

        /**
         * Sets the value of the relatedaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDACCOUNT(String value) {
            this.relatedaccount = value;
        }

        /**
         * Gets the value of the relatedreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATEDREFERENCE() {
            return relatedreference;
        }

        /**
         * Sets the value of the relatedreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATEDREFERENCE(String value) {
            this.relatedreference = value;
        }

        /**
         * Gets the value of the module property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMODULE() {
            return module;
        }

        /**
         * Sets the value of the module property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMODULE(String value) {
            this.module = value;
        }

        /**
         * Gets the value of the amounttag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNTTAG() {
            return amounttag;
        }

        /**
         * Sets the value of the amounttag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNTTAG(String value) {
            this.amounttag = value;
        }

    }

}
