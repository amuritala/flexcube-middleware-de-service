package com.bayeesoft.deentry;

import com.bayeesoft.deentry.dto.JournalDetailRequest;
import com.bayeesoft.deentry.dto.MultiDeJournalRequest;
import com.bayeesoft.deentry.dto.TxnMISFullTypeRequest;
import com.bayeesoft.stub.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;

@Service
public class DeServiceClient {

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

        LOGGER.info(" detbsBatchMaster batchNo : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getBATCHNO());

        LOGGER.info(" detbsBatchMaster description : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getDESCRIPTION());

        LOGGER.info(" detbsBatchMaster credit : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getCREDIT());

        LOGGER.info(" detbsBatchMaster debit : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getDEBIT());

        LOGGER.info(" detbsBatchMaster drentotal : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getDRENTTOTAL());

        LOGGER.info(" detbsBatchMaster crentotal : {}",
                soapRequest.getFCUBSBODY().getDetbsJrnlTxnMasterFull().getDetbsBatchMaster().getDRENTTOTAL());


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
        header.setMSGID("3211411");
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
        journal.setREFERENCENO(request.getReferenceno());
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

        if (request.getReferenceno() == null ||
                request.getReferenceno().isBlank()) {

            throw new IllegalArgumentException(
                    "Reference number is required"
            );
        }

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
}

