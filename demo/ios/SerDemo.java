package com.cg.demo.ios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(id, name, salary);
		System.out.println(emp.toString());


//		String file = "emp.ser";
		String file = "Tej.ser";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

//		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

//		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done");
		try {
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
