package com.traning.entity;

import java.util.*;

public class Application {
	
	public static void main(String[] args)
	
	{
		
		Set();
		
	}

	private static void Set() {
		
		Passenger book1 = new Passenger("Sathiya","Chennai" , 700.00);
		
		Passenger book2 = new Passenger("Vishnu","AP" , 900.00);

		Passenger book3 = new Passenger("Yovel","Chennai" , 650.00);

		Passenger book4 = new Passenger("Yovel","Chennai" , 650.00);
		
		List<Passenger> list = new ArrayList<Passenger>();
		
		list.add(book1);
		
		list.add(book2);
		
		list.add(book3);
		
		list.add(book4);
		
//		List list1 = new ArrayList<>();
//		
//		list1.add("hello");
//		
//		list1.add(543);
		
//		System.out.println("List");
//		
//		//list.forEach(System.out::println);
//		
//		Set<Passenger> tSet = new TreeSet<>();
//		
//		tSet.addAll(list);
//		
//		System.out.println("TreeSet");
//		
//		tSet.forEach(System.out::println);
		
//        Set hSet = new HashSet<>();
//        
//        hSet.addAll(list); 
//
//		System.out.println("HashSet");
//		
//        hSet.forEach(System.out::println);
   
//        list1.forEach(System.out::println);
		
	}
	
	
	
	
	
	
	

}
