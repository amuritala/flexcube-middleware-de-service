package com.techstack.corebanking.deentry;


import com.techstack.corebanking.DTO.QueryRequest;
import com.techstack.corebanking.DTO.ReversalRequest;
import com.techstack.corebanking.deentry.dto.AutorizeRequeat;
import com.techstack.corebanking.deentry.dto.MultiDeJournalRequest;
import com.techstack.corebanking.deentry.util.RequestUtil;
import com.techstack.corebanking.stub.AUTHORIZEMJRNLBOOKFSFSRES;
import com.techstack.corebanking.stub.CREATEMJRNLBOOKFSFSRES;
import com.techstack.corebanking.stub.QUERYMJRNLBOOKIOFSRES;
import com.techstack.corebanking.stub.REVERSECOMMONREVERSALFSFSRES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DEServiceController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DEServiceController.class);

    @Autowired
    private  DeServiceClient deservicecleint ;

    //@Autowired
    private RequestUtil requestutil;

    @PostMapping("/api/v1/multiDeJournalBulkDebitCredit")
    public ResponseEntity<CREATEMJRNLBOOKFSFSRES> multijrn(
            @RequestBody MultiDeJournalRequest request) {

        LOGGER.info("Received Multi DE Journal request");
        LOGGER.info("Reference No: {}", request.getReferenceno());
        LOGGER.info("Batch No: {}", request.getBatchno());
        LOGGER.info("Total Debit: {}", request.getTotaldr());
        LOGGER.info("Total Credit: {}", request.getTotalcr());

        if (request.getDetbsJrnlTxnDetail() != null) {
            LOGGER.info(
                    "Journal detail count: {}",
                    request.getDetbsJrnlTxnDetail().size()
            );
        }

        CREATEMJRNLBOOKFSFSRES response =
                deservicecleint.createMultijrn(request);

        LOGGER.info("Flexcube response received");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/api/v1/Autorize")
    public AUTHORIZEMJRNLBOOKFSFSRES QueryPrd(@RequestBody AutorizeRequeat autorizeequeat) {
        AUTHORIZEMJRNLBOOKFSFSRES responseMsg =  deservicecleint.authmuljn(autorizeequeat);        //System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

    @PostMapping("api/v1/DeJrnSingleDebitCredit")
    public CREATEMJRNLBOOKFSFSRES MultiJrn2(@RequestBody MultiDeJournalRequest request) {
        CREATEMJRNLBOOKFSFSRES responseMsg =  deservicecleint.CreateMuiltiv2(request);         //System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

    @PostMapping("api/v1/QueryMultiJrn")
    public QUERYMJRNLBOOKIOFSRES QueryultiJrn(@RequestBody QueryRequest queryRequest) {
        QUERYMJRNLBOOKIOFSRES responseMsg =  deservicecleint.QueryMultiJrn(queryRequest);         //System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

    @PostMapping("api/v1/ReverseJrn")
    public REVERSECOMMONREVERSALFSFSRES ReserveMultiJrn(@RequestBody ReversalRequest reversalRequest) {
        REVERSECOMMONREVERSALFSFSRES responseMsg =  deservicecleint.ReseverJrn(reversalRequest);         //System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }




}
