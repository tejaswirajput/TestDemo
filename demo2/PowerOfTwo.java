package com.cg.demo2;

public class PowerOfTwo {
	
	
	import java.util.Scanner;
	     
	static boolean checkNumber(int n){
	            
	          if (n == 0)   
	            return false;
	 
	            
	            while (n != 1)
	           
	 {
	          
	      if (n % 2 != 0)
	                    
	return false;
	               
	 n = n / 2;
	            
	}
	            
	return true;
	       
	 }
	     
	public static void main(String[] args) {
	          
	  Scanner sc = new Scanner(System.in);

	 

	         
	   System.out.println("Please enter an integer - ");
	          
	  int num = sc.nextInt();
	           
	 if (checkNumber(num))
	                
	System.out.println("True");
	           
	 else
	                
	System.out.println("False");
	         
	   
	 }

	}


