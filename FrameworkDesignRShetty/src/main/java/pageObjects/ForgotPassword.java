package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPassword {
	
	public WebDriver driver;
	private By txbxtResetEmail = By.xpath("//input[@id='user_email']");
	private By btnSentinstruction= By.cssSelector("input[name='commit']");
	
	
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	
	}

	
	public WebElement ResetEmail() {

		return driver.findElement(txbxtResetEmail);

	}
	public WebElement clickSentInstructions() {

		return driver.findElement(btnSentinstruction);

	}
	
	

}
