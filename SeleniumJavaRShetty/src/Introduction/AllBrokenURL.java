package Introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AllBrokenURL {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	
		SoftAssert sa = new SoftAssert();
		
		
		
		List <WebElement> links = d.findElements(By.cssSelector("li[class='gf-li'] a"));
	    System.out.println(links.size());

        for(WebElement link : links)
        {

	    // STEPS 1 : Get the url which tideup with link using selenium
	    // Using get attribute method we can get the value of link
	    // Created css for specific link using regular expression concept
	    // rest is avaialable in link so usind rest and * means anything
	      String actualURL = link.getAttribute("href");
	    //Printing the URL
	      System.out.println("URL is : " +" " +actualURL);
	

	
	// Creating object for URL class and pass the page non broken url as parameter
	URL nu = new URL(actualURL);
	
	
	
	
	//HttpURLConnection is the return type of Openconnection method
	//OpenConnection is the method of URL class
	//HttpURLConnection conn = (HttpURLConnection) nu.openConnection();
	HttpURLConnection conn = (HttpURLConnection)nu.openConnection();
	//Sending request using HEAD method
	conn.setRequestMethod("HEAD");
	conn.connect();
	//Printing the ResponseCode of that URL
	System.out.println(conn.getResponseCode());
        
	
sa.assertTrue(conn.getResponseCode()<400, "Broken link is :" +" " +link.getText() +" " +"and status code is:" +conn.getResponseCode());


        }	
		sa.assertAll();
	}
	
	}