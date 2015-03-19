package edu.nashcc.book;

import java.text.DecimalFormat;

public class Book {

	String category, title, author;
	double price, totalPrice;
	final double TAX_RATE = 0.0675D; // 6.75% tax

	// constructors (blank, one arg, two arg)
	public Book() {
		this("Java Programming", "Joyce Farrell");
	}

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// getters and setters
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double price) {
		double tax = this.price * TAX_RATE;
		this.totalPrice = tax + this.price;
		;
	}

	public String getTitle() {
		return title;
	}

	// creating a decimal format method
	public String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		return formatter.format(decimal);
	}

	// String builder
	public String getData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Category: " + this.category + "\n");
		sb.append("Title: " + this.title + "\n");
		sb.append("Author: " + this.author + "\n");
		sb.append("Base Price: " + decForm(this.price) + "\n");
		sb.append("Total Price: " + decForm(this.totalPrice) + "\n");
		return sb.toString();
	}

}
