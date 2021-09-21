package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By txtUsername = By.id("login1");
	By txtPassword = By.xpath("//input[@id='password']");
	By btnSignIn = By.name("proceed");
	By linkHome = By.xpath("//a[@href='https://www.rediff.com']");

	public WebElement enterEmail() {
		return driver.findElement(txtUsername);
	}

	public WebElement enterPassword() {
		return driver.findElement(txtPassword);
	}

	public WebElement clickSignIn() {
		return driver.findElement(btnSignIn);
	}

	public WebElement homeLink() {
		return driver.findElement(linkHome);
	}

}
