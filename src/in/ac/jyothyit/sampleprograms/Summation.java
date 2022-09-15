package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Summation{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		
		int sum=n*(n+1)/2;
		System.out.println("the sum of n numbers is = "+sum);
		scanner.close();
	}
}