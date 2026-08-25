package com.bayeesoft.deentry;



import com.bayeesoft.deentry.util.RequestUtil;
import com.bayeesoft.stub.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Service
public class DeServiceCleint {

    @Autowired
    private Jaxb2Marshaller marshaller ;
    private WebServiceTemplate template ;
    private RequestUtil requestutil;

    private static final Logger LOGGER = LoggerFactory.getLogger(DeServiceCleint.class);


    public CREATEMJRNLBOOKFSFSRES createMultijrn (MultiJrnlBookFullType request) {

        LOGGER.info("request object  is: {}",request.getDetbsJrnlTxnDetail());

        //  requestutil.validate(request);
System.out.println("Batch no 15 :" +request.getBATCHNO());
        CREATEMJRNLBOOKFSFSREQ fcubsMainHeader = new CREATEMJRNLBOOKFSFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCAT");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("3211411");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH("100");
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSDEService");
        fcubsheader.setOPERATION("CreateMjrnlbook");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);

        MultiJrnlBookFullType multiJrnlBookFullType = new  MultiJrnlBookFullType();
        multiJrnlBookFullType.setREFERENCENO(request.getREFERENCENO());
        multiJrnlBookFullType.setBATCHNO(request.getBATCHNO());
        multiJrnlBookFullType.setTOTALCR(request.getTOTALCR());
        multiJrnlBookFullType.setTOTALDR(request.getTOTALDR());

        List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> details = request.getDetbsJrnlTxnDetail();
        System.out.println(details.toString());
        // Separate into debit and credit legs, regardless of count
        List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> debits = new ArrayList<>();
        List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> credits = new ArrayList<>();

        for (MultiJrnlBookFullType.DetbsJrnlTxnDetail detail : details) {
            System.out.println("indicator is :" + detail.getDRCR());
            if ("D".equalsIgnoreCase(detail.getDRCR())) {
                detail.setSERIALNO(detail.getSERIALNO());
                detail.setUSERREFNO(detail.getUSERREFNO());
                detail.setDRCR(detail.getDRCR());
                detail.setBRANCHCODE(detail.getBRANCHCODE());
                detail.setACCORGL(detail.getACCORGL());
                detail.setCCY(detail.getCCY());
                detail.setAMOUNT(detail.getAMOUNT());
                detail.setTXNCODE(detail.getTXNCODE());
                detail.setLCYAMOUNT(detail.getLCYAMOUNT());
                detail.setEXCHRATE(detail.getEXCHRATE());
                detail.setACCOUNT(detail.getACCOUNT());
                detail.setACDESC(detail.getACDESC());
                debits.add(detail);
            } else if ("C".equalsIgnoreCase(detail.getDRCR())) {
                detail.setSERIALNO(detail.getSERIALNO());
                detail.setUSERREFNO(detail.getUSERREFNO());
                detail.setDRCR(detail.getDRCR());
                detail.setBRANCHCODE(detail.getBRANCHCODE());
                detail.setACCORGL(detail.getACCORGL());
                detail.setCCY(detail.getCCY());
                detail.setAMOUNT(detail.getAMOUNT());
                detail.setTXNCODE(detail.getTXNCODE());
                detail.setLCYAMOUNT(detail.getLCYAMOUNT());
                detail.setEXCHRATE(detail.getEXCHRATE());
                detail.setACCOUNT(detail.getACCOUNT());
                detail.setACDESC(detail.getACDESC());
                credits.add(detail);
            } else {
                throw new IllegalArgumentException(
                        "Invalid drcr value '" + detail.getDRCR() + "' at serialno " + detail.getSERIALNO());
            }
        }




        MultiJrnlBookFullType.DetbsBatchMaster  detbsbatchmaster = new  MultiJrnlBookFullType.DetbsBatchMaster();
        detbsbatchmaster.setBATCHNO(request.getBATCHNO());
        detbsbatchmaster.setCRENTTOTAL(request.getTOTALCR());
        detbsbatchmaster.setDRENTTOTAL(request.getTOTALDR());
       // detbsbatchmaster.setDESCRIPTION(request.);
        multiJrnlBookFullType.setDetbsBatchMaster(detbsbatchmaster);



        MultiJrnlBookFullType.DevwsBatchMaster  devwsbatchmaster = new  MultiJrnlBookFullType.DevwsBatchMaster();
        devwsbatchmaster.setBALANCING("Y");
        devwsbatchmaster.setBATCHNUMBER(request.getBATCHNO());
        //devwsbatchmaster.setCREDIT();
        //devwsbatchmaster.setDEBIT();
        //devwsbatchmaster.setDESCRIPTION(request.g);
        multiJrnlBookFullType.setDevwsBatchMaster(devwsbatchmaster);


        CREATEMJRNLBOOKFSFSREQ.FCUBSBODY flexbosy = new CREATEMJRNLBOOKFSFSREQ.FCUBSBODY();
        flexbosy.setDetbsJrnlTxnMasterFull(multiJrnlBookFullType);
        fcubsMainHeader.setFCUBSBODY(flexbosy);
       System.out.println(fcubsMainHeader.toString().toString());
        template = new WebServiceTemplate(marshaller);
        CREATEMJRNLBOOKFSFSRES response = (CREATEMJRNLBOOKFSFSRES) template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSDEService/FCUBSDEService", fcubsMainHeader);
        return response;
    }









}
