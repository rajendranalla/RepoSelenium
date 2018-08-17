package javaBasics;

import java.io.*;


@SuppressWarnings("serial")
class Sample3 implements Serializable {

	int i = 10;
	transient final int j = 20;
}

class TransientFinalVariable {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Sample3 s1 = new Sample3();

		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		
		//De-serialization
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sample3 s2 = (Sample3)ois.readObject();
	    
	    System.out.println(s2.i+" and "+s2.j);
	
	}

	
}
