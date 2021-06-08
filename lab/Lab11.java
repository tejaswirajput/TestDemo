package com.cg.lab;

import java.util.Scanner;

public class Lab11 {
	
	public static void main(String[] args) {
		
        Scanner sc =  new Scanner(System.in);
		
		System.out.println("please enter an integer -");
		int num = sc.nextInt();
		
		int rem,sum=0;
		
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		System.out.println("Cube is  " + sum);
		//System.out.println(sum);
	}

}
