package com.training.demo;

import java.util.List;

public interface curdrepo {
	
	public List<Book> findAll();

	public boolean add(Book data);

}
