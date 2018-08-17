package javaBasics;

public class ArraysUsingForLoop {

	public static void main(String[] args) {

		int[] myarray = { 10, 20, 30, 40, 50, 60, 70 };

//		for (int index = 0; index < 5; index++) {
//			System.out.println(myarray[index]);
//		}
		
		for (int i : myarray) {
			System.out.println(i);
		}

	}

}
