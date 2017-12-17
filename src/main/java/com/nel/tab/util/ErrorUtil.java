package com.nel.tab.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class ErrorUtil {

	public static Map<String, String> errorToMap(Errors err) {
		Map<String, String> errInfos = new HashMap<String, String>();
		List<FieldError> fields = err.getFieldErrors();
		for (FieldError field : fields) {
			errInfos.put(field.getField(), field.getDefaultMessage());
		}
		return errInfos;
	}
}
