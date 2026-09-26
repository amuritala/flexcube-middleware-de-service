package com.tecstack.corebanking.deentry.dto;

import lombok.Data;

@Data
public class TxnMisDetailRequest {
    private String code;
    private String value;
}