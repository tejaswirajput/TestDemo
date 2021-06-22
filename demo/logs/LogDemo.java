package com.cg.demo.logs;

import com.sun.org.slf4j.internal.LoggerFactory;

import jdk.internal.org.jline.utils.Log;

public class LogDemo {
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(LogDemo.class);
		Log.info("Aaa");
	}

}
