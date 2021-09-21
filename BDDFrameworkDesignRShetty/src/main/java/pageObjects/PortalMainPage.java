package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalMainPage {
	public WebDriver driver;
	private By txtbxSearch = By.xpath("//input[@id='search']");

	public PortalMainPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement serchCourse() {

		return driver.findElement(txtbxSearch);
	}
}