package javaBasics;

import java.io.*;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;

@SuppressWarnings("serial")
class Sample implements Serializable {

	int i = 40;
	int j = 50;
}

class SerializationExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Sample s1 = new Sample();

		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		
		//De-serialization
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Rajendra Prasad\\\\Documents\\\\Selenium\\\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Sample s2 = (Sample)ois.readObject();
	    
	    System.out.println(s2.i+" and "+s2.j);
	
	}

	
}
