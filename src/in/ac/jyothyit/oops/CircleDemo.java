package in.ac.jyothyit.oops;

import java.util.Scanner;

public class CircleDemo{
	public static void main(String args[]) {
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the radius:");
		radius = scanner.nextInt();
		scanner.close();
		Circle circle = new Circle(radius);
		System.out.println("the area is = "+circle.findArea());
		System.out.println("the perimeter is = "+circle.findPerimeter());
	}
}