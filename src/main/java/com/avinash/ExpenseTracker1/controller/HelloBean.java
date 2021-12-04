package com.avinash.ExpenseTracker1.controller;

public class HelloBean {
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloBean(String message) {
		super();
		this.message = message;
	}
	
	public HelloBean() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
