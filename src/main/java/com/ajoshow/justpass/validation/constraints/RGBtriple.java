package com.ajoshow.justpass.validation.constraints;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

/**
 * The annotated element must be in the form of CSS-style RGB triple.
 * 
 * @author Andy
 *
 */
@Pattern(
		regexp = "rgb\\((\\d{1,3}), (\\d{1,3}), (\\d{1,3})\\)", 
		message = "{justpass.validation.constraints.RGBtriple.message}"
)
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
@ReportAsSingleViolation
public @interface RGBtriple {

	String message() default "{justpass.validation.constraints.RGBtriple.message}";

	Class<?>[]groups() default {};

	Class<? extends Payload>[]payload() default {};
}
