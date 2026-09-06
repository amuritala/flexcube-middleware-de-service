package com.techstack.corebanking.DTO;


import com.techstack.corebanking.stub.MultiJrnlBookFullType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DEDebitCreditRequest {



    MultiJrnlBookFullType  multiJrnlbookfulltype;

   // private MultiJrnlBookFullType.DetbsJrnlTxnDetail detbsjrnldetails[];
  //List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> detbsjrnldetails;


}
