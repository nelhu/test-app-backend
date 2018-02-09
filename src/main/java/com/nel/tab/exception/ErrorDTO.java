package com.nel.tab.exception;

public class ErrorDTO {

	private static final long serialVersionUID = 347600746257463026L;
	
	// 自定义的错误消息
	String errorMsg;
	
	// exception对象中的message
	String exceptionMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public ErrorDTO() {
		super();
	}

	public ErrorDTO(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}
	
	public ErrorDTO(String errorMsg, Exception e) {
		super();
		this.errorMsg = errorMsg;
		this.exceptionMsg = e.getMessage();
	}
	
}
