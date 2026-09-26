package com.tecstack.corebanking.deentry.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MultiJnrTemplate {



    private JnrMasterFullTemplate  detmsJrnlTmplMasterFull;
    private List<JrnDetailsTemplate> detmsJrnlTmplDetail;



}
