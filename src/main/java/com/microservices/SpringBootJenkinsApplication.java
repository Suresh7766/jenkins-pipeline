package com.microservices;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void onInit() {
		logger.info("Spring Boot Jenkins App Started!...");
	}

	public static void main(String[] args) {
		logger.info("Spring Boot Jenkins App Executing!..");
		logger.info("Spring Boot Jenkins App 2nd Condition Executing!..");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
