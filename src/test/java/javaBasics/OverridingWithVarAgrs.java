package javaBasics;

public class OverridingWithVarAgrs {

	public static void main(String[] args) {

		P p = new P();
		p.m1(10);

		C c = new C();
		c.m1(20);

		P p1 = new C();
		p1.m1(30);

	}
}

class P {

	public void m1(int... i) {
		System.out.println("Parent");
	}
}

class C extends P {

	public void m1(int... i) {
		System.out.println("Child");
	}
}
