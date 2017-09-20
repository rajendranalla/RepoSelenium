package javaBasics;

//Unchecked Exception
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int i, j, k;
		j = 2;
		k = 0;

		try {
			i = j / k;
		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by Zero " + e);
		}

	}

}
