package com.nel.tab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nel.tab.data.PersonRepository;
import com.nel.tab.entity.Person;
import com.nel.tab.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Person findByName(String name) {
		return personRepository.findByName(name);
	}

}
