package com.training;

public class Book implements Comparable<Book> {
	public int bookNumber;
	public String bookName;
	public String author;
	public int price;
	
	
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName, String author, int price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
		
		
		if(otherObj.bookNumber<this.bookNumber) return -1;
		if(otherObj.bookNumber>this.bookNumber) return 1;
	    return 0;
	    
	    
		//return otherObj.bookName.compareTo(this.bookName);
	}
	
	

}
