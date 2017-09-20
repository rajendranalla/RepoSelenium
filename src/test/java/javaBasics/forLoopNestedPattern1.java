package javaBasics;

public class forLoopNestedPattern1 {

	public static void main(String[] args) {

		// Printing rows and columns
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}

	}

}
