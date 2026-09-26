package com.techstack.corebanking.deentry.dto;

import lombok.Data;

@Data
public class TxnUdfDetailRequest {

    private String fldname;

    private String fldval;
}