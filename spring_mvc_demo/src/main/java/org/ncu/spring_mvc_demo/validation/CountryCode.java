package org.ncu.spring_mvc_demo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CountryCodeConstraintValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CountryCode {

	public String value() default "INDIAN -";

	public String message() default "Enter nationality- INDIAN-";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
