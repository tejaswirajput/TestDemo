package com.cg.demo.lab;

import java.net.MulticastSocket;
import java.util.Scanner;
	
	public class Lab2 { 

	
		static void SecondSmallestNumber(int[] arr, int n) {
			int temp;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Second smallet number is " + arr[1]);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			

			int[] arr1 = new int[size];
			
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Please Enter elements in the array ");
				arr1[i] = sc.nextInt();
				
			}

			//SecondSmallestNumber(arr1, size);
		
		}
	




	
	

	

}
