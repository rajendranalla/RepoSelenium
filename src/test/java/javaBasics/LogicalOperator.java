package javaBasics;

public class LogicalOperator {

	/*
	 * Logical Operators: && - AND, || - OR
	 */

	public static void main(String[] args) {

		int subject1 = 40;
		int subject2 = 34;

		if (subject1 >= 35 || subject2 >= 35) {
			System.out.println("Candidate is Passed");

		} else {
			System.out.println("Candidate is Failed");
		}

	}

}
