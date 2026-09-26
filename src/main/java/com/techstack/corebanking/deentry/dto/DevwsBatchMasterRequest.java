package com.techstack.corebanking.deentry.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class DevwsBatchMasterRequest {

    private String batchnumber;

    private String description;

    private String lastoperatedby;

    private String lastauthorisedby;

    private String makerdt;

    private String checkerdt;

    private BigDecimal debit;

    private BigDecimal credit;

    private String balancing;
}