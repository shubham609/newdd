package Gupta;

import java.util.Scanner;

public class DemoTranslation {
	public static void main(String[] args) {
		int n, reversedInteger = 0, remainder, originalInteger;

		System.out.print("Enter an integer: ");
		n = STDIN_SCANNER.nextInt();

		originalInteger = n;

		// reversed integer is stored in variable 
		while(n != 0) {
			remainder = n % 10;
			
			reversedInteger = reversedInteger * 10 + remainder;
			n=n / 10;
		}

		// palindrome if orignalInteger and reversedInteger are equal
		if(originalInteger == reversedInteger) {
			System.out.print(originalInteger +" is a palindrome.");
		} else {
			System.out.print(originalInteger + " is not a palindrome.");
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}