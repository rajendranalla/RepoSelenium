package javaBasics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterfaceStringBuffer {

	public static void main(String[] args) {

		/*
		 * Write a program to insert StringBuffer objects into a TreeSet where sorting
		 * order is Alphabetical
		 */

		@SuppressWarnings("unchecked")
		TreeSet<Object> t13 = new TreeSet<>(new MyComparator3());

		t13.add(new StringBuffer("A"));
		t13.add(new StringBuffer("Z"));
		t13.add(new StringBuffer("N"));
		t13.add(new StringBuffer("M"));
		t13.add(new StringBuffer("P"));

		System.out.println(t13);

	}

	@SuppressWarnings("rawtypes")
	static class MyComparator3 implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {

			String I1 = o1.toString();
			String I2 = o2.toString();

			return I1.compareTo(I2);
		}

	}

}
