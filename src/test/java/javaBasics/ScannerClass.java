package javaBasics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// Print number
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter some number: ");
		int enter_some_number = s1.nextInt();
		System.out.println("Entered number is: " + enter_some_number);

		// Print String
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter some string: ");
		String enter_some_string = s2.nextLine();
		System.out.println("Entered string is: " + enter_some_string);

		// Print Double
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter some double: ");
		double enter_some_double = s2.nextDouble();
		System.out.println("Entered double is: " + enter_some_double);
	}

}
