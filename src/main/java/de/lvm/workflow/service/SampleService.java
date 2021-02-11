package de.lvm.workflow.service;

import de.lvm.workflow.service.to.TOInputManagementBeleg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private static final Logger log = LoggerFactory.getLogger(SampleService.class);

    public String doSomething(TOInputManagementBeleg toInputManagementBeleg) {
        log.info("process {}", toInputManagementBeleg);
        return toInputManagementBeleg.getId();
    }
}
