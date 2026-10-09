package com.example.demo;

public class Hello {

	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public Hello(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
