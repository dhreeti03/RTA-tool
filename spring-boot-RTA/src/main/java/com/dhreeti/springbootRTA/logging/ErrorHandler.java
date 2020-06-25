package com.dhreeti.springbootRTA.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dhreeti.springbootRTA.config.UserNotFoundException;

@ControllerAdvice 
public class ErrorHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorHandler.class);
	
	@ExceptionHandler (UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleException (UserNotFoundException ex) {
		
		LOGGER.debug("handling error404");
		
		
	}

}
