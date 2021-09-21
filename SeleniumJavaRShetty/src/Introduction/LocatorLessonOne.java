package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorLessonOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("URL is :" + " " + url);
		
		//Created CSS Selector for Sign In link click using Regular expression, Plz refer document how to create CSS using regular expression
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		//Created Xpath for Username field using Regular Expression, Plz refer document how to create xpath using regular expression
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).click();
		
		//Create CSS for Password field using CCS technique
		driver.findElement(By.cssSelector("input#password")).click();
		
		//Create XPATH for SignIn button to clicking on
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Navigating to new Website
		driver.get("https://rahulshettyacademy.com/");
		
		// Clicking on Pactice lin using Linktext
		driver.findElement(By.linkText("Practice")).click();
		
		// Entering name into Name field creating xpath using Xpath customizable technique
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ganesh Salunkhe");
		
		//Created xpath using Regular expression for entering the Email
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ganusalunkhe@gmail.com");
		
		//Created the CSS selector using CSS selector technique
		driver.findElement(By.cssSelector("input[name='agreeTerms']")).click();
		
		//Created CCC selector using CSS selector technique
		driver.findElement(By.cssSelector("button#form-submit")).click();
		
		Thread.sleep(2000);
		// Sending partial text
		driver.findElement(By.partialLinkText("Practise - 1")).click();
		
		// Navigating to website
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		// Created XPTH for search field using Parent Child traversing technique
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Gauri Khalate");
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
