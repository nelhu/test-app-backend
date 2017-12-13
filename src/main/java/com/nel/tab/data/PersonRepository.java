package com.nel.tab.data;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.nel.tab.entity.Person;

public interface PersonRepository extends Repository<Person, Long>{

	Person findByName(String name);
	
}
