package com.bayeesoft.DTO;


import com.bayeesoft.stub.MultiJrnlBookFullType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DEDebitCreditRequest {



    MultiJrnlBookFullType  multiJrnlbookfulltype;

   // private MultiJrnlBookFullType.DetbsJrnlTxnDetail detbsjrnldetails[];
  //List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> detbsjrnldetails;


}
