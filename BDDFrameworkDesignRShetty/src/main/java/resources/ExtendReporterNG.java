package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReporterNG {
	static ExtentReports EReport;
	public static ExtentReports extendReport()
	{
	String path = System.getProperty("user.dir")+"/reports/ExtentReportsResult.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Report");
	reporter.config().setDocumentTitle("RShety FrameworkReporting");
	reporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
	reporter.config().setTheme(Theme.DARK);
	EReport = new ExtentReports();
	EReport.attachReporter(reporter);
	EReport.setSystemInfo("Tester", "Ganesh S");
	return EReport;
}
}
