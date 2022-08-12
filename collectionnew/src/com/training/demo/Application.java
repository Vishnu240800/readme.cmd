package com.training.demo;


import java.util.ArrayList;
import java.util.List;
public class Application {
	
	
	public static void print(List<Book> list) {
	
		for (Book eachBook : list)
		{
			System.out.println(eachBook);
		}
	
		
	}
	public static void main(String[] args) {
		
		
		
		Book java = new Book(101,"java","suba",450);
		Book spring = new Book(102,"spring","mad",650);
		Book maven = new Book(103,"maven","Harish",550);
		Book html = new Book(104,"html","priya",1450);
		Book python = new Book(105,"python","sathya",850);
		
		curdrepo service = new BookService();
		
		List<Book> add = new ArrayList<Book>();
		add.add(java);
		add.add(spring);
		add.add(maven);
		
		service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		System.out.println(service);
		
		System.out.println("=========================================");
		Book react = new Book(106,"ReactJs","Rahul",6800);
		service.add(react);
		
		System.out.println("-----------------findAll---------------------");
		//print(service.findAll());
		service.findAll().forEach(System.out::println);
		System.out.println("=================================");
		add.forEach(System.out::println);
	}
		
		
	}

