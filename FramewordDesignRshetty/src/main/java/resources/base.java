package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prob;

	public WebDriver initilizedriver() throws IOException {
		prob = new Properties();
		FileInputStream file = new FileInputStream(
				"D:\\SeleniumWorkspace\\FramewordDesignRshetty\\src\\main\\java\\Resources\\data.properties");
		prob.load(file);
		String browserName = prob.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("mozila"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Geckodriver_18\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\IEBrowser\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
