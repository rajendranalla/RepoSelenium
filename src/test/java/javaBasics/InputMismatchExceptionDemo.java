package javaBasics;

import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public void ioException1() {

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter first number: ");
			int i = input.nextInt();

			System.out.println("Enter second number: ");
			int j = input.nextInt();

			int divide = i / j;

			System.out.println(divide);
		} catch (Exception e) {

			System.out.println("Exception " + e);
		}
	}

	public static void main(String[] args) {

		InputMismatchExceptionDemo io = new InputMismatchExceptionDemo();
		io.ioException1();
		

	}

}
