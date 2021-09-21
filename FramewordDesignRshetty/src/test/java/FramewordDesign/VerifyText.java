package FramewordDesign;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;



public class VerifyText extends base {
	public static Logger log = LogManager.getLogger(VerifyText.class.getName());

	@BeforeMethod
	public void startExecution() throws IOException {
		driver = initilizedriver();
		log.info("Driver is Initialized for VerifyText testcase");
		
	}

	@Test
	public void basePageNavigation() throws IOException {
		driver.get(prob.getProperty("url"));
		LandingPage lndpage = new LandingPage(driver);
		System.out.println(lndpage.txtverification().getText());
		Assert.assertEquals(lndpage.txtverification().getText(), "FEATURED COURSES");
		log.info("Testcase Executed successfully for VerifyText");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		log.info("Browser closed for VerifyText");
	}

}