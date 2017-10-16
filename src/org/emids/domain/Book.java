package org.emids.domain;

public class Book {
	private String bookName;
	private String authoerName;
	private double price;
	Book bookStore;

	public Book(String bookName, String authoerName, double price) {
		this.bookName = bookName;
		this.authoerName = authoerName;
		this.price = price;
	}

	public Book() {

	}

	public String getBookname() {
		return this.bookName;
	}

	public String getAuthoername() {
		return this.authoerName;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authoerName=" + authoerName + ", price=" + price + "]";
	}

}