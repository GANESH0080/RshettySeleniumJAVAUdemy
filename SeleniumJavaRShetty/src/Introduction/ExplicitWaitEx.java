package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		d.findElement(By.xpath("//*[text()='Click to load get data via Ajax!']")).click();

		WebDriverWait w = new WebDriverWait(d, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));

		System.out.println(d.findElement(By.id("results")).getText());

	}

}
