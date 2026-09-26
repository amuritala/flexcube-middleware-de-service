package com.bayeesoft.deentry.dto;

import com.bayeesoft.stub.TxnMISFullType;
import lombok.Data;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class MultiDeJournalRequest {

    private String referenceno;
    private String batchno;
    private BigDecimal currno;
    private String templatecode;
    private XMLGregorianCalendar valuedate;
    private String branchcode;
    private String ccy;
    private String description;

    private BigDecimal totaldr;
    private BigDecimal totalcr;

    private String maker;
    private String makdttime;
    private String chechkerid;
    private String chkdttime;
    private String authstat;
    private String txnstat;
    private String fundid;

    private BigDecimal recno;
    private BigDecimal totalno;

    /**
     * Journal transaction details
     */
    private List<JournalDetailRequest> detbsJrnlTxnDetail;

    /**
     * Batch master
     */
    private DetbsBatchMasterRequest detbsBatchMaster;

    /**
     * Development/Batch master
     */
    private DevwsBatchMasterRequest devwsBatchMaster;

    /**
     * MIS details
     */
    private TxnMISFullTypeRequest misdetails;

    /**
     * Transaction UDF details
     */
    private List<TxnUdfDetailRequest> txnudfdetails;
}