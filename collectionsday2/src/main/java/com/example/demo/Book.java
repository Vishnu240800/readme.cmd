package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)

@Table(name = "newbookgowse")
public class Book {
	
	@Id
	@Column(name = "id")
	int bookNumber;
	
	@Column(name = "book_Name")
	String BookName;
	
	@Column(name = "price")
	double price;
	


}
