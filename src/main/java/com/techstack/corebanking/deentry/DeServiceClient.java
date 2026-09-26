package com.bayeesoft.deentry;

import com.bayeesoft.DTO.QueryRequest;
import com.bayeesoft.DTO.ReversalRequest;
import com.bayeesoft.deentry.dto.*;
import com.bayeesoft.stub.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;

@Service
public class DeServiceClient {
    @Autowired
    private Jaxb2Marshaller marshaller;
    private WebServiceTemplate template;

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DeServiceClient.class);

    private final WebServiceTemplate webServiceTemplate;

    @Value("${fcubs.de-service-url}")
    private String deServiceUrl;

    @Value("${fcubs.source:FCAT}")
    private String source;

    @Value("${fcubs.user-id:TAKEON02}")
    private String userId;

    @Value("${fcubs.password}")
    private String password;

    @Value("${fcubs.branch:100}")
    private String branch;

    @Value("${fcubs.service:FCUBSDEService}")
    private String service;

    @Value("${fcubs.operation:CreateMjrnlbook}")
    private String operation;

    public DeServiceClient(Jaxb2Marshaller marshaller) {
        this.webServiceTemplate = new WebServiceTemplate(marshaller);
    }

    public CREATEMJRNLBOOKFSFSRES createMultijrn(
            MultiDeJournalRequest request) {

        LOGGER.info(
                "Creating Multi DE Journal. referenceNo={}, batchNo={}, totalDr={}, totalCr={}, detailCount={}",
                request.getReferenceno(),
                request.getBatchno(),
                request.getTotaldr(),
                request.getTotalcr(),
                request.getDetbsJrnlTxnDetail() == null
                        ? 0
                        : request.getDetbsJrnlTxnDetail().size()
        );

        validateRequest(request);

        CREATEMJRNLBOOKFSFSREQ soapRequest =
                buildSoapRequest(request);

        LOGGER.debug("Sending Multi DE Journal request to Flexcube: {}",
                deServiceUrl);

        try {

            CREATEMJRNLBOOKFSFSRES response =
                    (CREATEMJRNLBOOKFSFSRES)
                            webServiceTemplate.marshalSendAndReceive(
                                    deServiceUrl,
                                    soapRequest
                            );

            LOGGER.info(
                    "Multi DE Journal request completed. referenceNo={}",
                    request.getReferenceno()
            );

            return response;

        } catch (Exception ex) {

            LOGGER.error(
                    "Error sending Multi DE Journal to Flexcube. referenceNo={}, batchNo={}",
                    request.getReferenceno(),
                    request.getBatchno(),
                    ex
            );

            throw ex;
        }
    }

    private CREATEMJRNLBOOKFSFSREQ buildSoapRequest(
            MultiDeJournalRequest request) {

        CREATEMJRNLBOOKFSFSREQ soapRequest =
                new CREATEMJRNLBOOKFSFSREQ();

        /*
         * FCUBS HEADER
         */
        FCUBSHEADERType header = buildFcubsHeader();

        soapRequest.setFCUBSHEADER(header);

        /*
         * FCUBS BODY
         */
        CREATEMJRNLBOOKFSFSREQ.FCUBSBODY body =
                new CREATEMJRNLBOOKFSFSREQ.FCUBSBODY();

        MultiJrnlBookFullType journal =
                buildJournal(request);

        body.setDetbsJrnlTxnMasterFull(journal);

        soapRequest.setFCUBSBODY(body);

        return soapRequest;
    }

    private FCUBSHEADERType buildFcubsHeader() {

        FCUBSHEADERType header = new FCUBSHEADERType();

        header.setSOURCE(source);
        header.setUBSCOMP(UBSCOMPType.FCUBS);
        header.setMSGID("");
        header.setUSERID(userId);
        header.setPASSWORD(password);
        header.setBRANCH(branch);
        header.setMODULEID("");
        header.setSERVICE(service);
        header.setOPERATION(operation);

        return header;
    }

    private MultiJrnlBookFullType buildJournal(
            MultiDeJournalRequest request) {

        MultiJrnlBookFullType journal =
                new MultiJrnlBookFullType();

        /*
         * Master information
         */
       // journal.setREFERENCENO(request.getReferenceno());
        journal.setBATCHNO(request.getBatchno());
        journal.setCURRNO(request.getCurrno());
        journal.setTEMPLATECODE(request.getTemplatecode());
        journal.setVALUEDATE(request.getValuedate());
        journal.setBRANCHCODE(request.getBranchcode());
        journal.setCCY(request.getCcy());

        journal.setTOTALDR(request.getTotaldr());
        journal.setTOTALCR(request.getTotalcr());

        journal.setMAKER(request.getMaker());
        journal.setMAKDTTIME(request.getMakdttime());
        journal.setCHECHKERID(request.getChechkerid());
        journal.setCHKDTTIME(request.getChkdttime());

        journal.setAUTHSTAT(request.getAuthstat());
        journal.setTXNSTAT(request.getTxnstat());
        journal.setFUNDID(request.getFundid());

        journal.setRECNO(request.getRecno());
        journal.setTOTALNO(request.getTotalno());

        /*
         * Journal transaction details
         */
        List<MultiJrnlBookFullType.DetbsJrnlTxnDetail> details =
                buildTransactionDetails(request);

        journal.getDetbsJrnlTxnDetail().addAll(details);

        /*
         * Batch master
         */
        MultiJrnlBookFullType.DetbsBatchMaster batchMaster =
                new MultiJrnlBookFullType.DetbsBatchMaster();

        batchMaster.setBATCHNO(request.getDetbsBatchMaster().getBatchno());
        batchMaster.setDESCRIPTION(request.getDetbsBatchMaster().getDescription());
        batchMaster.setCREDIT(request.getDetbsBatchMaster().getCredit());
        batchMaster.setDEBIT(request.getDetbsBatchMaster().getCredit());
        batchMaster.setDRENTTOTAL(request.getDetbsBatchMaster().getDrenttotal());
        batchMaster.setCRENTTOTAL(request.getDetbsBatchMaster().getCrenttotal());

        journal.setDetbsBatchMaster(batchMaster);

        System.out.println("Drentris is :" + request.getDetbsBatchMaster().getDrenttotal());
        System.out.println("Crentris is :" + request.getDetbsBatchMaster().getCrenttotal());

        /*
         * Development batch master
         */
        MultiJrnlBookFullType.DevwsBatchMaster devwsBatchMaster =
                new MultiJrnlBookFullType.DevwsBatchMaster();

        devwsBatchMaster.setBATCHNUMBER(request.getDevwsBatchMaster().getBatchnumber());
        devwsBatchMaster.setDESCRIPTION(request.getDevwsBatchMaster().getDescription());
        devwsBatchMaster.setCREDIT(request.getDevwsBatchMaster().getCredit());
        devwsBatchMaster.setDEBIT(request.getDevwsBatchMaster().getDebit());
        devwsBatchMaster.setLASTAUTHORISEDBY(request.getDevwsBatchMaster().getLastauthorisedby());
        devwsBatchMaster.setBALANCING(request.getDevwsBatchMaster().getBalancing());

        journal.setDevwsBatchMaster(devwsBatchMaster);

        /*
         * MIS details
         */
        if (request.getMisdetails() != null) {
            journal.setMisdetails(
                    mapMisDetails(request)
            );
        }

        return journal;
    }

    private List<MultiJrnlBookFullType.DetbsJrnlTxnDetail>
    buildTransactionDetails(MultiDeJournalRequest request) {

        if (request.getDetbsJrnlTxnDetail() == null ||
                request.getDetbsJrnlTxnDetail().isEmpty()) {

            throw new IllegalArgumentException(
                    "At least one journal transaction detail is required"
            );
        }

        return request.getDetbsJrnlTxnDetail()
                .stream()
                .map(this::mapTransactionDetail)
                .toList();
    }

    private MultiJrnlBookFullType.DetbsJrnlTxnDetail mapTransactionDetail(
            JournalDetailRequest requestDetail){

        String drcr = requestDetail.getDrcr();

        if (!"D".equalsIgnoreCase(drcr) &&
                !"C".equalsIgnoreCase(drcr)) {

            throw new IllegalArgumentException(
                    "Invalid DRCR value '" +
                            drcr +
                            "' at serial number " +
                            requestDetail.getSerialno()
            );
        }

        MultiJrnlBookFullType.DetbsJrnlTxnDetail detail =
                new MultiJrnlBookFullType.DetbsJrnlTxnDetail();

        detail.setSERIALNO(requestDetail.getSerialno());
        detail.setUSERREFNO(requestDetail.getUserrefno());
        detail.setDRCR(requestDetail.getDrcr());
        detail.setBRANCHCODE(requestDetail.getBranchcode());
        detail.setACCORGL(requestDetail.getAccorgl());
        detail.setCCY(requestDetail.getCcy());
        detail.setAMOUNT(requestDetail.getAmount());
        detail.setTXNCODE(requestDetail.getTxncode());
        detail.setINSTRUMENTNO(requestDetail.getInstrumentno());
        detail.setLCYAMOUNT(requestDetail.getLcyamount());
        detail.setADDLTEXT(requestDetail.getAddltext());
        detail.setACDESC(requestDetail.getAcdesc());
        detail.setCUSTOMER(requestDetail.getCustomer());
        detail.setEXCHRATE(requestDetail.getExchrate());
        detail.setACCOUNT(requestDetail.getAccount());

        return detail;
    }

    private TxnMISFullType mapMisDetails(
            MultiDeJournalRequest request) {

        TxnMISFullTypeRequest source =
                request.getMisdetails();

        TxnMISFullType target =
                new TxnMISFullType();

        target.setCONREFNO(source.getConrefno());
        target.setMISGRP(source.getMisgrp());
        target.setRELACC(source.getRelacc());
        target.setRELETEDREFERENCE(source.getReletedreference());
        target.setMISHEAD(source.getMishead());
        target.setRATEFLG(source.getRateflg());
        target.setPOOLCD(source.getPoolcd());
        target.setREFINANCERATE(source.getRefinancerate());
        target.setREFRATETYP(source.getRefratetyp());
        target.setCALCMETH1(source.getCalcmeth1());
        target.setREFSPREAD(source.getRefspread());
        target.setREFRATECD(source.getRefratecd());

        target.setCOSTCD1(source.getCostcd1());
        target.setCOSTCD2(source.getCostcd2());
        target.setCOSTCD3(source.getCostcd3());
        target.setCOSTCD4(source.getCostcd4());
        target.setCOSTCD5(source.getCostcd5());

        return target;
    }

    private void validateRequest(MultiDeJournalRequest request) {

        if (request == null) {
            throw new IllegalArgumentException(
                    "Multi DE Journal request cannot be null"
            );
        }
/**
        if (request.getReferenceno() == null ||
                request.getReferenceno().isBlank()) {

            throw new IllegalArgumentException(
                    "Reference number is required"
            );
        }
**/
        if (request.getBatchno() == null ||
                request.getBatchno().isBlank()) {

            throw new IllegalArgumentException(
                    "Batch number is required"
            );
        }

        if (request.getDetbsJrnlTxnDetail() == null ||
                request.getDetbsJrnlTxnDetail().isEmpty()) {

            throw new IllegalArgumentException(
                    "Journal transaction details are required"
            );
        }





    }


    // another service start here

    public  AUTHORIZEMJRNLBOOKFSFSRES authmuljn (AutorizeRequeat autorizeequeat) {

        AUTHORIZEMJRNLBOOKFSFSREQ fcubsMainHeader = new AUTHORIZEMJRNLBOOKFSFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCAT");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH("101");
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSDEService");
        fcubsheader.setOPERATION("AuthorizeMjrnlbook");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);

        MultiJrnlBookFullType multibook = new MultiJrnlBookFullType();
        multibook.setREFERENCENO(autorizeequeat.getReferenceno());
        multibook.setBATCHNO(autorizeequeat.getBatchno());
        multibook.setBRANCHCODE(autorizeequeat.getBranchcode());

        AUTHORIZEMJRNLBOOKFSFSREQ.FCUBSBODY flexbosy = new AUTHORIZEMJRNLBOOKFSFSREQ.FCUBSBODY();
        flexbosy.setDetbsJrnlTxnMasterFull(multibook);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        AUTHORIZEMJRNLBOOKFSFSRES response = (AUTHORIZEMJRNLBOOKFSFSRES)  template.marshalSendAndReceive(deServiceUrl,fcubsMainHeader);
        return response ;


    }




    public CREATEMJRNLBOOKFSFSRES CreateMuiltiv2 (MultiDeJournalRequest request) {

        String brn =  request.getDetbsJrnlTxnDetail().get(0).getBranchcode();
        CREATEMJRNLBOOKFSFSREQ fcubsMainHeader = new CREATEMJRNLBOOKFSFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCUBS");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH(brn);
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSDEService");
        fcubsheader.setOPERATION("CreateMjrnlbook");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);


        MultiJrnlBookFullType  multijrnltemlfulltype = new MultiJrnlBookFullType();

        multijrnltemlfulltype.setBRANCHCODE(request.getBranchcode());
        multijrnltemlfulltype.setBATCHNO(request.getBatchno());
        //multijrnltemlfulltype.setREFERENCENO(request.getReferenceno());
        multijrnltemlfulltype.setCCY(request.getCcy());
        multijrnltemlfulltype.setCURRNO(request.getCurrno());
        multijrnltemlfulltype.setTOTALDR(request.getTotaldr());
        multijrnltemlfulltype.setTOTALCR(request.getTotalcr());
        multijrnltemlfulltype.setTOTALNO(request.getTotalno());


        MultiJrnlBookFullType.DetbsJrnlTxnDetail detail1 = new MultiJrnlBookFullType.DetbsJrnlTxnDetail();
        detail1.setSERIALNO(request.getDetbsJrnlTxnDetail().get(0).getSerialno());
        detail1.setDRCR(request.getDetbsJrnlTxnDetail().get(0).getDrcr());
        detail1.setACCORGL(request.getDetbsJrnlTxnDetail().get(0).getAccorgl());
        detail1.setTXNCODE(request.getDetbsJrnlTxnDetail().get(0).getTxncode());
        detail1.setADDLTEXT(request.getDetbsJrnlTxnDetail().get(0).getAddltext());
        detail1.setCCY(request.getDetbsJrnlTxnDetail().get(0).getCcy());
        detail1.setCUSTOMER(request.getDetbsJrnlTxnDetail().get(0).getCustomer());
        detail1.setBRANCHCODE(request.getDetbsJrnlTxnDetail().get(0).getBranchcode());
        detail1.setAMOUNT(request.getDetbsJrnlTxnDetail().get(0).getAmount());
        detail1.setACCOUNT(request.getDetbsJrnlTxnDetail().get(0).getAccount());
        detail1.setLCYAMOUNT(request.getDetbsJrnlTxnDetail().get(0).getLcyamount());
        detail1.setEXCHRATE(request.getDetbsJrnlTxnDetail().get(0).getExchrate());
        detail1.setUSERREFNO(request.getDetbsJrnlTxnDetail().get(0).getUserrefno());
        detail1.setACDESC(request.getDetbsJrnlTxnDetail().get(0).getAcdesc());
        detail1.setINSTRUMENTNO(request.getDetbsJrnlTxnDetail().get(0).getInstrumentno());
        // Add all to the list
        multijrnltemlfulltype.getDetbsJrnlTxnDetail().add(detail1);

        MultiJrnlBookFullType.DetbsJrnlTxnDetail detail2 = new MultiJrnlBookFullType.DetbsJrnlTxnDetail();
        detail2.setSERIALNO(request.getDetbsJrnlTxnDetail().get(1).getSerialno());
        detail2.setDRCR(request.getDetbsJrnlTxnDetail().get(1).getDrcr());
        detail2.setACCORGL(request.getDetbsJrnlTxnDetail().get(1).getAccorgl());
        detail2.setTXNCODE(request.getDetbsJrnlTxnDetail().get(1).getTxncode());
        detail2.setADDLTEXT(request.getDetbsJrnlTxnDetail().get(1).getAddltext());
        detail2.setCCY(request.getDetbsJrnlTxnDetail().get(1).getCcy());
        detail2.setCUSTOMER(request.getDetbsJrnlTxnDetail().get(1).getCustomer());
        detail2.setBRANCHCODE(request.getDetbsJrnlTxnDetail().get(1).getBranchcode());
        detail2.setAMOUNT(request.getDetbsJrnlTxnDetail().get(1).getAmount());
        detail2.setACCOUNT(request.getDetbsJrnlTxnDetail().get(1).getAccount());
        detail2.setLCYAMOUNT(request.getDetbsJrnlTxnDetail().get(1).getLcyamount());
        detail2.setEXCHRATE(request.getDetbsJrnlTxnDetail().get(1).getExchrate());
        detail2.setUSERREFNO(request.getDetbsJrnlTxnDetail().get(1).getUserrefno());
        detail2.setACDESC(request.getDetbsJrnlTxnDetail().get(1).getAcdesc());
        detail2.setINSTRUMENTNO(request.getDetbsJrnlTxnDetail().get(1).getInstrumentno());

        multijrnltemlfulltype.getDetbsJrnlTxnDetail().add(detail2);


        MultiJrnlBookFullType.DetbsBatchMaster batchMaster =
                new MultiJrnlBookFullType.DetbsBatchMaster();

        batchMaster.setBATCHNO(request.getDetbsBatchMaster().getBatchno());
        batchMaster.setDESCRIPTION(request.getDetbsBatchMaster().getDescription());
        batchMaster.setCREDIT(request.getDetbsBatchMaster().getCredit());
        batchMaster.setDEBIT(request.getDetbsBatchMaster().getCredit());
        batchMaster.setDRENTTOTAL(request.getDetbsBatchMaster().getDrenttotal());
        batchMaster.setCRENTTOTAL(request.getDetbsBatchMaster().getCrenttotal());

        multijrnltemlfulltype.setDetbsBatchMaster(batchMaster);

        /*
         * Development batch master
         */
        MultiJrnlBookFullType.DevwsBatchMaster devwsBatchMaster =
                new MultiJrnlBookFullType.DevwsBatchMaster();

        devwsBatchMaster.setBATCHNUMBER(request.getDevwsBatchMaster().getBatchnumber());
        devwsBatchMaster.setDESCRIPTION(request.getDevwsBatchMaster().getDescription());
        devwsBatchMaster.setCREDIT(request.getDevwsBatchMaster().getCredit());
        devwsBatchMaster.setDEBIT(request.getDevwsBatchMaster().getDebit());
        devwsBatchMaster.setLASTAUTHORISEDBY(request.getDevwsBatchMaster().getLastauthorisedby());
        devwsBatchMaster.setBALANCING(request.getDevwsBatchMaster().getBalancing());



        multijrnltemlfulltype.setDevwsBatchMaster(devwsBatchMaster);

        CREATEMJRNLBOOKFSFSREQ.FCUBSBODY flexbosy = new CREATEMJRNLBOOKFSFSREQ.FCUBSBODY();
        flexbosy.setDetbsJrnlTxnMasterFull(multijrnltemlfulltype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);
        template = new WebServiceTemplate(marshaller);
        CREATEMJRNLBOOKFSFSRES response = (CREATEMJRNLBOOKFSFSRES)  template.marshalSendAndReceive(deServiceUrl,fcubsMainHeader);
        return response ;
    }

   public REVERSECOMMONREVERSALFSFSRES ReseverJrn (ReversalRequest reversalRequest) {


       REVERSECOMMONREVERSALFSFSREQ fcubsMainHeader = new REVERSECOMMONREVERSALFSFSREQ();
       FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
       fcubsheader.setSOURCE("FCUBS");
       fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
       fcubsheader.setMSGID("");
       fcubsheader.setCORRELID(null);
       fcubsheader.setUSERID("TAKEON02");
       fcubsheader.setPASSWORD("Oracle@2");
       fcubsheader.setBRANCH("100");
       fcubsheader.setMODULEID("");
       fcubsheader.setSERVICE("FCUBSDEService");
       fcubsheader.setOPERATION("ReverseCommonReversal");
       fcubsMainHeader.setFCUBSHEADER(fcubsheader);

       CommonReversalFullType reserval = new CommonReversalFullType();
       reserval.setTRNREFNO(reversalRequest.getTrnrefno());
       reserval.setAMOUNTTAGG(reversalRequest.getAmounttagg());
       reserval.setEVENTSRNOO(reversalRequest.getEventsrnoo());




       REVERSECOMMONREVERSALFSFSREQ.FCUBSBODY flexbosy = new REVERSECOMMONREVERSALFSFSREQ.FCUBSBODY();
       flexbosy.setAcvwsAllAcEntriesFull(reserval);
       fcubsMainHeader.setFCUBSBODY(flexbosy);
       template = new WebServiceTemplate(marshaller);
       REVERSECOMMONREVERSALFSFSRES response = (REVERSECOMMONREVERSALFSFSRES)  template.marshalSendAndReceive(deServiceUrl,fcubsMainHeader);
       return response ;

   }

   public QUERYMJRNLBOOKIOFSRES QueryMultiJrn(QueryRequest queryRequest) {

       QUERYMJRNLBOOKIOFSREQ fcubsMainHeader = new QUERYMJRNLBOOKIOFSREQ();
       FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
       fcubsheader.setSOURCE("FCUBS");
       fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
       fcubsheader.setMSGID("");
       fcubsheader.setCORRELID(null);
       fcubsheader.setUSERID("TAKEON02");
       fcubsheader.setPASSWORD("Oracle@2");
       fcubsheader.setBRANCH("100");
       fcubsheader.setMODULEID("");
       fcubsheader.setSERVICE("FCUBSDEService");
       fcubsheader.setOPERATION("QueryMjrnlbook");
       fcubsMainHeader.setFCUBSHEADER(fcubsheader);

       MultiJrnlBookQueryIOType  multibookquery = new MultiJrnlBookQueryIOType() ;
       multibookquery.setREFERENCENO(queryRequest.getReferenceno());

       QUERYMJRNLBOOKIOFSREQ.FCUBSBODY flexbosy = new QUERYMJRNLBOOKIOFSREQ.FCUBSBODY();
       flexbosy.setDetbsJrnlTxnMasterIO(multibookquery);
       fcubsMainHeader.setFCUBSBODY(flexbosy);
       template = new WebServiceTemplate(marshaller);
       QUERYMJRNLBOOKIOFSRES response = (QUERYMJRNLBOOKIOFSRES)  template.marshalSendAndReceive(deServiceUrl,fcubsMainHeader);
       return response ;

   }

}

