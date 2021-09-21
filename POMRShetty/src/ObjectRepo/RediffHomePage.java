package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;

	public RediffHomePage(WebDriver driver) {

		this.driver = driver;
	}

	By txtboxSearch = By.id("srchword");

	public void entersearchText() {

		driver.findElement(txtboxSearch).sendKeys("Testing");

	}
	public void pressEnterKey() {

		driver.findElement(txtboxSearch).sendKeys(Keys.ENTER);

	}
}
