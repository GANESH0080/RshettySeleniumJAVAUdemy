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

public class VerifyText extends base {
	public static Logger log = LogManager.getLogger(VerifyText.class.getName());
	public WebDriver driver;
	public LandingPage lndpage;
	@BeforeTest
	public void startExecution() throws IOException, InterruptedException {
		driver = initilizedriver();
		log.info("Driver is Initialized for VerifyText testcase");
		driver.get(prob.getProperty("url"));
		log.info("Navigate to Home page for verifying text and Header");
	}

	@Test(priority =0)
	public void verifyText() throws IOException {
		
		lndpage = new LandingPage(driver);
		System.out.println(lndpage.txtverification().getText());
		Assert.assertEquals(lndpage.txtverification().getText(), "FEATURED COURSES");
		log.info("Testcase Executed successfully for VerifyText");
	}

	@Test(priority =1)
	public void verifyHeader() throws IOException {
		System.out.println(lndpage.getHeader().getText());
		Assert.assertEquals(lndpage.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Testcase Executed successfully for VerifyText");
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		log.info("Browser closed for VerifyText");
	}

}