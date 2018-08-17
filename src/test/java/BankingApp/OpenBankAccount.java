package BankingApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class OpenBankAccount extends TestBase {

	@Test(dataProvider = "openAccount")
	public void openAccount(String customer, String currency, String alertText) throws Exception {

		try {
			// click("bmlBtn_css");
			// Thread.sleep(2000);
			click("openAccount_css");
			Thread.sleep(2000);
			select("customer_css", customer);
			Thread.sleep(2000);
			select("currency_css", currency);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		click("process_css");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		Assert.assertTrue(alert.getText().contains(alertText), " cannot find text in the alert ");
		alert.accept();
	}

	@DataProvider(name = "openAccount")
	public Object[][] getData() throws Exception {

		return TestUtil.getData("openAccount");
	}

}
