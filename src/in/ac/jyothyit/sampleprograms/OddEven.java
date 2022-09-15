package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class OddEven{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = scanner.nextInt();
		if(a%2==0) {
			System.out.println("the number entered is even ");
		}
		else {
			System.out.println("the number is odd");
			scanner.close();
		}
		
	}
}