package com.cg.demo.encap;

class Phone{
	
	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}

}

class FeaturePhone extends Phone{
	
	void music() {
		System.out.println("Music...");
	}
}
class SmartPhone extends FeaturePhone {
	void snap() {
		System.out.println("snap...");
	}
}
public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();
		
		FeaturePhone ph = new FeaturePhone();
		ph.music();
		ph.call();
		ph.sms();
		
		SmartPhone smart = new SmartPhone();
		smart.call();
		smart.sms();
		smart.music();
		smart.snap();
		

	}

}
