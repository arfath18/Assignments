package com.training.quest3;

import java.util.function.Consumer;

public class Consum {

	public static void main(String[] args) {
		Consumer<Integer> addNumbers =(a)->{
			int b=5;
			int sum=a+b;
			System.out.println("sum "+sum);
		};
		addNumbers.accept(10);
		Consumer<Integer> subtract=(a)->{
			int b=5;
			int dif=a-b;
			System.out.println("Diff is "+dif);
		};
		subtract.accept(25);
	}

}
