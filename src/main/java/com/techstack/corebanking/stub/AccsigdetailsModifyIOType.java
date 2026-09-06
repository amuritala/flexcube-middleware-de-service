
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accsigdetails-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accsigdetails-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACBRN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MINNOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Accsigdetails" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amt-Slab" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TO_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="Sig-Condition" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CONDITIONID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Sig-Group" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="REQ_NO_SIGN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "Accsigdetails-Modify-IO-Type", propOrder = {
    "acbrn1",
    "actno",
    "accmsg",
    "minnosig",
    "accsigdetails",
    "amtSlab"
})
public class AccsigdetailsModifyIOType {

    @XmlElement(name = "ACBRN1")
    protected String acbrn1;
    @XmlElement(name = "ACTNO", required = true)
    protected String actno;
    @XmlElement(name = "ACCMSG")
    protected String accmsg;
    @XmlElement(name = "MINNOSIG")
    protected BigDecimal minnosig;
    @XmlElement(name = "Accsigdetails", required = true)
    protected List<AccsigdetailsModifyIOType.Accsigdetails> accsigdetails;
    @XmlElement(name = "Amt-Slab", required = true)
    protected List<AccsigdetailsModifyIOType.AmtSlab> amtSlab;

    /**
     * Gets the value of the acbrn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACBRN1() {
        return acbrn1;
    }

    /**
     * Sets the value of the acbrn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACBRN1(String value) {
        this.acbrn1 = value;
    }

    /**
     * Gets the value of the actno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTNO() {
        return actno;
    }

    /**
     * Sets the value of the actno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTNO(String value) {
        this.actno = value;
    }

    /**
     * Gets the value of the accmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCMSG() {
        return accmsg;
    }

    /**
     * Sets the value of the accmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCMSG(String value) {
        this.accmsg = value;
    }

    /**
     * Gets the value of the minnosig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINNOSIG() {
        return minnosig;
    }

    /**
     * Sets the value of the minnosig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINNOSIG(BigDecimal value) {
        this.minnosig = value;
    }

    /**
     * Gets the value of the accsigdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accsigdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccsigdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccsigdetailsModifyIOType.Accsigdetails }
     * 
     * 
     */
    public List<AccsigdetailsModifyIOType.Accsigdetails> getAccsigdetails() {
        if (accsigdetails == null) {
            accsigdetails = new ArrayList<AccsigdetailsModifyIOType.Accsigdetails>();
        }
        return this.accsigdetails;
    }

