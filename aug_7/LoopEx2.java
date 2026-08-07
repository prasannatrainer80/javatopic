package com.java.demo;

/**
 * Program to Check Given No is Prime Or Not
 */
public class LoopEx2 {
	public static void main(String[] args) {
		int n=7;
		boolean flag = true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not-Prime Number..");
		}
	}
}
