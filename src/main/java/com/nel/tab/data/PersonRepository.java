package com.nel.tab.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.nel.tab.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Person findByName(String name);
	
	Person findById(Long id);
	
}
