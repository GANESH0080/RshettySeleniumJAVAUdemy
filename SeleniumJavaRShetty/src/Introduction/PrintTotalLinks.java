package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintTotalLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Getting total links available on page
		int totalLinks = driver.findElements(By.tagName("a")).size();
		// Printing the link count
		System.out.println("Total links on the page are :" +" " +totalLinks);
		
		
		//Getting total Frames available on page
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		// Printing the frame count
	    System.out.println("Total Fromaes on the page are:" +" " +totalFrames);
	    
	    
	    
	    // Taking the xpath of footer and storing into the WebElement variable
	   WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	   
	   // Using the Headerdriver getting the links avaialble on the header
	   int FooterLinks = footerdriver.findElements(By.tagName("a")).size();
	   
	   // Printing footer links count
	  System.out.println("Footer Links are:" +" " +FooterLinks);
	  
	  
	  
	  
	  // Taking the xpath of header and string into the WebElement variable
	  WebElement headerdriver = driver.findElement(By.xpath("//header[@class = 'jumbotron text-center header_style']"));
	  
	  // Using the Headerdriver getting the links avaialble on the header
	  int TotalHeaderLink = headerdriver.findElements(By.tagName("a")).size();
	   // Printing header links count
	  System.out.println("Total Header links are:" +" " +TotalHeaderLink);
	  
	  
	  
	  
	  //Store the specific section xpath of footer section
	  WebElement footerSection = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]/ul[1]"));  
	  // Storing the xpath of specific footer section using parent driver.
	  WebElement footersection1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	  
	  // Storing link size in variable
	 int footersectionlinks = footerSection.findElements(By.tagName("a")).size();
	 System.out.println("Total link under the specific section" +" " +footersection1.findElements(By.tagName("a")).size());
	  
	  
	 // Interating the links which is under the section
	   for(int i = 1; i<footersectionlinks; i++)
	   {
		  
		   // Using Action class 
		   // Pressing CTRL and clicking on every link so that every link can open in diff tab
		  Actions act = new Actions(driver);
				   act.keyDown(Keys.CONTROL).build().perform();
		   footerSection.findElements(By.tagName("a")).get(i).click();
				   
		   
		   // Using below link we are holding the CTRL key and pressing enter on that link
		   // Pressing ENTER means CLicking on that link
		    // String enterKey = Keys.chord(Keys.CONTROL,Keys.ENTER);
		    
		   //  footersection1.findElements(By.tagName("a")).get(i).sendKeys(enterKey);
		   
		    
	   }
		   // To get the total windows or set of windows
			Set<String> handle = driver.getWindowHandles();
			
			// Iterating each n every window and store it in it variable
			Iterator<String> it = handle.iterator();
			
			// Checking next windown avaialble or not 
			// If YES then doing to loop
			while(it.hasNext())
			{
				// Switiching to next window
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}	
			}
			
	   }
	   
		  
	  