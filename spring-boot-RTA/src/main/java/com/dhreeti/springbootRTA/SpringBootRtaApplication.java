 package com.dhreeti.springbootRTA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
public class SpringBootRtaApplication {

	
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootRtaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRtaApplication.class, args);
		
		
		LOGGER.error("Message logged at ERROR level");
		LOGGER.warn("Message logged at WARN level");
		LOGGER.info("Message logged at INFO level");
		LOGGER.debug("Message logged at DEBUG level");
		LOGGER.info("logging...");
	}

}
