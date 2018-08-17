package BankingApp;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws Exception {

		Assert.assertTrue(isElementEnabled("bmlBtn_css"), "Bank manager button found");
		click("bmlBtn_css");

		Assert.assertTrue(isElementEnabled("addCustBtn_css"), "Add Customer button Enabled");

		// To fail the testcase
		// Assert.fail("Bank Manager login not successful");

	}

}
