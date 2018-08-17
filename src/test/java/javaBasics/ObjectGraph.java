package javaBasics;

import java.io.*;

@SuppressWarnings("serial")
class Dog implements Serializable {
	
	Cat c = new Cat();
}


class Cat implements Serializable {
	
	Rat r = new Rat();
}


class Rat implements Serializable {
	
	int i =10;
}



public class ObjectGraph {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Exception{
		
		Dog d1 = new Dog();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc3.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc3.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.c.r.i);

	}

}
