package com.cg.demo.encap;

public class EncapDemo {
	
	public static void main(String[] args) {
		
//		BankCustomer obj = new BankCustomer();
//		obj.balance = 10000;
//		System.out.println(obj.checkBalance());
//		obj.deposit(1500);
//		System.out.println(obj.checkBalance());
//		obj.withdraw(100);
//		System.out.println(obj.checkBalance());
		
		Demo demo = new Demo();
//		demo.num = 10;
		
		System.out.println(demo.getNum());
		demo.setNum(100000);
		System.out.println(demo.getNum());
	}

}