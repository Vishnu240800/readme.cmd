package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Book;
import com.example.demo.ifaces.Bookrepo;

@Service
public class BookService {
	
	Bookrepo repo;

	@Autowired
	public BookService(Bookrepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<Book> findAll() {
		return this.repo.findAll();
	}
	
	public Book addBook(Book entity) {
		return this.repo.save(entity);
	}

}