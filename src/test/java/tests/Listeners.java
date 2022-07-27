package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.Testing.utils.ExtentReporterNG;

public class Listeners implements ITestListener{
	
	ExtentTest test;
    ExtentReports extent  = ExtentReporterNG.getReporterObject();
	@Override
	public void onTestStart(ITestResult result) {

	  test =extent.createTest(result.getMethod().getMethodName());	
	  Reporter.log(result.getMethod().getMethodName() +" method started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "test passed");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "test failed");	
		test.fail(result.getThrowable());
		 Reporter.log(result.getMethod().getMethodName() +" method failed", true);
		
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
