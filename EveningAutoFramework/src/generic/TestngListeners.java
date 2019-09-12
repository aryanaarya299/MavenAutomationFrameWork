package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestngListeners implements ISuiteListener,ITestListener{

	@Override
	public void onStart(ISuite suite) {
		
		Reporter.log(suite.getName() + " --> started....", true);
		
	}

	@Override
	public void onFinish(ISuite suite) {
		
		Reporter.log(suite.getName() + " --> ended....", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName() + " --> test method is started....", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName() + " --> test method is PASS....", true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName() + " --> test method is FAILED....", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName() + " --> test method is SKIPPED....", true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onStart(ITestContext testblock) {
		Reporter.log(testblock.getName() + " -->  block is started....", true);
	}

	@Override
	public void onFinish(ITestContext testblock) {
		Reporter.log(testblock.getName() + " -->  block finished.....", true);
		
	}

}
