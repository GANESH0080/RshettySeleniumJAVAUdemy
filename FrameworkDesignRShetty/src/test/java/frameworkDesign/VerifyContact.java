package frameworkDesign;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class VerifyContact extends base {
	public static Logger log = LogManager.getLogger(VerifyContact.class.getName());
	public WebDriver driver;


	@BeforeTest
	public void startExecution() throws IOException, InterruptedException {
		driver = initilizedriver();
		log.info("Driver Initiliazed for VerifyContact Testcase");
		
	}

	@Test
	public void VerifyContactMenu() throws IOException {
		driver.get(prob.getProperty("url"));
		LandingPage lndpage = new LandingPage(driver);
		Assert.assertTrue(lndpage.txtVerifyContact().isDisplayed());
		log.info("Testcase Executed successfully for VerifyContact");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		log.info("Browser closed for VerifyContact");
	}
}