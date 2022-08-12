package com.training;

import java.util.Optional;
import java.util.Optional.*;
import javax.management.RuntimeErrorException;

public class UsingOptional {
	
	private static Optional<String> getValue(int key) {
		
		Optional<String> response = Optional.empty();
		
		if(key==1)
		{
			response =Optional.of ("Hi");
		}
		return response;
	}

	
	public  static Object getString(int key) {
		
		switch (key) {
		case 1:
			
			return new String("chocobar");
		case 2:
			
			return new StringBuffer("Cassata");

		default:
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		//will throw null pointer exception
	
		//System.out.println(getString(3).toString());
		
		//to avoid nullpointer exceptionand return a defaultvalue
		//new feature of java 8 optional is used
		 
		/*Optional<Object> optional =Optional.ofNullable(getString(3));
		
		System.out.println(optional.orElse("vannila").toString());
		*/
		
		//ispresent
		//here we are checking if the value is present 
		//if its present then only we will call  get method  
		
		/*Optional<Object> opt2 = Optional.ofNullable(getString(2));
		
		if (opt2.isPresent())
		{
			System.out.println("value is present :" + opt2.get());
	
		}
		else {
			System.out.println("value is not present");
		}
		*/
		//using the lambda expression with optional
		
		/*Optional<Object> opt3 = Optional.ofNullable(getString(6));
		
		opt3.orElseThrow( 
				()-> new RuntimeException("No object for value 3 try again"));
	
		*/
		
		//FIRST METHOD 
		//Optional<String> resp =  getValue(1);
		
		Optional<String> resp =  getValue(2);
		
		if (resp.isPresent())
		{
			System.out.println(resp.get().toString());
			
		}
		else
		{
			System.out.println("Invalid choice enter 1");
		}
		}

	

}
