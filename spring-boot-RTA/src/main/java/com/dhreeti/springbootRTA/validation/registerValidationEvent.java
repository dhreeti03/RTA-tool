package com.dhreeti.springbootRTA.validation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
//public class registerValidationEvent {
	
	//@Configuration
/*	public class ValidatorEventRegister implements InitializingBean {
	 
	    @Autowired
	    ValidatingRepositoryEventListener validatingRepositoryEventListener;
	 
	    @Autowired
	    private Map<String, Validator> validators;
	 
	    @Override
	    public void afterPropertiesSet() throws Exception {
	        List<String> events = Arrays.asList("beforeCreate");
	        for (Map.Entry<String, Validator> entry : validators.entrySet()) {
	            events.stream()
	              .filter(p -> entry.getKey().startsWith(p))
	              .findFirst()
	              .ifPresent(
	                p -> validatingRepositoryEventListener
	               .addValidator(p, entry.getValue()));
	        }
	    }
	} */


