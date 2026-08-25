package com.bayeesoft.deentry;


import com.bayeesoft.deentry.dto.MultiDeJournalRequest;
import com.bayeesoft.deentry.util.RequestUtil;
import com.bayeesoft.stub.CREATEMJRNLBOOKFSFSRES;
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

    @PostMapping("/multiDeJournal")
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



}
