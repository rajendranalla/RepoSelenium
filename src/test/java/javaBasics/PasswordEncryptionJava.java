package javaBasics;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncryptionJava {

	public static void main(String args[]) {

		String password = "Prasad_9177";

		byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
		System.out.println("Encoded password is: " + new String(encodedPassword));

		byte[] decodedPassword = Base64.decodeBase64(encodedPassword);
//		byte[] decodedPassword = Base64.decodeBase64("cHJhc2FkMTIz".getBytes());
		System.out.println("Decoded password is: " + new String(decodedPassword));

	}

}
