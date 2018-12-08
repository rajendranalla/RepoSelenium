package javaBasics;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Comparable> h = new HashSet<Comparable>();

		h.add("X");
		h.add("Y");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); // false
		System.out.println(h);
	}

}
