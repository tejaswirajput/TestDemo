package com.cg.demo.ex;

public class ExDemo {
	
	public static void main(String[] args) {
		 
//		System.out.println("start");
//		System.out.println( 10 / 0);
//		System.out.println("end");
		
		
		System.out.println("start");
		
		try {
			System.out.println(10 / 0);
		} catch(ArithmeticException obj) {
			System.out.println("Do not divide by");
		}
		System.out.println("End");
		
	}

}
