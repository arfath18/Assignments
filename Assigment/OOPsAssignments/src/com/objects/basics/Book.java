package com.objects.basics;

public class Book {

	String title;
	String author;
	int price;
	String category;

	public Book(String title, String author, int price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	public void getDetails() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
		System.out.println("Category: " + this.category);
	}

	public String checkBookType() {
		if (this.price > 500) {
			return "Premium Book";
		} else {
			return "Standard Book";
		}
	}
}
