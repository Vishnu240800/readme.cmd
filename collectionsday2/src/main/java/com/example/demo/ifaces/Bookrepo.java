package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Book;

public interface Bookrepo extends JpaRepository<Book, Integer>{

	
}
