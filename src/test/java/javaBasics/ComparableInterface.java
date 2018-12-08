package javaBasics;

import java.util.TreeSet;

public class ComparableInterface { // This program is meant for Default Natural Sorting Order i.e., ascending order

	public static void main(String[] args) {

		TreeSet<Object> t10 = new TreeSet<Object>();
		t10.add("K");
		t10.add("Z");
		t10.add("L");
		t10.add("B");
		t10.add("A");

		/*System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("L"));
		System.out.println("A".compareTo("A"));*/
		// System.out.println("A".compareTo(null)); // Exception in thread "main"
		// java.lang.NullPointerException

		System.out.println(t10);

	}

}
