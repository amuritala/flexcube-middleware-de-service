package com.bayeesoft.deentry;


import com.bayeesoft.deentry.util.RequestUtil;
import com.bayeesoft.stub.CREATEMJRNLBOOKFSFSRES;
import com.bayeesoft.stub.MultiJrnlBookFullType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DEServiceController {

    @Autowired
    private  DeServiceCleint deservicecleint ;

    //@Autowired
    private RequestUtil requestutil;

    @PostMapping("/multiDeJournal")
    public CREATEMJRNLBOOKFSFSRES multijrn (@RequestBody MultiJrnlBookFullType request) {

        CREATEMJRNLBOOKFSFSRES responseMsg =   deservicecleint.createMultijrn(request);
        System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;
    }



}
