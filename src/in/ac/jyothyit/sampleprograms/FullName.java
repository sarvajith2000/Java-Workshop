package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class FullName{
	public static void main(String args[]) {
		String a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the firstname:");
		a=scanner.next();
		System.out.println("enter the lastname:");
		b=scanner.next();
		String c = a+' '+b;
		System.out.println("the full name is  "+c);
		scanner.close();
		
		
		
		}
}