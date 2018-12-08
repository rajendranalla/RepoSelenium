package javaBasics;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<StringBuffer> t1 = new TreeSet<StringBuffer>();
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("B"));
		t1.add(new StringBuffer("x"));
		System.out.println(t1); // Exception in thread "main" java.lang.ClassCastException:
								// java.lang.StringBuffer cannot be cast to java.lang.Comparabley

	}

}
