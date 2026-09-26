package com.bayeesoft.deentry.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JnrMasterFullTemplate {
    private String templatecode;
    private String description;
    private List<JrnDetailsTemplate> detmsJrnlTmplDetail;





}
