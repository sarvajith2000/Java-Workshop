package in.ac.jyothyit.procedural;

import java.util.Scanner;

public class CirlcleDemo{
	public static void main(String args[]) {
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the radius :");
		radius = scanner.nextInt();
		scanner.close();
		System.out.println("perimeter of the circle is = "+Circle.findPerimeter(radius));
		System.out.println("area of the circle is = "+Circle.findArea(radius));
	}
}