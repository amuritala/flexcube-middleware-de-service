
package com.techstack.corebanking.stub;

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
 *                   &lt;element name="Detms-Mck-Issuer-Codes-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Create-IO-Type"/&gt;
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
@XmlRootElement(name = "CREATEDEDRAFTISSUERMAINT_IOPK_REQ")
public class CREATEDEDRAFTISSUERMAINTIOPKREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected CREATEDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY fcubsbody;

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
     *     {@link CREATEDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY }
     *     
     */
    public CREATEDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREATEDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(CREATEDEDRAFTISSUERMAINTIOPKREQ.FCUBSBODY value) {
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
     *         &lt;element name="Detms-Mck-Issuer-Codes-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}DEDraftIssuerMaint-Create-IO-Type"/&gt;
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
        "detmsMckIssuerCodesIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detms-Mck-Issuer-Codes-IO", required = true)
        protected DEDraftIssuerMaintCreateIOType detmsMckIssuerCodesIO;

        /**
         * Gets the value of the detmsMckIssuerCodesIO property.
         * 
         * @return
         *     possible object is
         *     {@link DEDraftIssuerMaintCreateIOType }
         *     
         */
        public DEDraftIssuerMaintCreateIOType getDetmsMckIssuerCodesIO() {
            return detmsMckIssuerCodesIO;
        }

        /**
         * Sets the value of the detmsMckIssuerCodesIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link DEDraftIssuerMaintCreateIOType }
         *     
         */
        public void setDetmsMckIssuerCodesIO(DEDraftIssuerMaintCreateIOType value) {
            this.detmsMckIssuerCodesIO = value;
        }

    }

}
