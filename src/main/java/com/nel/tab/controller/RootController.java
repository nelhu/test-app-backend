package com.nel.tab.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nel.tab.data.PersonRepository;
import com.nel.tab.entity.Person;
import com.nel.tab.service.PersonService;
import com.nel.tab.util.ErrorUtil;

@RestController
public class RootController {
	
	@Autowired
	PersonService personService;

	@RequestMapping("/")
	public String root(ModelAndView mv) {
		System.out.println("root");
		mv.addObject("hi", "nihao");
		return "Good morning";
	}
	
	@GetMapping(value="/login")
	public String login() {
	     return "login";
	}

	@GetMapping(value="/jpa")
	public Person jpa() {
		
		String name = "mmm";
		Person p = personService.findByName(name);
		
	     return p;
	}
	
	@GetMapping(value="/newJpa")
	public ResponseEntity<Object> newJpa(@RequestParam String name) {
		
		Person p = personService.findByName(name);
		
		HttpStatus status = p == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
		
		ResponseEntity response = new ResponseEntity(p, status);
		System.out.println(p + "---------------------");
	    return response;
	}
	
	@PostMapping(value="/msgJpa")
	public ResponseEntity<Object> msgJpa(@RequestBody @Valid Person person, Errors err) {
		
		if (err.hasErrors()) {
			return new ResponseEntity(ErrorUtil.errorToMap(err), HttpStatus.NOT_FOUND);
		}
		
		
	    return new ResponseEntity("ok", HttpStatus.OK);
	}
	
	
	 

}
