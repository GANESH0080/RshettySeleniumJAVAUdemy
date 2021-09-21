package Introduction;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHTTPHandling {

	public static void main(String[] args) {
		// Created new general chrome profile 
		// Using below profile giving knowledge to the "d" object to accept insecure certificates.
		DesiredCapabilities d = new DesiredCapabilities();
		//giving the knowledge of browser, we need to handle customizable things for chrome
		d.chrome();
		// Accepting the insecure certificates
		// Using below statement we are giving knowledge to our profile
		d.acceptInsecureCerts();
		
		// One more way to accepting the SSL / HTTP/ insecure cetificates
		// Using below statement we are giving knowledge to our profile
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		
		//Below code is belong to your local browser
		ChromeOptions c = new ChromeOptions();
		// using genreal profile object "d", your actual browser get knowledge of handling the certificates 
		c.merge(d);
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		// When you initalize the browser then we have to just pass the ChromeOption local browser object "C"
		// because now C have knowledge of handling the certificates
		WebDriver driver = new ChromeDriver(c);
		driver.get("url");
	}

}
