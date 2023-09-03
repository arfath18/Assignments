package com.training.quest5;

import java.util.function.BiConsumer;

public class Biconsume {

	public static void main(String[] args) {
		BiConsumer<String, Integer> checker=(name,age)->{
			if(name.equals("admin")&& age>30) {
				System.out.println("True");
			}else {
				System.out.println("Wrong user");
			}
		};
		checker.accept("Arfath", 38);
	}

}
