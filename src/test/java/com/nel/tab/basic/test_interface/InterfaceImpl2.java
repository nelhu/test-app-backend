package com.nel.tab.basic.test_interface;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl2 implements OriginalInterface{

	@Override
	public void say() {
		System.out.println("2 say");
		
	}

	@Override
	public void play() {
		System.out.println("2 play");
		
	}

	@Override
	public String sing() {
		System.out.println("2 sing");
		return null;
	}

}
