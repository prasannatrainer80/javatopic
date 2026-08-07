package com.java.demo;

public class StaticConEx {
	
	static {
		System.out.println("Static Constructor...");
	}
	
	public StaticConEx() {
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		StaticConEx obj = new StaticConEx();
	}
}
