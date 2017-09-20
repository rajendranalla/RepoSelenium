package ListenersDemo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtil;

public class ListenersTestNG implements ITestListener {

	public void onFinish(ITestContext result) {

	}

	public void onStart(ITestContext result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Reporter.log("<a href="+TestUtil.fileName+" target=\"_blank\">Screenshot Captured</a>");
		Reporter.log("<br>");
		Reporter.log("<a href="+TestUtil.fileName+" target=\"_blank\"><img src="+TestUtil.fileName+" height=200 width=200></a>");
		
		System.out.println("Testcase failed and the testcase details are: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Testcase skipped and the testcase details are: " + result.getName());
	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Testcase passed and the testcase details are: " + result.getName());
	}

}
