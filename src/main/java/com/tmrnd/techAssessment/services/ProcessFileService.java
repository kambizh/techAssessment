package com.tmrnd.techAssessment.services;

import org.apache.camel.Exchange;
import org.apache.camel.ExecutorServiceAware;
import org.apache.camel.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.lang.invoke.MethodHandles;

@Service
public class ProcessFileService {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());


    void readFile(Exchange exc) {
        Message msg = exc.getIn();
        Object file = msg.getBody();
        log.info("Reading file ");
    }
}
