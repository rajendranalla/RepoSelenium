package javaBasics;

import java.io.*;


@SuppressWarnings("serial")
class Sample2 implements Serializable {

	int i = 10;
	transient int j = 20;
}

class TransientExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Sample2 s1 = new Sample2();

		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		
		//De-serialization
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Sample2 s2 = (Sample2)ois.readObject();
	    
	    System.out.println(s2.i+" and "+s2.j);
	
	}

	
}
