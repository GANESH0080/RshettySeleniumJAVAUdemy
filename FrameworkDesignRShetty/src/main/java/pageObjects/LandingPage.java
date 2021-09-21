package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		
	}

	 private By linkLogin =  By.cssSelector("a[href*='sign_in']");
	 private By txtVerify =  By.xpath("//*[text()= 'Featured Courses']");
	 private By txtContact = By.xpath("//*[text()= 'Contact']");
	 private By txtheader = By.cssSelector("div[class*='video-banner'] h3");
	 

	public LoginPage clickLogin() {

		driver.findElement(linkLogin).click();
		LoginPage login = new LoginPage(driver);
		return login;

	}

	public WebElement txtverification() {

		return driver.findElement(txtVerify);

	}

	public WebElement txtVerifyContact() {

		return driver.findElement(txtContact);

	}
	public WebElement getHeader() {

		return driver.findElement(txtheader);

	}

}
 