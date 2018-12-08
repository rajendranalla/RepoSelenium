package javaBasics;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Mahesh Babu");
		ll.add("Jr NTR");
		ll.add("Vijay");
		ll.add("Allu Arjun");
		System.out.println(ll);

		ListIterator<String> ltr = ll.listIterator();

		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("Allu Arjun")) {
				ltr.remove();
			} else if (s.equals("Jr NTR")) {
				ltr.add("Naga Chaitanya");
			} else if (s.equals("Mahesh Babu")) {
				ltr.set("Nani");
			}

		}

		System.out.println(ll);
	}

}
