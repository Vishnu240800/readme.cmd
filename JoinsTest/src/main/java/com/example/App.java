package com.example;
import java.lang.reflect.Member;
import java.sql.*;

import com.example.ifaces.Customer;
import com.example.ifaces.LoanApplication;
import com.example.ifaces.joinRepository;
import com.example.util.ConnectionFactory;


public class App 
{
	
		public static void main(String[] args)
		{
			Connection con ;
	    	
	    		try {
	    			
					con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
					System.out.println(con);
					
					joinRepository ob= new joinRepository(con);
					
					Customer toadd= new Customer(107, "gowshick", 644839292, 540);
//					LoanApplication toAdd = new LoanApplication(106,toadd,6000);
//		    		int rowAdded = ob.add(toAdd);
//		    		System.out.println("Row Added : "+rowAdded);
		    		ob.remove(201);
		    		ob.findAll().forEach(System.out::println);
	    		
	    		} catch (Exception e) {
				}
	    		
	    
	    	
		
		}
}