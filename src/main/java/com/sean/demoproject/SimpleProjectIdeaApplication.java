package com.sean.demoproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleProjectIdeaApplication {

    private static Logger logger = LoggerFactory.getLogger(SimpleProjectIdeaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SimpleProjectIdeaApplication.class, args);
        logger.info("project started");
    }
}
