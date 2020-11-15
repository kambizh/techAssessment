package com.tmrnd.techAssessment;

import com.tmrnd.techAssessment.services.ProcessFileService;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class loaderCamelRoute extends RouteBuilder {

    @Autowired
    ProcessFileService processFileService;

    @Override
    public void configure() throws Exception {

        from("file:{{camel.input.folder}}")
                .log("Processing file : ${file:name} from {{camel.input.folder}} ")
                .bean(processFileService, "readFile")
                .to("file:{{camel.output.folder}}")
                .log("Write into output folder");
    }
}
