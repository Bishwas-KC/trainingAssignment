package tasks;

import java.util.Scanner;

public class Area {
	/*
	 * Write a program to print the area of a rectangle by creating a class named
	 * 'Area' having two methods. First method named as 'setDim' takes length and
	 * breadth of rectangle as parameters and the second method named as 'getArea'
	 * returns the area of the rectangle. Length and breadth of rectangle are
	 * entered through keyboard.
	 */
	
	float breadth;
	float length;
	
	
	public void setDim(float length,float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public float getArea(float length,float breadth) {
		return length * breadth;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		float length = scanner.nextFloat();
		
		System.out.println("Enter the breadth : ");
		float breadth = scanner.nextFloat();
		
		Area area = new Area();
		area.setDim(length, breadth);
		
		float areas = area.getArea(length, breadth);
		System.out.println("Area of Rectangle is : "+areas);
		
		scanner.close();
	}

}
