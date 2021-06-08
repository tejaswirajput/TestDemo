package com.cg.demo.method;

public class Employee {
	
	    int id;
	    String name;
	    double salary;
	    
	   public Employee(){
	    	System.out.println("default Constructor");
	    }
	    Employee(int id, String name){
	    	this.id = id;
	    	this.name = name;
	    	System.out.println("two paramitarlise Constructor");
	    	
	    }
	    
	    Employee(int id, String name, double salary){
	    	this.id = id;
	    	this.name = name;
	    	this.salary = salary;
	    	System.out.println("three paramitarlise Constructor");
	    	
	    }
	
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
			
		}
	    
}
