
package ExtendReportRShetty.ExtendReportByRShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportPhase1Test {
	ExtentReports EReport;
	ExtentSparkReporter reporter;

	@BeforeTest
	public void EReportSetup() {
		String path = System.getProperty("user.dir")+"\\Reports\\ExtentReportsResult.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("RShety ExtentReport");
		reporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		reporter.config().setTheme(Theme.DARK);
		EReport = new ExtentReports();
		EReport.attachReporter(reporter);
		EReport.setSystemInfo("Tester", "Ganesh S");

	}

	@Test
	public void TCase() {
		EReport.createTest("Extent Reporting By GANESH SALUNKHE");
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		System.out.println(d.getTitle());
		EReport.flush();
	}
	

	@Test
	public void TCase1() {
		EReport.createTest("Extent Reporting By GANESH SALUNKHE");
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_92\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		System.out.println(d.getTitle());
		
	
}
	@AfterTest
	public void EReportFlush()
	{
		EReport.flush();	
	}
}