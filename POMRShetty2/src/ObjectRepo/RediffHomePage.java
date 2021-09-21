package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;

	public RediffHomePage(WebDriver driver) {

		this.driver = driver;
	}

	By txtboxSearch = By.id("srchword");

	public WebElement entersearchText() {

		return driver.findElement(txtboxSearch);

	}

}
