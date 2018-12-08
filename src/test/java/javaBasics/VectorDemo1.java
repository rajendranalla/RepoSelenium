package javaBasics;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {

		// With default capacity i.e., 10
		Vector<Comparable> v = new Vector<Comparable>();
		System.out.println("Default capacity is " + v.capacity()); // 10
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}

		System.out.println("After adding 10 elements the capacity is " + v.capacity()); // 10
		v.addElement("A");
		System.out.println("After adding 11th elements the capacity is " + v.capacity()); // 20
		System.out.println(v);

		System.out.println("++++++++++++++++++++++++");
		// With initial capacity set to 25
		Vector<Comparable> v2 = new Vector<Comparable>(25);
		System.out.println("Initial capacity " + v2.capacity()); // 25
		for (int i = 1; i <= 10; i++) {
			v2.addElement(i);
		}

		System.out.println("After adding 10 elements the capacity is " + v2.capacity()); // 25
		v2.addElement("A");
		System.out.println("After adding 11th elements the capacity is " + v2.capacity()); // 25
		System.out.println(v2);

		System.out.println("++++++++++++++++++++++++");
		// With initial capacity set to 10 and incremented by 5
		Vector<Comparable> v3 = new Vector<Comparable>(10, 5);
		System.out.println("Initial capacity " + v3.capacity()); // 10
		for (int i = 1; i <= 10; i++) {
			v3.addElement(i);
		}

		System.out.println("After adding 10 elements the capacity is " + v3.capacity()); // 10
		v3.addElement("A");
		System.out.println("After adding 11th elements the capacity is " + v3.capacity()); // 15
		System.out.println(v3);

	}

}
