package org.ncu.spring_mvc_demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CountryCodeConstraintValidator implements ConstraintValidator<CountryCode, String> {

	
	String nationalityPrefix;
	public void initialize(CountryCode constraintAnnotation) {
		// TODO Auto-generated method stub
//		ConstraintValidator.super.initialize(constraintAnnotation);
		nationalityPrefix = constraintAnnotation.value();
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		Boolean result = value.startsWith(nationalityPrefix);

		return result;
	}

}
