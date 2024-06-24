package com.moretolearn.controller;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class VirtualThreadController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VirtualThreadController.class);
    public static final int SLEEP_TIME = 300;

    @GetMapping("/")
    public String getResponse(){
        try {
            TimeUnit.MILLISECONDS.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            LOGGER.error(e.getMessage());
        }

        long threadId = Thread.currentThread().threadId() ;
        return  String.valueOf(threadId);
    }
}
