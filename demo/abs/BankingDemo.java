package com.cg.demo.abs;

interface CentralGovRule{
	public abstract void payInterest();
}
interface StateGovRule{
	public abstract void giveLoan();
}
 abstract class RBI{
	public abstract void dokyc();
	public void OpenAcount() {
		System.out.println("Open Account...");
	}		
 }
 class HDFC extends RBI implements CentralGovRule, StateGovRule{
	public void dokyc(){
		System.out.println("Adhaar...");
	}
	public void giveLoan() {
		System.out.println("Give Loan");
		
	}
	public void payInterest() {
		System.out.println("Pay Interest");
	}
}

public class BankingDemo { 
	
	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		hdfc.dokyc();
		hdfc.giveLoan();
		hdfc.OpenAcount();
		hdfc.payInterest();
	}

}
