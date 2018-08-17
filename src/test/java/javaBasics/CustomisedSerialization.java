package javaBasics;

	import java.io.*;

	@SuppressWarnings("serial")
	class AccountDetails implements Serializable {
		
		String username = "Rajendra";
		transient String password = "Prasad";
		
		//This method is called at the time of serialization
		
		private void writeObject(ObjectOutputStream oos) throws Exception{
			oos.defaultWriteObject();        //default serialization
			String epwd = "!@#$"+ password;  //encrypted password = "!@#$" + original password
			oos.writeObject(epwd);
		}
		
		//This method is called at the time of de-serialization
		
		private void readObject(ObjectInputStream ois) throws Exception {
			ois.defaultReadObject();        //default de-serialization
			String epwd = (String)ois.readObject();
			password = epwd.substring(4);    //original password = encrypted password - "1234" 
		}
		
	}


	public class CustomisedSerialization {

		@SuppressWarnings({ "resource" })
		public static void main(String[] args) throws Exception{
			
			AccountDetails a1 = new AccountDetails();
//			System.out.println("username : "+a1.username+" , password : "+a1.password);
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc3.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Rajendra Prasad\\Documents\\Selenium\\abc3.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			AccountDetails a2 = (AccountDetails)ois.readObject();
			System.out.println("username : "+a2.username+" , password : "+a2.password);

		}

	}
