package javaBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Account implements Serializable {
	String username = "Rajendra";
	transient String pwd = "Prasad990";
	transient int pin = 2345;

	private void writeObject(ObjectOutputStream oos) throws Exception {

		oos.defaultWriteObject();
		String epwd = "123"+pwd;
		int epin = 6666+pin;
		oos.writeObject(epwd);
		oos.writeInt(epin);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		
		ois.defaultReadObject();
		String epwd = (String)ois.readObject();
		pwd = epwd.substring(3);
		int epin = (int)ois.readInt();
		pin = epin-6666;

	}

}

class CustomizedSerialization1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		Account a1 = new Account();

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();

		System.out.println(a2.username + " and " + a2.pwd + " and " + a2.pin);
 
	}

}
