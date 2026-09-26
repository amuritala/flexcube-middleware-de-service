package com.techstack.corebanking.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DedevwsBatchMasterRequest {

    private String batchnumber;
    private String description;
    private BigDecimal debit;
    private BigDecimal credit;
    private String balancing;
}
