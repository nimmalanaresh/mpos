package AppiumTest.NSPOS.UTIL;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;

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
	
	public String getScreenshotPath(String testcaseName, AppiumDriver driver) throws IOException {
		File Source = driver.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"//reports"+testcaseName+".png";
		FileUtils.copyFile(Source, new File(destinationfile));
		return destinationfile;
	}
}	



