package com.java.demo;

public class Cricket {

	static int score;
	
	public void increment(int x) {
		score +=x;
	}
	
	public static void main(String[] args) {
		
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
	
		fb.increment(24);
		sb.increment(42);
		ext.increment(11);
		
		System.out.println("Total Score  " +Cricket.score);
	}
}
