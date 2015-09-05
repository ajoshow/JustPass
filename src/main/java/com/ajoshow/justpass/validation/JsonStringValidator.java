package com.ajoshow.justpass.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ajoshow.justpass.validation.constraints.JsonString;

public class JsonStringValidator implements ConstraintValidator<JsonString, String>{

	@Override
	public void initialize(JsonString constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if( value == null || value.isEmpty() ){
			return true;
		}
		try {
	        new JSONObject(value);
	    } catch (JSONException ex) {
	        // e.g. in case JSONArray is valid as well...
	        try {
	            new JSONArray(value);
	        } catch (JSONException ex1) {
	            return false;
	        }
	    }
		return true;
	}

}
