
package com.bayeesoft.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSDEService}FCUBS_HEADERType"/&gt;
 *         &lt;element name="FCUBS_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Acvws-All-Ac-Entries-PK" type="{http://fcubs.ofss.com/service/FCUBSDEService}CommonReversal-PK-Type" minOccurs="0"/&gt;
 *                   &lt;element name="Acvws-All-Ac-Entries-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}CommonReversal-Reverse-IO-Type" minOccurs="0"/&gt;
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "REVERSECOMMONREVERSAL_IOPK_RES")
public class REVERSECOMMONREVERSALIOPKRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected REVERSECOMMONREVERSALIOPKRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link REVERSECOMMONREVERSALIOPKRES.FCUBSBODY }
     *     
     */
    public REVERSECOMMONREVERSALIOPKRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVERSECOMMONREVERSALIOPKRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(REVERSECOMMONREVERSALIOPKRES.FCUBSBODY value) {
        this.fcubsbody = value;
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
     *         &lt;element name="Acvws-All-Ac-Entries-PK" type="{http://fcubs.ofss.com/service/FCUBSDEService}CommonReversal-PK-Type" minOccurs="0"/&gt;
     *         &lt;element name="Acvws-All-Ac-Entries-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}CommonReversal-Reverse-IO-Type" minOccurs="0"/&gt;
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}ERRORType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSDEService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "acvwsAllAcEntriesPK",
        "acvwsAllAcEntriesIO",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Acvws-All-Ac-Entries-PK")
        protected CommonReversalPKType acvwsAllAcEntriesPK;
        @XmlElement(name = "Acvws-All-Ac-Entries-IO")
        protected CommonReversalReverseIOType acvwsAllAcEntriesIO;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the acvwsAllAcEntriesPK property.
         * 
         * @return
         *     possible object is
         *     {@link CommonReversalPKType }
         *     
         */
        public CommonReversalPKType getAcvwsAllAcEntriesPK() {
            return acvwsAllAcEntriesPK;
        }

        /**
         * Sets the value of the acvwsAllAcEntriesPK property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonReversalPKType }
         *     
         */
        public void setAcvwsAllAcEntriesPK(CommonReversalPKType value) {
            this.acvwsAllAcEntriesPK = value;
        }

        /**
         * Gets the value of the acvwsAllAcEntriesIO property.
         * 
         * @return
         *     possible object is
         *     {@link CommonReversalReverseIOType }
         *     
         */
        public CommonReversalReverseIOType getAcvwsAllAcEntriesIO() {
            return acvwsAllAcEntriesIO;
        }

        /**
         * Sets the value of the acvwsAllAcEntriesIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonReversalReverseIOType }
         *     
         */
        public void setAcvwsAllAcEntriesIO(CommonReversalReverseIOType value) {
            this.acvwsAllAcEntriesIO = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<ERRORType>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<WARNINGType>();
            }
            return this.fcubswarningresp;
        }

    }

}
