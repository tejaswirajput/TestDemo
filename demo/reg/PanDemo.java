package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PanDemo {
	
	public static void main(String[] args) {
		
		String pan = "ADVSR6234S";
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pan);
		System.out.println(m.matches());
		
	}

}
