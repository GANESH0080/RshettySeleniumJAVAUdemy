package Introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AsserationForCheckbxDrpRbutn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_91\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		// AssertFalse method expecting false condition
		// If condition true then It will fail and occur the exception Asseration error, If condition is false the it will go to next step
		// syntax : Assert.assertFalse(False);
		Assert.assertFalse((d.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()));
		
		//If Assert.assertFalse((false) then we cant print the Sring message as Assertpass
		Assert.assertFalse((d.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()), "AssertPass");
		
		//Using contains technique we are creating the xpath
		d.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		
		// Here we are passing tru condition in Assertfalse so failing
		//If Assert.assertFalse((True) then we can print the Sring message as Assertpass
		//Assert.assertFalse(d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected(), "Assert false test message");
		
		// If the condition is true then we are not printing the message
		Assert.assertTrue(d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected(), "Assert True test message");	
	
		// If the condition is false then we are printing the string message
		//Assert.assertTrue(d.findElement(By.cssSelector("input[id*='IndArm']")).isSelected(), "Assert True test message");
		
		
		String actualTittle= "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String expectedTittle = d.getTitle();
		System.out.println(expectedTittle);
		// Verifying both actual and expcted tittle using assertEquals
		// If tittle is not match then only printing the message
		Assert.assertEquals(actualTittle, expectedTittle, "Tittle is Failed");
		
		// Storing boolean values in isSelected variable with checking selected or not
		Boolean isSelected = d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		// Printing that boolean value
		System.out.println(isSelected);
		// Unchecking the same checkbox
		d.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		// Again storing the boolean value innisUnselected variable with checking selected or not
		Boolean isUnSelected = d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		// Printing the boolean value
		System.out.println(isUnSelected);
		
		// Selecting Arm checkbox 
		d.findElement(By.cssSelector("input[id*='IndArm']")).click();
        
		// Storing Boolean value in isArmSelected variable witrh checking selected or not
		Boolean isArmSelected = d.findElement(By.cssSelector("input[id*='IndArm']")).isSelected();
	
		//Asserting both unselected and selected chewckbox using AssertEquals
		Assert.assertEquals(isUnSelected, isArmSelected, "Boolean value failed");
	}

}
