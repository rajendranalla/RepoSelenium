package javaBasics;

import javaBasics.InheritanceDemo.Child;

public class InheritanceDemo {

	public void m1() {
		System.out.println("Parent");
	}

	public class Child extends InheritanceDemo {
		public void m2() {
			System.out.println("Child");
		}
	}
	
	public static void main(String[] args) {

		InheritanceDemo id = new InheritanceDemo();
		id.m1();

		Child c = id.new Child();
		c.m1();
		c.m2();

		InheritanceDemo id2 = id.new Child();
		id2.m1();
		

	}

}
