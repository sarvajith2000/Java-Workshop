package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		
	int m,n,o;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the 3 numbers");
	m  = scanner.nextInt();
	n  = scanner.nextInt();
	o  = scanner.nextInt();
	scanner.close();
	System.out.println(findMax(m,n));
	System.out.println(findMax(m,n,o));
	}
	public static int findMax(int a , int b) {
		if (a>b)
			return a;
		else 
			return b;
	}
	public static int findMax(int a , int b , int c) {
		if(a>b && a>c)
			return a;
		else if (b>a && b>c) 
			return b;
		
			return c;
	}

}
