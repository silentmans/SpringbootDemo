package com.test.demo.constant;

public enum ErrorEnum {

	USER_NOT_EXIST("1001", "用户不存在");

	private String code;
	private String message;

	private ErrorEnum(String code, String message) {
		this.setCode(code);
		this.setMessage(message);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "the error_code is " + this.code + " & the error_message is " + this.message;
	}
}
