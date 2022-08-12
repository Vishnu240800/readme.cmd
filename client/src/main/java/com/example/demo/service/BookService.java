package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.ifaces.Bookrepo;


@Service
public class BookService {
	
	@Autowired
	private Bookrepo repo;

	
	public BookService(Bookrepo service) {
		super();
		this.repo = service;
	}
	
	public List<Book>  findAll()
	{
		return this.repo.findAll();
	}
 	
	public Optional<Book> findById(int id)
	{
		return this.repo.findById(id);
	}

	public List<Book> deleteById(int id)
	{
		return this.repo.deleteById(id);
	}
	
	public List<Book> getDataById(int id)
	{
		return this.repo.getDataById(id);
	}
	
//	public List<Book> add(Book entity){
//	{
//		return (List<Book>) this.repo.save(entity);
//	}

}

