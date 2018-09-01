package com.Testng.Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationDataProvider {

	@Test(dataProvider = "getData")

	public void testFormFill(String username, String password, Integer age) {

		// System.out.println(username + " - " + password + " - " + age);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][3];

		data[0][0] = "abc@gmail.com";
		data[0][1] = "abc123";
		data[0][2] = 15;

		data[1][0] = "xyz@gmail.com";
		data[1][1] = "xyz123";
		data[1][2] = 20;

		return data;

	}

}
