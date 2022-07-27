package tests;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	
	AndroidDriver driver;
	
	@Test
	
	public void Login() throws Throwable {
		
	System.getProperty("user.dir");
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Mpos\\Testing\\config.properties");
	Properties prop =  new Properties();
	prop.load(fis);
	prop.get("mposapp");
	
		
    	File appdir = new File("src");
	
		File app = new File(appdir, (String) prop.get("mposapp"));
		
	DesiredCapabilities caps = new  DesiredCapabilities();
	
	String device = (String) prop.get("device");
	
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);
	
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
	caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver(url,caps);
	
	Reporter.log("Login page opened Succesfull", true);
	
	Thread.sleep(5000);
	
	}
}

