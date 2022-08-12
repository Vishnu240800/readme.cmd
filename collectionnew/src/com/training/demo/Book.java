package com.training.demo;


public class Book {
	
	public int bookId;
	public String bookName;
	public String bookTitle;
	public double price;
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", price=" + price
				+ "]";
	}
	public Book(int bookId, String bookName, String bookTitle, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.price = price;
	}
	public Book() {
		super();
	}
}
