package com.nel.tab.basic.test_interface;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl1 implements OriginalInterface{

	@Override
	public void say() {
		System.out.println("1 say");
		
	}

	@Override
	public void play() {
		System.out.println("1 play");
		
	}

	@Override
	public String sing() {
		System.out.println("1 sing");
		return null;
	}

}
