package com.nel.tab.exception;

public class CustomeException extends Exception{

	private static final long serialVersionUID = -5492913555291227308L;
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CustomeException(String msg) {
		super();
		this.msg = msg;
	}

}
