package com.ajoshow.justpass.converter;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class OffsetDateTimePersistenceConverter implements
    AttributeConverter<OffsetDateTime, String> {

	@Override
	public String convertToDatabaseColumn(OffsetDateTime attribute) {
		return Objects.toString(attribute, null);
	}

	@Override
	public OffsetDateTime convertToEntityAttribute(String dbData) {
		return OffsetDateTime.parse(dbData);
	}

	
   
}
