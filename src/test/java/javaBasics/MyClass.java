package javaBasics;

public class MyClass {

	public static void main(String[] args) {

		MyStudent william = new MyStudent();

		william.setId(1);
		william.setName("William Herrera");
		william.setAge(18);

		System.out.println(william.name + " is " + william.age + " years old " + "and his ID is " + william.id);

		MyStudent john = new MyStudent();

		john.setId(2);
		john.setName("John Sidebottom");
		john.setAge(20);

		System.out.println(john.name + " is " + john.age + " years old " + "and his ID is " + john.id);

	}

}
