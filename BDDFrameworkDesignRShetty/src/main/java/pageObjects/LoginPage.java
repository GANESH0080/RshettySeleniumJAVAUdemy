package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_email")
	private WebElement txtboxUsername;

	@FindBy(id = "user_password")
	private WebElement txtboxPassword;

	@FindBy(css = "input[type='submit']")
	private WebElement btnLogin;

	@FindBy(css = "[href*= 'password/new']")
	private WebElement lnkforgotPass;

	public WebElement enterUserName() {

		return txtboxUsername;

	}

	public WebElement enterPassword() {

		return txtboxPassword;

	}

	public WebElement clickLoginBtn() {

		return btnLogin;

	}

	public ForgotPassword forgotpass() {

		lnkforgotPass.click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;

	}

}