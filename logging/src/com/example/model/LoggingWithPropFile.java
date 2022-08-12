package com.example.model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		String file = LoggingWithPropFile.class.getClassLoader() 
				.getResource("logging.properties") 
				.getFile();

		System.setProperty("hello", file);
		FileHandler handler;
		try {
			handler = new FileHandler("logs2.log");
			Book.log.addHandler(handler);
			Book. log.info("Logging Properties Done Right");
			Book java = new Book();
			Book.log.info(java.toString());
		}
		catch (SecurityException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

}
}
