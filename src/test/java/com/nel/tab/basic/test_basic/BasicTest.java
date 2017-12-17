package com.nel.tab.basic.test_basic;

import org.springframework.beans.factory.annotation.Autowired;

import com.nel.tab.entity.Person;
import com.nel.tab.service.PersonService;

public class BasicTest {
	
	@Autowired
	private PersonService personService;

	private String name;

	public BasicTest(String name) {
		super();
		this.name = name;
	}
	
	public String say() {
		return "name is " + this.name;
	}
	
	public String login() {
	     return "login";
	}
	
	public String jpa() {
		
		Person p = personService.findByName("tom");
		
	     return p.getId() + " " + p.getName();
	}
	
	public static void main(String[] args) {
		
		BasicTest bt = new BasicTest("mike");
		String res = bt.say();
		String res2 = bt.login();
		String res3 = bt.jpa();
		System.out.println(res3);
	}
	
}
