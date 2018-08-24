package com.Testng.Programs;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNG {

	@BeforeMethod
	public void startBrowser() {
		System.out.println("Browser started!!");
	}

	@Test
	public void Login() {
		System.out.println("Login Page");
		throw new SkipException("Skip this test case");
	}

	@Test
	public void clickLink() {
		System.out.println("Click link in the browser");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Quit Browser!!");
	}

}
