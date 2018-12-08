package javaBasics;

import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		LinkedList<Comparable> ll = new LinkedList<Comparable>();
		ll.add("Prasad");
		ll.add(10);
		ll.add(null);
		ll.add("Prasad");
		ll.set(0, "Nalla");
		ll.removeLast();
		ll.addFirst("Rajendra");
		ll.addLast("Prasad");
		ll.removeFirst();
		System.out.println(ll);
		

	}

}
