package com.nel.tab.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nel.tab.data.PersonRepository;
import com.nel.tab.entity.Person;

@RunWith(value = SpringRunner.class)
@DataJpaTest(showSql = true)
@Transactional(propagation = Propagation.NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class PersonJpaTest {
//
	@Autowired
	PersonRepository personRepository; 
	
	@Test
	public void testJpa() {
//		personRepository.save();
		Person p = personRepository.findById(Long.valueOf(2));
		System.out.println("666" + p.getName());
	} 
	
}
