package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateGet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cogitate.us/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("URL is :" + " " + url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hasNav\"]/nav/div/ul/li[16]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
