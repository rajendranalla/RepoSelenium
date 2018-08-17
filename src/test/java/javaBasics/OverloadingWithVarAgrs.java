package javaBasics;

public class OverloadingWithVarAgrs {

	public static void main(String[] args) {

		P2 p = new P2();
		p.m1(10);

		C2 c = new C2();
		c.m1(20);

		P2 p2 = new C2();
		p2.m1(30);

	}
}

// Different arguments - 'int... i' and 'int i'
class P2 {

	public void m1(int... i) {
		System.out.println("Parent");
	}
}

class C2 extends P2 {

	public void m1(int i) {
		System.out.println("Child");
	}
}