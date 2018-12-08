package javaBasics;

import java.util.Stack;

public class StackDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// Push operation - Inserts objects
		s.push("A");
		s.push("B");
		s.push("C");

		System.out.println(s);

		// Search operation - returns offset values if object is present, else -1 is
		// returned
		System.out.println(s.search("A"));
		System.out.println(s.search("B"));
		System.out.println(s.search("C"));
		System.out.println(s.search("Z"));

		// Pop operation - remove an object in "LAST IN FIRST OUT" order
		s.pop();
		System.out.println(s);

		// Empty operation - return true if stack is empty
		System.out.println("is Stack empty? " + s.empty());

	}

}
