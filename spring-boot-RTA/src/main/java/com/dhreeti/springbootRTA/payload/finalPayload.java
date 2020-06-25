package com.dhreeti.springbootRTA.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class finalPayload {

	public static void main(String[] args) throws JsonProcessingException {
		
		Info info = new Info("test455","test4555", "12345@test.com");
		
		userDetails userDetails = new userDetails("Test");
		payload p = new payload("demo summary", "demo description", info, userDetails);
		
		fields f = new fields(p);
			
		ObjectMapper om = new ObjectMapper();
		
		String data = om.writerWithDefaultPrettyPrinter().writeValueAsString(f );
		
		System.out.println(data);
		
	}

}
