package com.dhreeti.springbootRTA.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** this exception will be thrown 
 * when user is being searched by ID and cannot be found
 */


@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UserNotFoundException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(Long id) {
		super("Couldnt find user with" + id);
	}
	
	

}
