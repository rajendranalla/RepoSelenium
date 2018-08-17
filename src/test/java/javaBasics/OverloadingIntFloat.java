package javaBasics;

public class OverloadingIntFloat {

	public static void main(String[] args) throws Exception {

		Test1 t = new Test1();

		t.m1(10, 10.5f);
		t.m1(10.5f, 10);

		
//		 t.m1(10, 10);  //The method m1(int, float) is ambiguous for the type Test1
//		 t.m1(10.5f, 10.5f); //The method m1(float, int) in the type Test1 is not applicable for the arguments (float, float)

	}
}

class Test1 {

	public void m1(int i, float f) {
		System.out.println("int-float version");
	}

	public void m1(float f, int i) {
		System.out.println("float-int version");
	}
}
