package javaBasics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterfaceStringStringBuffer {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		 /*Write a program to insert String and StringBuffer objects into a TreeSet
		 where sorting order is increasing length order. If two objects having same
		 length then consider their Alphabetical order*/

		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeSet t14 = new TreeSet<>(new MyComparator4());

		t14.add("A");
		t14.add(new StringBuffer("ABC"));
		t14.add(new StringBuffer("AA"));
		t14.add("XX");
		t14.add("ZZ");
		t14.add("ABCD");
		t14.add("A");

		System.out.println(t14);
	}

	@SuppressWarnings("rawtypes")
	static class MyComparator4 implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {

			String s1 = o1.toString();
			String s2 = o2.toString();

			int l1 = s1.length();
			int l2 = s2.length();

			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);
		}

	}

}
