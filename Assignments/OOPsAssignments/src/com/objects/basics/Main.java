package com.objects.basics;

public class Main {

	public static void main(String[] args) {
		Book book1=new Book("Atomic Habit", "James Clear", 599, "Motivational");
		Book book2=new Book("Psyclogy of Money", "Mourge Housel", 400, "Psychology");
		
		book1.getDetails();
		System.out.println("Book "+book1.checkBookType());
		book2.getDetails();
		System.out.println("Book "+book2.checkBookType());
		
	}

}
