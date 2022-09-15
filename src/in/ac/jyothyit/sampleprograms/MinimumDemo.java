package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class MinimumDemo{
	public static void main(String args []) 
	{
		int m , n , o;
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the 3 number");
		m=scanner.nextInt();
		n=scanner.nextInt();
		o=scanner.nextInt();
		System.out.println("minimum of first 2 numbers = "+Minimum.findMinimum(m, n));
		System.out.println("minimum of 3 number is = "+Minimum.findMinimum(m, n, o));
		scanner.close();
	}
}