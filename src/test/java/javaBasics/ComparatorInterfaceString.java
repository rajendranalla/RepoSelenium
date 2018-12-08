package javaBasics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterfaceString {

	public static void main(String[] args) {

		/*
		 * Write a program tp insert String objects into a TreeSet where all elements
		 * should be inserted according to reverse of Alphabetical order
		 */

		@SuppressWarnings("unchecked")
		TreeSet<String> t12 = new TreeSet<String>(new MyComparator2());

		t12.add("Roja");
		t12.add("Raja");
		t12.add("Shoba");
		t12.add("Bhavani");
		t12.add("Meena");
		t12.add("Nagma");

		System.out.println(t12);

	}

	static class MyComparator2 implements Comparator<Object> {

		public int compare(Object o1, Object o2) {

			String I1 = (String) o1;
			String I2 = (String) o2;

			return -I1.compareTo(I2);
		}

	}

}
