package com.java.demo;

public class StVarEx {

	static int count;
	
	public void increment() {
		count++;
		System.out.println("Count  " +count);
	}
	
	public static void main(String[] args) {
		StVarEx obj1 = new StVarEx();
		StVarEx obj2 = new StVarEx();
		StVarEx obj3 = new StVarEx();
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}
}
