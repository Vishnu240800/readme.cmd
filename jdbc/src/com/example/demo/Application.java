package com.example.demo;

import java.sql.*;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		
		Connection con; 
		try {
			
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
		
		ProductService service= new ProductService(con);
		
		//Product toAdd = new Product(6,"helo",20.00);
		
		//int rowAdded = service.addProduct(toAdd);
		
		//System.out.println("Row Added : "+ rowAdded);
		
		service.deleteById(4);
		
		//service.updatePriceByName("helo", 27);
	
		service.findAll().forEach(System.out::println);
	
		System.out.println(service.findById(2));
		
		Product kathli = new Product(10, "badam kathli", 450.00);
		
		Product cream = new Product (60, "ice cream ", 300.00);
		
		service.usingTxn(kathli, cream);
	
		service.findAll().forEach(System.out::println);
		}catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}

