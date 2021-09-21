package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffLoginPage {
	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By txtUsername = By.id("login1");
	By txtPassword = By.xpath("//input[@id='password']");
	By btnSignIn = By.name("proceed");
	By linkHome = By.xpath("//a[@href='https://www.rediff.com']");
	

	public void enterEmail() {
		driver.findElement(By.id("login1")).sendKeys("Test");
	}

	public void enterPassword() {
		driver.findElement(txtPassword).sendKeys("Test");
	}

	public void clickSignIn() {
		driver.findElement(btnSignIn).click();
	}
	public void clickHome() {
		driver.findElement(linkHome).click();
	}
}
