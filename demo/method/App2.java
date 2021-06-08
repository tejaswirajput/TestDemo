package com.cg.demo.method;

public class App2 {
	
	public static void main(String[] args) {
		
		Product obj = new Product();
		obj.id = 123;
		obj.batch = 1;
		obj.expdate = "May12";
		obj.location = "Pune";
		obj.cost = 500.23;
		System.out.println(obj.toString());
		
		Product obj1 = new Product(1234,2, "Aurangabad", 500.23);
		System.out.println(obj1.toString());
		
		Product obj2 = new Product(12345,"Mumbai",12.6);
		System.out.println(obj2.toString());
		
		Product obj3 = new Product(123456,"Jan07");
		System.out.println(obj3.toString());
		
		


		
		
	}

}
