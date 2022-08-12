package com.example;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import com.example.ifaces.*;
import com.example.util.ConnectionFactory;


public class App 
{
	
	
	
		public static void member()
		{
			Connection con ;
	    	try {
	    		
	    		con = ConnectionFactory.getOracleConnection();
	    		con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
	    		
	    		LocalDate date = LocalDate.of(2022,4,12);
	    		Date sqlDate = Date.valueOf(date);
	    		//LocalDate date2 = sqlDate.toLocalDate();
	    		
	    		MemberRepository service = new MemberRepository(con);
	    		
	    		
	    		Member toAdd = new Member(105,"Lifetime","vish","chenn",sqlDate,700,23,901);
	    		int rowAdded = service.add(toAdd);
	    		System.out.println("Row Added : "+rowAdded);
	    		
	    		
	    		Optional<Member> found=service.findById(103);
	    		if(found.isPresent()) {
	    			System.out.println(found);
	    		}
	    		else {
	    			System.out.println("Value is invalid");
	    		}
	    		
	    		
	    		service.remove(122);
	    		
	    		
	    		service.update1(104, "sathiya");

	    		
	    		service.findAll().forEach(System.out::println);	
	    		
			} catch (Exception e) {
				e.printStackTrace();
		
	    }
			
		}
//		public static void product()
//		{
//		Connection con=ConnectionFactory.getPostgressConnection();
//			ProductService service=new ProductService(con);
//			 
//			
//			Product toAdd=new Product (959,"phone",178);
//			
//			System.out.println("row added"+service.addProduct(toAdd));
//
//		}
    public static void main( String[] args )
    {
    	member();
    }

}


