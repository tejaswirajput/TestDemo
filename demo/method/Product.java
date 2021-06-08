package com.cg.demo.method;

public class Product {
	
	int id;
	int batch ;
	String expdate;
	String location;
	double cost;
	
	public Product(int id, int batch, String expdate, double cost) {
		super();
		this.id = id;
		this.batch = batch;
		this.expdate = expdate;
		this.cost = cost;
		System.out.println("four paramitarlise Constructor");
	}
	
	Product(int id, String location, double cost){
    	this.id = id;
    	this.location = location;
    	this.cost = cost;
    	System.out.println("three paramitarlise Constructor");
    	
    }
	
	 Product(int id, String expdate){
	    	this.id = id;
	    	this.expdate = expdate;
	    	System.out.println("two paramitarlise Constructor");
	    	
	    }
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", batch=" + batch + ", expdate=" + expdate + ", location=" + location + ", cost="
				+ cost + "]";
	}
	
	  /* Product(){
	    	System.out.println("default Constructor");
	    }
	 
	    Product(int id, String expdate){
	    	this.id = id;
	    	this.expdate = expdate;
	    	System.out.println("two paramitarlise Constructor");
	    	
	    }
	    
	    Product(int id, String location, double cost){
	    	this.id = id;
	    	this.location = location;
	    	this.cost = cost;
	    	System.out.println("three paramitarlise Constructor");
	    	
	    }
	    
	    Product(int id, int batch, String location, double cost){
	    	this.id = id;
	    	this.batch = batch;
	    	this.location = location;
	    	this.cost = cost;
	    	System.out.println("three paramitarlise Constructor");
	    }
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", batch=" + batch + ", expdate=" + expdate + ", location=" + location + ", cost="
				+ cost + "]";
	}
	*/

}
