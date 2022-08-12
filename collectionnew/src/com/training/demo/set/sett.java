package com.training.demo.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.demo.Book;

public class sett{

	public static void main(String[] args) {
		
		
		Set<Book> obj = new HashSet<Book>();
		
		Book obj1 = new Book(102, "hell5", "haloo", 538.00);
		
		Book obj2 = new Book(101, "hello", "halooooooooooooooooooooo", 538.00);

		obj.add(obj1);
		obj.add(obj2);
		obj.forEach(System.out::println);
		
		

	}

}
