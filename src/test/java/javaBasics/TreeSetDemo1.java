package javaBasics;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();

		t.add("A");
		t.add("a");
		t.add("C");
		t.add("B");
		t.add("X");

		// t.add(null);
		System.out.println(t); // Default Natural Sorting Order (i.e., alphabetical order)

	}

}
