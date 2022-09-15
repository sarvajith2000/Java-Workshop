package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Vowel{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String x;
		System.out.println("enter a character:");
		x=scanner.next();
		switch(x) {
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("consonant");
			
		}
		scanner.close();
	}
}