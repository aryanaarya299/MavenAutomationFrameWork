package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest{
	@Test
	public void testValidLogin() throws InterruptedException {
		try{
		LoginPage lp = new LoginPage(driver);
		String username = Lib.getCellValue("inputdata", "ValidLogin", 1, 0);
		String password = Lib.getCellValue("inputdata", "ValidLogin", 1, 1);
		System.out.println(username);
		System.out.println(password);
		lp.setUsername(username);
		Thread.sleep(3000);
		//enter manager
		lp.setPassword(password);
		Thread.sleep(3000);
		//click on login button
		lp.clickLogin();
		//Thread.sleep(6000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//polling period/ pooling period 500 millisocond
		//Wait till the home page is completely loaded (COndition to be true)
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track123"));//TimeoutException
		//Whether i am successfuly nabigate to home page or not ?
		String actHomePageTitle = driver.getTitle();
		System.out.println("Home page title is : "+ actHomePageTitle);
		Assert.assertEquals(actHomePageTitle, "actiTIME - Enter Time-Track");
	}
}
