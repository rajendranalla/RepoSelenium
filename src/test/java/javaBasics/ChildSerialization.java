package javaBasics;

import java.io.*;

class Animal {
	
	int i = 10;
	
	Animal(){
		
		System.out.println("Animal constructor called!!");
	}
}

class Horse extends Animal implements Serializable{
	
	int j = 20;
	
	Horse(){
		
		System.out.println("Horse constructor called!!");
	}
}

public class ChildSerialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{

		Horse h1 = new Horse();
            h1.i = 222;
            h1.j = 333;
            
         //	Serialization   
         FileOutputStream fos = new FileOutputStream("abc.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(h1);
         
         //De-serialization
         System.out.println("De-serialization started!!");
         FileInputStream fis = new FileInputStream("abc.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Horse h2 = (Horse)ois.readObject();
         
         System.out.println(h2.i+ " and "+ h2.j);
         
         

	}

}
