package frameworkDesign;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void startExecution() throws IOException, InterruptedException {
		driver = initilizedriver();
		log.info("Driver Initiliazed for HomePage Testcase");
	}
	@Test(dataProvider = "getdata")
	public void UserLoginVerification(String uname, String pass) throws IOException {
		driver.get(prob.getProperty("url"));
		LandingPage lndpage = new LandingPage(driver);
		LoginPage login = lndpage.clickLogin();
		login.enterUserName().sendKeys(uname);
		login.enterPassword().sendKeys(pass);
		login.clickLoginBtn().click();
		log.info("Testcase Executed successfully for HomePage");
		ForgotPassword fb = login.forgotpass();
		fb.ResetEmail().sendKeys("ganusalunkhe@gmail.com");
		fb.clickSentInstructions().click();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		log.info("Browser closed for HomePage");
	}
	@DataProvider
	public static Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0] = "UserName_ganesh";
		data[0][1] = "Password_salunkhe";
		data[1][0] = "UserName_deepak";
		data[1][1] = "Password_salunkhe";
		data[2][0] = "UserName_omkar";
		data[2][1] = "Password_salunkhe";
		return data;
	}
}