package com.java.demo;

public class StrExamples {
	public static void main(String[] args) {
		String str="Welcome to Java Programming...Thank You...";
		System.out.println("Length  " +str.length());
		System.out.println("First Occurrence of Char 'o' is " +str.indexOf("o"));
		System.out.println("Char at 5th Position  " +str.charAt(5));
		System.out.println("Upper Case String  " +str.toUpperCase());
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Replaced String  " +str.replace("Java", "JavaFSD"));
		String s1="Trisha",s2="Harshitha",s3="Trisha";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
