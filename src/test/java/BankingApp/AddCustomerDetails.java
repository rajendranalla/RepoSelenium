package BankingApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class AddCustomerDetails extends TestBase {

	@Test(dataProvider = "addCustomer")
	public void addCustomer(String firstName, String lastName, String postCode, String alertText) throws Exception {

		try {

			// click("bmlBtn_css");
			// Thread.sleep(2000);
			click("addCustBtn_css");
			Thread.sleep(2000);
			type("firstName_css", firstName);
			Thread.sleep(2000);
			type("lastName_css", lastName);
			Thread.sleep(2000);
			type("postCode_css", postCode);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		click("addCustomer_css");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		Assert.assertTrue(alert.getText().contains(alertText), " cannot find text in the alert ");
		alert.accept();

	}

	@DataProvider(name = "addCustomer")
	public Object[][] getData() throws Exception {

		return TestUtil.getData("AddCustomerDetails");
	}
}
