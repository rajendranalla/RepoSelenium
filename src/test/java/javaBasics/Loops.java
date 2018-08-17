package javaBasics;

public class Loops {

	public static void main(String[] args) {

		int a = 0;

		// While loop evaluates the condition first and executes the statement

		while (a <= -1) {
			System.out.println(a);
			a++;
		}

		// Do-While loop executes the statement first and then evaluates the condition
		// next and again executes the statements based on condition

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		int b = 0;

		do {
			System.out.println(b);
			b++;
		} while (b <= -1);
	}

}
