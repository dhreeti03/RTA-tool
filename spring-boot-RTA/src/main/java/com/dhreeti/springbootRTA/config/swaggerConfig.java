package com.dhreeti.springbootRTA.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2

public class swaggerConfig {

	@Bean 
	
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.dhreeti.springbootRTA"))
		.paths(PathSelectors.regex("/demo.*"))
	    .build()
	    .apiInfo(metaInfo());
	}
	
	public swaggerConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	private ApiInfo metaInfo() {
		
		ApiInfo apiInfo = new ApiInfo(
				" Spring boot RestAPI automation",
				"Rest API description ",
				"Version 1.0",
				"terms of service", 
				new Contact ("dhreeti shah", "example/fff", "123455@gmail.com"),
				"Apache License Version 2.0",
                "https://www.apache.org/licesen.html", null
				);
		return apiInfo;
			
				
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("generate documentation ");
	}
	
}
