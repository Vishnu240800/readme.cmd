package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Gowshick_BookService")

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

public class Book{
	
	
	@Id
	@Column(name = "book_Id")
	int id;
	
	@Column(name = "book_Name")
	String bookName;
	
	@Column(name = "book_Author")
	String bookAuthor;
	
	@Column(name = "book_Price")
	double bookPrice;
	
	

}
