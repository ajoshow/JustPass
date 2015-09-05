package com.ajoshow.justpass.validation.constraints;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;

/**
 * The annotated element is mandatory and may not be null.
 * @author Andy
 *
 */
@NotNull
@Target( { METHOD, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
@ReportAsSingleViolation
public @interface Mandatory {

    String message() default "{justpass.validation.constraints.Mandatory.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    // TODO target class
}

