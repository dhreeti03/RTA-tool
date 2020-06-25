package com.dhreeti.springbootRTA.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dhreeti.springbootRTA.User;

public class dataValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required");

		User user = (User) target;

		if (checkInputString(user.getFirstName())) {

			errors.rejectValue("firstName", "firstName cannot be null");
		}
		if (checkInputString(user.getEmail())) {
			errors.rejectValue("email", "email cannot be null");

		}

	}

	private boolean checkInputString(String input) {

		return (input == null || input.trim().length() == 0);

	}

	private boolean checkInputInt(int input) {

		return (input == 0);
	}

}
