package javaBasics;

public class VarAgrs {

	public static void main(String[] args) {

		P1 p = new P1();
		p.show(10, 20, 30);

	}
}

class P1 {

	public void show(int... a) {

		for (int i : a) {

			System.out.println(i);
		}
	}
}
