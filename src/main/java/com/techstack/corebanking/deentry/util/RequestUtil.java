package com.techstack.corebanking.deentry.util;


import com.techstack.corebanking.stub.MultiJrnlBookFullType;

import java.math.BigDecimal;
import java.util.List;



public class RequestUtil {
   private RequestUtil() {}

   public  void validate(MultiJrnlBookFullType request) {
     List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> details = request.getDetbsJrnlTxnDetail();

     if (details == null || details.isEmpty()) {
     throw new IllegalArgumentException("detbsjrnldetails must not be empty");
     }
     if (details.size() < 2) {
     throw new IllegalArgumentException("A journal entry needs at least one debit and one credit leg");
     }

     BigDecimal sumDr = BigDecimal.ZERO;
     BigDecimal sumCr = BigDecimal.ZERO;

     for (MultiJrnlBookFullType.DetbsJrnlTxnDetail d : details) {
     BigDecimal amt = d.getAMOUNT();
     if ("D".equalsIgnoreCase(d.getDRCR())) {
     sumDr = sumDr.add(amt);
     } else if ("C".equalsIgnoreCase(d.getDRCR())) {
     sumCr = sumCr.add(amt);
     }
     }

     BigDecimal totalDr = request.getTOTALDR();
     BigDecimal totalCr = request.getTOTALCR();

     if (sumDr.compareTo(totalDr) != 0) {
     throw new IllegalArgumentException(
     "Sum of debit legs (" + sumDr + ") does not match totaldr (" + totalDr + ")");
     }
     if (sumCr.compareTo(totalCr) != 0) {
     throw new IllegalArgumentException(
     "Sum of credit legs (" + sumCr + ") does not match totalcr (" + totalCr + ")");
     }
     if (sumDr.compareTo(sumCr) != 0) {
     throw new IllegalArgumentException(
     "Journal is not balanced: debits=" + sumDr + " credits=" + sumCr);
       }
     }
}
