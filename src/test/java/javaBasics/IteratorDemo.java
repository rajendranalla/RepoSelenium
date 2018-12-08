package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}

		System.out.println("Complete list " + al);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0) {
				System.out.println("Even number " + I); // Prints even numbers
			} else {
				itr.remove();
			}
		}

		System.out.println("Even numbers after removing odd numbers from the list " + al); // Prints the values after
																							// removing odd numbers from
																							// the list
	}

}
