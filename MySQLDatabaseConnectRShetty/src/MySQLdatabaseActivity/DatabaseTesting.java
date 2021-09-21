package MySQLdatabaseActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String host = "localhost";
		String port = "3306";

		Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/practiceDB", "root",
				"Salunkhe@97");

		Statement s = conn.createStatement();
		ResultSet res = s.executeQuery("select * from EmployeeInfo where id = 90");
		while (res.next()) {
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.cssSelector("input[type='email']")).sendKeys(res.getString("name"));
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys(res.getString("location"));
			driver.findElement(By.cssSelector("input#Login")).click();
			driver.quit();
			

		}
	}

}
