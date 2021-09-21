package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.RediffHomePage;
import ObjectRepo.RediffLoginPage;

public class RediffSignIn {

	@Test
	public void LoginTestCase() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.enterEmail().sendKeys("test");
		rd.enterPassword().sendKeys("test");
		rd.clickSignIn().click();
		rd.homeLink().click();
		RediffHomePage rHome = new RediffHomePage(driver);
		rHome.entersearchText().sendKeys("Testing");
		rHome.entersearchText().sendKeys(Keys.ENTER);

	}
}
