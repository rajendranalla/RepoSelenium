package javaBasics;

public class MethodSignature2 {

	public void m1(int i) {
		System.out.println(i);
	}

	public void m2(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {

		MethodSignature2 ms = new MethodSignature2();
		ms.m1(20);
		ms.m2(30);

	}

}
