package javaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class IOExceptionDemo {

	public static void main(String[] args) throws IOException {

		// Create a file in local directory

		File path = new File("hello.txt");
		System.out.println("We got a file " + path);
		System.out.println("Does it exists? " + path.exists());
		System.out.println("is it a file " + path.isFile());
		System.out.println("is it a Hidden " + path.isHidden());

		// Write content to file

		String contentToWrite = "Hello World!!";
		OutputStream os = new FileOutputStream(path);
		os.write(contentToWrite.getBytes());
		os.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String firstLine = br.readLine();
		br.close();
		System.out.println("Read a line: " + firstLine);

		// Reading from Internet file
		URL url = new URL("http://textfiles.com/internet/asn.txt");
		InputStream stream = url.openStream();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(stream));
		String internettext = br2.readLine();

		while (internettext != null) {
			System.out.println(internettext);
			internettext = br2.readLine();
		}
		System.out.println("Done reading!!");

	}

}
