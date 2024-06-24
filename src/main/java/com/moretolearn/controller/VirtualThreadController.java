package com.moretolearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirtualThreadController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VirtualThreadController.class);
    public static final int SLEEP_TIME = 300;

    @GetMapping("/")
    public String getResponse(){
        long threadId = Thread.currentThread().threadId();
        LOGGER.info(Thread.currentThread().getName());
        return  String.valueOf(threadId);
    }
}
