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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nel.tab.data.PersonRepository;
import com.nel.tab.entity.Person;
import com.nel.tab.exception.CustomeException;
import com.nel.tab.exception.CustomeException1;
import com.nel.tab.exception.ErrorDTO;
import com.nel.tab.service.PersonService;
import com.nel.tab.util.ErrorUtil;

import ch.qos.logback.classic.Logger;

@RestController
public class RootController extends BaseController{
	
	@Autowired
	PersonService personService;

	@GetMapping(value="/login")
	public String login() {
	     return "login";
	}

	@GetMapping(value="/jpa")
	public Person jpa() throws Exception {
		
		String name = "mmm";
		Person p = personService.findByName(name);
		
	     return p;
	}
	
	@GetMapping(value="/newJpa")
	public ResponseEntity<Object> newJpa(@RequestParam String name) throws Exception {
		
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
	
	 @GetMapping("/directThrow")
	 public String directThrow(@RequestParam String name) throws CustomeException{
		 
		 String result = null;
		 result = name.substring(2, 3);
		 
		 return result;
	 }
	 
	
	 @GetMapping("/handlerExceptionResolver")
	 public Object ErrorDTO(@RequestParam String name) throws Exception {
		 
		 
		 Person p = personService.findByName(name);
		 
//		 if (p == null) {
//			 throw new ErrorDTO("not found");
//		 }
		 System.out.println("after");
		 return p;
	 }
	 
	 @GetMapping("/exceptionHandler")
	 public Person exceptionHandler(@RequestParam String name) throws Exception {
		 
		 Person p = personService.findByName(name);
		 
		 System.out.println("after");
		 return p;
	 }
	 
	 @GetMapping("/twoException")
	 public void twoException(
			 @RequestParam String name,
			 @RequestParam String age) throws Exception {
		 
		 if (name.equals("caseA")) {
			 throw new CustomeException("caseA");
		 }
		 
		 if (age.equals("caseB")) {
			 throw new CustomeException1("caseB");
		 }
		 
	 }
	 

}
