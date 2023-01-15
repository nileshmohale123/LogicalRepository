package com.yash.crude.exception;

// Creating custom exception
//that can be thrown when
//user tries to add a customer
//that already exists
public class CustomerAlreadyExistsException extends RuntimeException {

	private String message;

	public CustomerAlreadyExistsException() {
	}

	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message = msg;
	}

}
