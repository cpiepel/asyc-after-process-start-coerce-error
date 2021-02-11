package de.lvm.workflow.service;


import de.lvm.workflow.service.to.TOInputManagementBeleg;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class StartProcessService {


    public static final String BELEG_INPUT = "belegInput";
    public static final String NOT_WORKING_P_ID = "not-working-asyc-after-process-start-coerce-error-process";
    public static final String WORKING_P_ID = "working-asyc-after-process-start-coerce-error-process";
    private final RuntimeService runtimeService;

    private static final Logger log = LoggerFactory.getLogger( StartProcessService.class );

    @Autowired
    public StartProcessService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @RequestMapping(value = "/startProcess", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String startProcess(){
        log.info("process starting ...");
        TOInputManagementBeleg toInputManagementBeleg = getToInputManagementBeleg();

        VariableMap variableMap = Variables.createVariables().putValue(BELEG_INPUT, toInputManagementBeleg);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(WORKING_P_ID, variableMap);
        String processInstanceId = processInstance.getProcessInstanceId();
        log.info("process started: {}" , processInstanceId);
        return processInstanceId;
    }


    @RequestMapping(value = "/startProcessError", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String startProcessError(){
        log.info("process starting ...");
        TOInputManagementBeleg toInputManagementBeleg = getToInputManagementBeleg();
        VariableMap variableMap = Variables.createVariables().putValue(BELEG_INPUT, toInputManagementBeleg);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(NOT_WORKING_P_ID, variableMap);
        String processInstanceId = processInstance.getProcessInstanceId();
        log.info("process started: {}" , processInstanceId);
        return processInstance.getProcessInstanceId();
    }

    private TOInputManagementBeleg getToInputManagementBeleg() {
        TOInputManagementBeleg toInputManagementBeleg = new TOInputManagementBeleg();
        toInputManagementBeleg.setBehandlungAnzahlTage(0);
        toInputManagementBeleg.setBelegRechnungsBetrag(new BigDecimal("0.00"));
        toInputManagementBeleg.setBelegRegulierungsStatusSchluessel(1);
        toInputManagementBeleg.setBelegEingangsDatum(LocalDate.of(2020, 11, 16));
        toInputManagementBeleg.setPersonNummer(0);
        toInputManagementBeleg.setDokumentTypSchluessel(1091);
        toInputManagementBeleg.setVsnr((long) 700041417);
        toInputManagementBeleg.setVeraenderungsZeitpunkt(LocalDateTime.of(2020, 12, 17, 14, 48, 42, 308148));
        toInputManagementBeleg.setErstellungsZeitpunkt(LocalDateTime.of(2020, 12, 15, 13, 48, 37, 909924));
        toInputManagementBeleg.setErstellungsCcid("KVPOOL");
        toInputManagementBeleg.setVeraenderungsCcid("NQ2153");
        toInputManagementBeleg.setBriefBarcode(Long.valueOf("2020321100001"));
        toInputManagementBeleg.setBelegNummer(1);
        return toInputManagementBeleg;
    }
}
