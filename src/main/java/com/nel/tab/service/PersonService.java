package com.nel.tab.service;

import com.nel.tab.entity.Person;

public interface PersonService {

	
	Person findByName(String name) throws Exception;
	
}
