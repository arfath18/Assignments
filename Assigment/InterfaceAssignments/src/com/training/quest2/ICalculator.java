package com.training.quest2;

public interface ICalculator {
	void add(int  x,int y);
	void multiply(int x,int y);
	void substraction(int x, int y);
	void divide(int x, int y);
	 
	default void difference(int x, int y) {
		System.out.println("Diff "+(x+y));
	}
}
