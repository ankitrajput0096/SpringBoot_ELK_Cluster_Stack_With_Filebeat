package com.elasticsearch.logger_generator_service_2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "loggerTwo")
public class logControllerTwo {

    // Creating a logger object for this class and use it to generate logs
    private static final Logger logger = LoggerFactory.getLogger(logControllerTwo.class);

    @GetMapping("/logTwo")
    public ResponseEntity<String> generateLogs() {
        logger.info("This is how we generate logs in spring boot application in style from service two.");
        logger.error("This is error in the service two");
        logger.warn("This is warning in the service two");
        logger.debug("This is debug in the service two");
        logger.trace("This is trace in the service two");
        return ResponseEntity.ok("Awesome!!! we have generated logs from service two.");
    }

    @GetMapping("/logTwoException")
    public ResponseEntity<String> generateLogException() {
        try{
            int value = 1/0;
        } catch (Exception e) {
            logger.info("This is how we generate logs from service two via exception api.");
            logger.error("This is error in the service two" + e.getStackTrace().toString());
            return ResponseEntity.badRequest().body("This is a request which results in exception");
        }
        return ResponseEntity.ok("Awesome!!! we have generated logs from service two.");
    }
}