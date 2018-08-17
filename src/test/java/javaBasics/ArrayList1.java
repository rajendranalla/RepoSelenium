package javaBasics;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Serializable> al = new ArrayList<Serializable>();

		al.add("A");
		al.add(100);
		al.add("B");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(3, "C");
		al.add(2, "D");
		

		System.out.println(al);

	}

}
