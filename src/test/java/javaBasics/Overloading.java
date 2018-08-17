package javaBasics;

public class Overloading {
	
	public void m1() {

		System.out.println("no-arg");
	}

	public void m1(int i) {

		System.out.println("int-arg");
	}

	public void m1(double d) {

		System.out.println("double-arg");
	}

	public static void main(String[] args) throws Exception {

		Overloading t = new Overloading();
		t.m1();
		t.m1(10);
		t.m1('c');  //char is auto-promoted to int
		t.m1(20L);  //Long is auto-promoted to double
		t.m1(20f);  //float is auto-promoted to double
		t.m1(10.5);
	}
}


