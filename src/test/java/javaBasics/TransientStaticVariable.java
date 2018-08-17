package javaBasics;

import java.io.*;

@SuppressWarnings("serial")
class Sample1 implements Serializable {

	int i = 10;
	transient static int j = 20;
}

class TransientStaticVariable {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Sample1 s1 = new Sample1();

		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		
		//De-serialization
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sample1 s2 = (Sample1)ois.readObject();
	    
	    System.out.println(s2.i+" and "+s2.j);
	
	}

	
}
