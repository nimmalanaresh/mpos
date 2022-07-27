package com.Testing.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;

public class Sreenshot {
	
	public String ss(String testcasename ,AppiumDriver driver) throws Throwable {
		
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 String destfile =System.getProperty("user.dir")+"\\reports"+ testcasename+".png";
		 FileUtils.copyFile(source, new File(destfile));
		 return destfile;
		 
		
		
	}
}
