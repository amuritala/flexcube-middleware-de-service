package com.tecstack.corebanking.deentry.dto;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class JrnDetailsTemplate {

    private String templatecode;
    private BigDecimal serialno;
    private String drcr;
    private String acorglno;
    private String txncode;
    private String addltext;
    private String ccy;
    private String custno;
    private String branchcode;
    private BigDecimal amount;

}
