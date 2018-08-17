package javaBasics;

public class MethodSignature {

	public void m1(int i) {
		System.out.println(i);
	}

	public void m2(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		MethodSignature ms = new MethodSignature();
		ms.m1(10);
		ms.m1('c');  // Here char is auto-promoted to int value
		ms.m2("Prasad");
		
//		ms.m1(10.5f); // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		             // The method m1(int) in the type MethodSignature is not applicable for the arguments (double)

	}

}
