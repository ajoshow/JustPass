package com.ajoshow.justpass.validation.constraints;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ajoshow.justpass.validation.JsonStringValidator;

/**
 * The annotated element is must be formatted as a JSON string.
 * @author Andy
 *
 */
@Target( { METHOD, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {JsonStringValidator.class})
@Documented
public @interface JsonString {

    String message() default "{justpass.validation.constraints.JsonString.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

