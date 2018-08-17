package javaBasics;

public class OverloadingStringObject {

	public void m1(String s) {
		System.out.println("String-version");
	}

	public void m1(Object o) {
		System.out.println("Object-version");
	}

	public static void main(String[] args) {
		
		OverloadingStringObject osb = new OverloadingStringObject();
		osb.m1("Prasad");
		osb.m1(new Object());
		osb.m1(null);    /* while resolving overloaded methods compiler will always give preference for child-type argument
		                 when compared to parent-type argument. That's why here null is considered as String (String is child of Object) */

	}

}
