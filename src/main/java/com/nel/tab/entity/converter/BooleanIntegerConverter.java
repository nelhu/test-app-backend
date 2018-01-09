package com.nel.tab.entity.converter;

import javax.persistence.AttributeConverter;

public class BooleanIntegerConverter implements AttributeConverter<Boolean, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Boolean attribute) {
		if (Boolean.TRUE.equals(attribute)) {
			return 1;
		} else if (Boolean.FALSE.equals(attribute)) {
			return 0;
		} else {
			return null;
		}
	}

	@Override
	public Boolean convertToEntityAttribute(Integer dbData) {
		if (dbData != null) {
			return dbData != 0;
		}
		return null;
	}

}
