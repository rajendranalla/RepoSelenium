package javaBasics;

public class Overloading2 {

	public static void main(String[] args) {

		System.out.println("Int values: " + Add(10, 20));
		System.out.println("Double values: " + Add(17.5, 22.9));
		System.out.println("Float values: " + Add(33.5f, 67.4f));
		System.out.println("String name: " + Add("Rajendra", " Nalla"));
	}

	public static int Add(int a, int b) {
		return (a + b);
	}

	public static double Add(double a, double b) {
		return (a + b);
	}

	public static float Add(float a, float b) {
		return (a + b);
	}

	public static String Add(String a, String b) {
		return (a + b);

	}
}
