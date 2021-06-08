package com.cg.demo.ex;

public class ThrowDemo {
	 
	public static void checkEligibility(int age) {
	
	if(age < 18) {
		throw new ArithmeticException("can not vote.");
	} else {
		System.out.println("Vote for india.");
	}
 }
	
	public static void main(String[] args) {
		System.out.println("Election...");
		ThrowDemo.checkEligibility(20);
	}
}
