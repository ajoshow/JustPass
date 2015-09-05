package com.ajoshow.justpass.annoation.pass;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.ajoshow.justpass.pass.domain.PassKeyType;

/**
 * The annotated element is described as a top level key of the pass.
 * @author Andy
 *
 */
@Target( { METHOD, FIELD, TYPE })
@Retention(SOURCE)
public @interface TopLevelKey {
    PassKeyType value();
}

