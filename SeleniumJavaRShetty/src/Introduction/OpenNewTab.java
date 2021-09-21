package Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		d.get("https://www.path2usa.com/travel-companions");
		
		d.findElement(By.tagName("body")).sendKeys(Keys.CONTROL,"t"); 
		
	
		d.get("https://google.com/");
		
       
	}

}
