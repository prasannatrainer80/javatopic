package com.java.demo;

public class OverloadEx2 {

	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x + 12;
	}
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj1 = new OverloadEx2();
		System.out.println("Sum with zero args " +obj1.sum());
		System.out.println("Sum with One Arg  " +obj1.sum(52));
		System.out.println("Sum with Two Args  " +obj1.sum(52, 12));
	}
}
