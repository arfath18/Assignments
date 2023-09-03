package com.training.quest2;

public class CMain {

	public static void main(String[] args) {
		ICalculator cal =new BasicCalc();
		cal.add(10,20);
		cal.multiply(10,20);
		cal.difference(20,20);
		Scientific scientific =new ScientificCal();
		scientific.square(3);
		scientific.cube(3);
		
	}

}
