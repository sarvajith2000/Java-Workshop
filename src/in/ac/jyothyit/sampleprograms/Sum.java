package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,sum=0;
		System.out.println("enter the first  numbers");
		a=scanner.nextInt();
		System.out.println("enter the second numbers");
		b=scanner.nextInt();
		sum=a+b;
		scanner.close();
		System.out.println("the sum of the numbers entered is = "+sum);
		
		
	}

}
