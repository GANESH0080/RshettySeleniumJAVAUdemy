package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	By linkLogin = By.cssSelector("a[href*='sign_in']");
	By txtVerify = By.xpath("//*[text()= 'Featured Courses']");
	By txtContact = By.xpath("//*[text()= 'Contact']");

	public WebElement clickLogin() {

		return driver.findElement(linkLogin);

	}

	public WebElement txtverification() {

		return driver.findElement(txtVerify);

	}

	public WebElement txtVerifyContact() {

		return driver.findElement(txtContact);

	}

}
