package com.training.quest1;
interface Shape{
	void area(int x, int y);
}
public class ShapeMain {

	public static void main(String[] args) {
		Shape rectangle =(x,y)->{
			int area=x*y;
			System.out.println("Area of rectangle "+area);
		};
		rectangle.area(10, 5);
		Shape triangle =(x,y)->{
			double area=0.5*x*y;
			System.out.println("Area of triangle is "+area);
		};
		triangle.area(10, 5);
		
		Shape square=(x,y)->{
			int area=x*y;
			System.out.println("Square of the variable is "+area);
	
		};
		square.area(10, 6);
	}

}
