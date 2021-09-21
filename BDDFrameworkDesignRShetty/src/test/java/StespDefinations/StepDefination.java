package StespDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworkDesign.HomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalMainPage;
import resources.base;

public class StepDefination extends base {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	LoginPage login;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initilizedriver();
		log.info("Driver Initiliazed for HomePage Testcase");
	}

	@Given("^Navigate to the \"([^\"]*)\" site$")
	public void navigate_to_the_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on secure sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {

		LandingPage lndpage = new LandingPage(driver);
		if (lndpage.closePopupsize() > 0) {
			lndpage.closePopup().click();
		}
		login = lndpage.clickLogin();
	}

	@Then("^Verify user is successfully Logged In$")
	public void verify_user_is_successfully_Logged_In() throws Throwable {

		PortalMainPage p = new PortalMainPage(driver);
		Assert.assertTrue(p.serchCourse().isDisplayed());
	}

	@And("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		login.enterUserName().sendKeys(username);
		login.enterPassword().sendKeys(password);
		login.clickLoginBtn().click();
	}
}