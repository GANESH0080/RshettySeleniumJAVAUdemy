package Introduction;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		d.findElement(By.cssSelector("div#start button")).click();
		
		Wait<WebDriver> w =new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
	
	
	/*WebElement foo = w.until(new Function<WebDriver, WebElement>() {
	      // This method trying to return the Webelement which we want 
	      // So return type of the methos is webelement only
		  public WebElement apply(WebDriver d) {
			    return d.findElement(By.cssSelector("#finish"));
		 }
	});*/
	
	
	
	}
}

	
