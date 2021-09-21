package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_email")
	WebElement txtboxUsername;

	@FindBy(id = "user_password")
	WebElement txtboxPassword;

	@FindBy(css = "input[type='submit']")
	WebElement btnLogin;

	public WebElement enterUserName() {

		return txtboxUsername;

	}

	public WebElement enterPassword() {

		return txtboxPassword;

	}

	public WebElement clickLoginBtn() {

		return btnLogin;

	}

}