package javaBasics;

public class OverloadingSameLevelTypes {

	public void m1(String s) {
		System.out.println("String-version");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer-version");
	}

	public static void main(String[] args) {

		
		OverloadingSameLevelTypes ost = new OverloadingSameLevelTypes();
		ost.m1("Prasad");
		ost.m1(new StringBuffer("Prasad"));
//		ost.m1(null); //The method m1(String) is ambiguous for the type OverloadingSameLevelTypes
	}

}
