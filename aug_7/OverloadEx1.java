package com.java.demo;

public class OverloadEx1 {

	public void show(int x) {
		System.out.println("Show w.r.t. Integer  " +x);
	}
	
	public void show(char x) {
		System.out.println("Show w.r.t. Char  " +x);
	}
	
	public void show(String x) {
		System.out.println("Show w.r.t. String " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx1 obj = new OverloadEx1();
		obj.show(12);
		obj.show('$');
		obj.show("Java");
	}
}
