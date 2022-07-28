package PageObjects;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import AppiumTest.NSPOS.UTIL.ExtentReporterNG;
import io.appium.java_client.AppiumDriver;




public class Listeners extends ExtentReporterNG implements ITestListener {
	ExtentTest test;
	AppiumDriver driver;

	   ExtentReports extent  = ExtentReporterNG.getReporterObject();
		@Override
		public void onTestStart(ITestResult result) {

		  test =extent.createTest(result.getMethod().getMethodName());	
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			test.log(Status.PASS, "test passed");	
		}

	    @Override
        public void onTestFailure(ITestResult result) {
	    	test.log(Status.FAIL, "test failed");
	    	test.fail(result.getThrowable());
	    	try {
				driver =(AppiumDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
	    	try {
				test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }		
		@Override
		public void onTestSkipped(ITestResult result) {
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
			
				}

		@Override
		public void onStart(ITestContext context) {
			
			
				}

		@Override
		public void onFinish(ITestContext context) {

			extent.flush();
				}
}
