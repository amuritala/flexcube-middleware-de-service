package com.bayeesoft.deentry.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class JournalDetailRequest {

    private BigDecimal serialno;

    private String userrefno;

    private String drcr;

    private String branchcode;

    private String accorgl;

    private String ccy;

    private BigDecimal amount;

    private String txncode;

    private String instrumentno;

    private BigDecimal lcyamount;

    private String addltext;

    private String acdesc;

    private String customer;

    private BigDecimal exchrate;

    private String account;
}