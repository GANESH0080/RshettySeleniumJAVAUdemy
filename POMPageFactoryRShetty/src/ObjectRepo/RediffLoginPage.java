package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {
	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login1")
	WebElement txtbxusername;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtbxPassword;

	@FindBy(name = "proceed")
	WebElement btnSignIn;

	@FindBy(xpath = "//a[@href='https://www.rediff.com']")
	WebElement linkHome;

	public WebElement enterEmail() {
		return txtbxusername;
	}

	public WebElement enterPassword() {
		return txtbxPassword;
	}

	public WebElement clickSignIn() {
		return btnSignIn;
	}

	public WebElement homeLink() {
		return linkHome;
	}

}
