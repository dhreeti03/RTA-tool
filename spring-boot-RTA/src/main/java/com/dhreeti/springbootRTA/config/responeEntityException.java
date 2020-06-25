package com.dhreeti.springbootRTA.config;

import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice 
public class responeEntityException extends ResponseEntityExceptionHandler {
	   
		@ExceptionHandler({ RepositoryConstraintViolationException.class })
	   public ResponseEntity<Object> handleAccessDeniedException  (Exception e, WebRequest request)
		   
	   RepositoryConstraintViolationException nevEx = 
       (RepositoryConstraintViolationException) e; 

     String errors = nevEx.getErrors().getAllErrors().stream()
       .map(p -> p.toString()).collect(Collectors.joining("\n"));
      
     return new ResponseEntity<Object>(errors, new HttpHeaders(),
       HttpStatus.PARTIAL_CONTENT);
	   }

	
	
	
	
}
