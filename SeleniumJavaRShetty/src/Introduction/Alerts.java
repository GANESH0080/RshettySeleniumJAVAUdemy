package Introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("#alertbtn")).click();
		
		Thread.sleep(2000);
		
		String actualAlerttext = d.switchTo().alert().getText();
		
		
		Assert.assertEquals(actualAlerttext, "Hello , share this practice page and share your knowledge");
		
		 d.switchTo().alert().accept();
		
		d.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);
		
		d.switchTo().alert().dismiss();
		
		
		
		
	}

}
