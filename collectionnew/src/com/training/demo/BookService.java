package com.training.demo;

import java.util.ArrayList;
import java.util.List;


public class BookService implements curdrepo{

	private ArrayList<Book> bookList;
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book data) {
		
		return this.bookList.add(data); 
		
	}	
	
	@Override
	public List<Book> findAll() {
		
		return this.bookList;
		
	}

	
//ArrayList<Book> list = new ArrayList<>();
}
