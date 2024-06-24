package com.moretolearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootVirtualThreadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVirtualThreadsApplication.class, args);
	}

}
