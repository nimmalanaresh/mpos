package AppiumTest.NSPOS.UTIL;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
static ExtentReports extent ;
	
	public  static ExtentReports getReporterObject() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Reports");
		reporter.config().setDocumentTitle("mpos Reports");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TestEngineer", "Manoj");
		return extent;
		
	}
}	



