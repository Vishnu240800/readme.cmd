package com.training.model;

import java.util.List;

import com.training.Book;

public interface CrudRespository {
	
	public boolean add(Book book);
	public Book findByBookId(int id);
	public boolean remove (Book book);
	public List<Book> findAll();
	public Book update(Book  oldBook,Book newBook);
	

}
