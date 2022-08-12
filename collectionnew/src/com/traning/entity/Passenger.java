package com.traning.entity;

public class Passenger //implements Comparable<Passenger> 
{
	
	public String bookName;
	
	public String location;
	
	public double price;

	
	public String getBookName() {
		return bookName;
	}

	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return location;
	}

	
	public void setBookAuthor(String bookAuthor) {
		this.location = bookAuthor;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + location + ", price=" + price + "]";
	}


	public Passenger(String bookName, String bookAuthor, double price) {
		super();
		this.bookName = bookName;
		this.location = bookAuthor;
		this.price = price;
	}

//	@Override
//	public int compareTo(Passenger value) {
//		
//		return this.bookName.compareTo(value.bookName) ;
//		
//		//if(value.price<this.price) return 1;
//		
//		//if(value.price>this.price) return -1;
//		
//		//return 0;
//		
//		//return this.location.compareTo(value.location);
//	}
	
	

}
