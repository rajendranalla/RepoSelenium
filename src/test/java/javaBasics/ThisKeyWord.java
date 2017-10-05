package javaBasics;

public class ThisKeyWord {

	public static void main(String args[]) {

//		A obj = new A(x);
//		obj.show();

	}

	class A {

		public int x;

		public A(int x) {
			this.x = x;
		}

		public void show() {
			System.out.println(x);
		}

	}
}
