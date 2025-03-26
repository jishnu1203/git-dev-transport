package com.transport.heavyvehical.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transport")
@Slf4j
public class TransportController {
    /*java -jar app.jar --name="Spring"*/
    @Value("${transport.name}")
    private String name;
    @Value("${transport.name.secondary}")
    private String secondaryName;


    @GetMapping("/logDetails")
    public String logDetails() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }

    @GetMapping("/firstResponse")
    public String getFirstResponse(){
        return  "My first Response";
    }

    @GetMapping("/name")
    public String getName(){
        return  name;
    }

    @GetMapping("/secondaryName")
    public String getSecondaryName(){
        return  secondaryName;
    }


}
