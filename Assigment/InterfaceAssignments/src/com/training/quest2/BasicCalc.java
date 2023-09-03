package com.training.quest2;

public class BasicCalc implements ICalculator{

	@Override
	public void add(int x, int y) {
		System.out.println("The addition is "+(x+y));
	}

	@Override
	public void multiply(int x, int y) {
		System.out.println("The Multiply is "+(x*y));
	}

	@Override
	public void substraction(int x, int y) {
		System.out.println("The difference is"+(x-y));
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("The divide is "+(x/y));
	}
	
	

}
