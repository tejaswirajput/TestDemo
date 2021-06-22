package com.cg.demo.conc;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(){
		
	}
    Employee(int id , String name , double salary){
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
