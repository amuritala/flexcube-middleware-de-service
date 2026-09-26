package com.tecstack.corebanking.deentry.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BalanceTransferLogDetailRequest {

    private String branch;

    private String periodcode;

    private String finyear;

    private String referenceno;

    private String glcode;

    private String referencetype;

    private String transferind;

    private String misclass;

    private Date txndate;

    private String oldmiscode;

    private String newmiscode;

    private String ccy;

    private BigDecimal amount;

    private BigDecimal exrate;
}