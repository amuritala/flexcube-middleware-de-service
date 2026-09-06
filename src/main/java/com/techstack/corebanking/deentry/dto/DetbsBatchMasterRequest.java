package com.techstack.corebanking.deentry.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DetbsBatchMasterRequest {

    private String batchno;

    private String description;

    private BigDecimal debit;

    private BigDecimal credit;

    private BigDecimal drenttotal;

    private BigDecimal crenttotal;
}