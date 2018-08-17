package javaBasics;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo1 implements Externalizable {

	String s;
	int i;
	int j;

	public ExternalizationDemo1() {
		System.out.println("public no-argument contructor called!!");
	}

	public ExternalizationDemo1(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = (int) in.readInt();

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ExternalizationDemo1 d1 = new ExternalizationDemo1("Rajendra", 10, 20);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo1 d2 = (ExternalizationDemo1) ois.readObject();
		System.out.println(d2.s + "...." + d2.i + "...." + d2.j);

	}

}
