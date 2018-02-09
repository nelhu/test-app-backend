package com.nel.tab.exception;

public class CustomeException1 extends Exception{

	private static final long serialVersionUID = -5492913555291227308L;
	
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CustomeException1(String code) {
		super();
		this.code = code;
	}

}
