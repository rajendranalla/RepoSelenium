package javaBasics;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Comparable> lh = new LinkedHashSet<Comparable>();

		lh.add("X");
		lh.add("Y");
		lh.add("Z");
		lh.add(null);
		lh.add(10);
		System.out.println(lh.add("Z")); // false
		System.out.println(lh);

	}

}
