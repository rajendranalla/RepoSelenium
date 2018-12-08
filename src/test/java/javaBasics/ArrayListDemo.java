package javaBasics;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Serializable> al = new ArrayList<Serializable>();

		al.add("A");
		al.add(100);
		al.add("A");
		al.add("B");
		al.add(null);
		System.out.println(al);
		al.remove(2);                       // Object from index 2 is removed
		System.out.println(al);
		al.add(3, "C");                     // "C" is Added at the index 3
		al.add("D");                        // "D" is Added at the last index because we haven't specified any index
		System.out.println(al);

	}

}