    /**
     * Gets the value of the amtSlab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amtSlab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtSlab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccsigdetailsModifyIOType.AmtSlab }
     * 
     * 
     */
    public List<AccsigdetailsModifyIOType.AmtSlab> getAmtSlab() {
        if (amtSlab == null) {
            amtSlab = new ArrayList<AccsigdetailsModifyIOType.AmtSlab>();
        }
        return this.amtSlab;
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
     *         &lt;element name="SIGID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SIGMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APPROVLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SIGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SOLOSIG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "sigid",
        "sigmsg",
        "sigtype",
        "approvlimit",
        "signame",
        "solosig"
    })
    public static class Accsigdetails {

        @XmlElement(name = "SIGID", required = true)
        protected String sigid;
        @XmlElement(name = "SIGMSG")
        protected String sigmsg;
        @XmlElement(name = "SIGTYPE")
        protected String sigtype;
        @XmlElement(name = "APPROVLIMIT")
        protected BigDecimal approvlimit;
        @XmlElement(name = "SIGNAME")
        protected String signame;
        @XmlElement(name = "SOLOSIG")
        protected BigDecimal solosig;

        /**
         * Gets the value of the sigid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGID() {
            return sigid;
        }

        /**
         * Sets the value of the sigid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGID(String value) {
            this.sigid = value;
        }

        /**
         * Gets the value of the sigmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGMSG() {
            return sigmsg;
        }

        /**
         * Sets the value of the sigmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGMSG(String value) {
            this.sigmsg = value;
        }

        /**
         * Gets the value of the sigtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGTYPE() {
            return sigtype;
        }

        /**
         * Sets the value of the sigtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGTYPE(String value) {
            this.sigtype = value;
        }

        /**
         * Gets the value of the approvlimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAPPROVLIMIT() {
            return approvlimit;
        }

        /**
         * Sets the value of the approvlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAPPROVLIMIT(BigDecimal value) {
            this.approvlimit = value;
        }

        /**
         * Gets the value of the signame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGNAME() {
            return signame;
        }

        /**
         * Sets the value of the signame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGNAME(String value) {
            this.signame = value;
        }

        /**
         * Gets the value of the solosig property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSOLOSIG() {
            return solosig;
        }

        /**
         * Sets the value of the solosig property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSOLOSIG(BigDecimal value) {
            this.solosig = value;
        }

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
     *         &lt;element name="TO_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="Sig-Condition" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CONDITIONID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Sig-Group" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="REQ_NO_SIGN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "toamt",
        "sigCondition"
    })
    public static class AmtSlab {

        @XmlElement(name = "TO_AMT", required = true)
        protected BigDecimal toamt;
        @XmlElement(name = "Sig-Condition", required = true)
        protected List<AccsigdetailsModifyIOType.AmtSlab.SigCondition> sigCondition;

        /**
         * Gets the value of the toamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOAMT() {
            return toamt;
        }

        /**
         * Sets the value of the toamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOAMT(BigDecimal value) {
            this.toamt = value;
        }

        /**
         * Gets the value of the sigCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the sigCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSigCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccsigdetailsModifyIOType.AmtSlab.SigCondition }
         * 
         * 
         */
        public List<AccsigdetailsModifyIOType.AmtSlab.SigCondition> getSigCondition() {
            if (sigCondition == null) {
                sigCondition = new ArrayList<AccsigdetailsModifyIOType.AmtSlab.SigCondition>();
            }
            return this.sigCondition;
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
         *         &lt;element name="CONDITIONID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Sig-Group" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="REQ_NO_SIGN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "conditionid",
            "remarks",
            "sigGroup"
        })
        public static class SigCondition {

            @XmlElement(name = "CONDITIONID", required = true)
            protected String conditionid;
            @XmlElement(name = "REMARKS")
            protected String remarks;
            @XmlElement(name = "Sig-Group", required = true)
            protected List<AccsigdetailsModifyIOType.AmtSlab.SigCondition.SigGroup> sigGroup;

            /**
             * Gets the value of the conditionid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONDITIONID() {
                return conditionid;
            }

            /**
             * Sets the value of the conditionid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONDITIONID(String value) {
                this.conditionid = value;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARKS() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARKS(String value) {
                this.remarks = value;
            }

            /**
             * Gets the value of the sigGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the sigGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSigGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AccsigdetailsModifyIOType.AmtSlab.SigCondition.SigGroup }
             * 
             * 
             */
            public List<AccsigdetailsModifyIOType.AmtSlab.SigCondition.SigGroup> getSigGroup() {
                if (sigGroup == null) {
                    sigGroup = new ArrayList<AccsigdetailsModifyIOType.AmtSlab.SigCondition.SigGroup>();
                }
                return this.sigGroup;
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
             *         &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="REQ_NO_SIGN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                "groupid",
                "reqnosign"
            })
            public static class SigGroup {

                @XmlElement(name = "GROUPID", required = true)
                protected String groupid;
                @XmlElement(name = "REQ_NO_SIGN")
                protected BigDecimal reqnosign;

                /**
                 * Gets the value of the groupid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGROUPID() {
                    return groupid;
                }

                /**
                 * Sets the value of the groupid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGROUPID(String value) {
                    this.groupid = value;
                }

                /**
                 * Gets the value of the reqnosign property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getREQNOSIGN() {
                    return reqnosign;
                }

                /**
                 * Sets the value of the reqnosign property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setREQNOSIGN(BigDecimal value) {
                    this.reqnosign = value;
                }

            }

        }

    }

}
