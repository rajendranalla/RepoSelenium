package javaBasics;

//Unchecked Exception
public class ArrayOutOfBoundsExceptionDemo {

	public void singleDimentionalArray() {

		int a[] = { 5, 7, 9, 11 };

		try {
			for (int i = 0; i < 6; i++) {
				System.out.print(a[i]+ " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("array exceeds " + e);
		}
		catch (Exception e) {

			System.out.println("Unknown exception " + e);
		}
	}

	public void twoDimentionalArray() {

		int a[][] = { { 1, 3, 5, 9 }, { 6, 8, 10, 12 } };

		try {
			// i represent rows
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println("");
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("array exceeds " + e);
		}
	}

	public static void main(String[] args) {

		ArrayOutOfBoundsExceptionDemo ar1 = new ArrayOutOfBoundsExceptionDemo();
		ar1.singleDimentionalArray();

		ArrayOutOfBoundsExceptionDemo ar2 = new ArrayOutOfBoundsExceptionDemo();
		ar2.twoDimentionalArray();

	}

}
