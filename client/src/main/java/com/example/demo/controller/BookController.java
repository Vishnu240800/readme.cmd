package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping(path = "/api/v1")

public class BookController {
	
	public BookService service;


	@Autowired
	public BookController(BookService repo) {
		super();
		this.service = repo;
	}
	
	@GetMapping(path = "/books")
	public List<Book> findAll()
	{
		return this.service.findAll();
	}

	
	@GetMapping(path = "/books/{find}")
	public Optional<Book> findById(@PathVariable("find")int id)
	{
		return this.service.findById(id);
	}
	
	@GetMapping(path = "/delete/{delete}")
	public List<Book> deleteById(@PathVariable("delete")int id)
	{
		return this.service.deleteById(id);
	}
	
	@GetMapping(path = "books/some/{id}")
	public List<Book> getDataById(@PathVariable("id")int id)
	{
		return this.service.getDataById(id);
	}
	
//	@PostMapping(path = "/books/add")
//	@ResponseBody
//	public List<Book> add(Book entity) {
//		return  this.service.add(entity);
//	}
}
