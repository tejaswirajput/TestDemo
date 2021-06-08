package com.cg.demo.ex;

class RBI {
	public static void notes() throws InterruptedException{
		for(int i=1; i<=10;i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}
}

class HDFC {
	public static void dispenseNotes() throws InterruptedException{
		RBI.notes();
	}
}

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			HDFC.dispenseNotes();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
