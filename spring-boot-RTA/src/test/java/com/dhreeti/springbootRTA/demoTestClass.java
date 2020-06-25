package com.dhreeti.springbootRTA;

import java.util.Properties;

import org.jboss.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;



public class demoTestClass {

	final static Logger logger = Logger.getLogger(demoTestClass.class);
	
	private static Properties props;
	
	Gson gson = new GsonBuilder().serializeNulls().create(); 
	
    RequestSpecBuilder reqSpecBuilderGET = new RequestSpecBuilder()
    		.log(LogDetail.ALL).setContentType(ContentType.JSON).setAccept(ContentType.JSON);
             ResponseSpecification commonResponseSpec = new ResponseSpecBuilder()
    		.expectStatusCode(200).expectStatusLine("HTTP/1.1 200 OK").build();
    
    
    public Response makeGETRequest (String URL)
    {
        Response
            response =
            RestAssured.given().spec(reqSpecBuilderGET.build()).redirects().follow(true).when()
                .get(URL).then().extract()
                .response();
     return response;
    }
   
}
