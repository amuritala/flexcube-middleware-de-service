package com.bayeesoft.deentry.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class TxnMISFullTypeRequest {

    private String conrefno;
    private String misgrp;
    private String relacc;
    private String reletedreference;
    private String mishead;
    private String rateflg;
    private String poolcd;
    private BigDecimal refinancerate;
    private String refratetyp;
    private String calcmeth1;
    private BigDecimal refspread;
    private String refratecd;

    private String costcd1;
    private String costcd2;
    private String costcd3;
    private String costcd4;
    private String costcd5;

    private String txnmis1;
    private String txnmis10;
    private String txnmis2;
    private String txnmis3;
    private String txnmis4;
    private String txnmis5;
    private String txnmis6;
    private String txnmis7;
    private String txnmis8;
    private String txnmis9;

    private String misgrpcomp;
    private String misgrptxn;

    private String compmis1;
    private String compmis10;
    private String compmis2;
    private String compmis3;
    private String compmis4;
    private String compmis5;
    private String compmis6;
    private String compmis7;
    private String compmis8;
    private String compmis9;

    private String fundmis1;
    private String fundmis10;
    private String fundmis2;
    private String fundmis3;
    private String fundmis4;
    private String fundmis5;
    private String fundmis6;
    private String fundmis7;
    private String fundmis8;
    private String fundmis9;

    private String misgrpfun;

    private String tranmis1;
    private String tranmis2;
    private String tranmis3;
    private String tranmis4;
    private String tranmis5;
    private String tranmis6;
    private String tranmis7;
    private String tranmis8;
    private String tranmis9;
    private String tranmis10;

    private String commis1;
    private String commis2;
    private String commis3;
    private String commis4;
    private String commis5;
    private String commis6;
    private String commis7;
    private String commis8;
    private String commis9;
    private String commis10;

    private String funmis1;
    private String funmis2;
    private String funmis3;
    private String funmis4;
    private String funmis5;
    private String funmis6;
    private String funmis7;
    private String funmis8;
    private String funmis9;
    private String funmis10;

    private List<TxnmisdetailsRequest> txnmisdetails;
    private List<CompmisdetailsRequest> compmisdetails;
    private List<FundmisdetailsRequest> fundmisdetails;
    private ControlRequest control;
    private List<BalanceTrnsferLogDetailsRequest> balanceTrnsferLogDetails;


    @Data
    public static class TxnmisdetailsRequest {
    }


    @Data
    public static class CompmisdetailsRequest {
    }


    @Data
    public static class FundmisdetailsRequest {
    }


    @Data
    public static class ControlRequest {
    }


    @Data
    public static class BalanceTrnsferLogDetailsRequest {

        private String branch;
        private String periodcode;
        private String finyear;
        private String referenceno;
        private String glcode;
        private String referencetype;
        private String transferind;
        private String misclass;
        private LocalDate txndate;
        private String oldmiscode;
        private String newmiscode;
        private String ccy;
        private BigDecimal amount;
        private BigDecimal exrate;
    }
}