package com.training.quest4;

import java.util.function.Supplier;

public class Suplier {

	public static void main(String[] args) {
		Supplier<String> upper=()->{
			String name="ArfatH";
			return name.toUpperCase();
			
		};
		String res=upper.get();
		System.out.println("THe uppwr case is "+res);
	}

}
