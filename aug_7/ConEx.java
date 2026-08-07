package com.java.demo;

public class ConEx {

	int a, b;
	
	public ConEx() {
		this.a = 12;
		this.b = 5;
	}
	
	public ConEx(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConEx [a=" + a + ", b=" + b + "]";
	}
	
	public static void main(String[] args) {
		ConEx obj1 = new ConEx();
		System.out.println(obj1);
		ConEx obj2 = new ConEx(52, 42);
		System.out.println(obj2);
	}

}
