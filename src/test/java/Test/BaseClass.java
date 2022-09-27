package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
        public static AndroidDriver driver;
        
	@BeforeClass
	public void setup() throws IOException  {
    	
    	
    	System.getProperty("user.dir");
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");
        Properties prop=new Properties();
        prop.load(fis);
      
    	try {
    DesiredCapabilities caps = new DesiredCapabilities();
    File appDir = new File("src");
    File app = new File(appDir,(String)prop.get("app"));
    String device = (String) prop.get("device");
      caps.setCapability(MobileCapabilityType.DEVICE_NAME,device);
      caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
      caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
 
  	  URL url = new URL("http://127.0.0.1:4723/wd/hub");
      driver = new AndroidDriver(url,caps);
      
  
	}catch(Exception exp) {
		System.out.println("Cause is : "+exp.getCause());
		System.out.println("Message is : "+exp.getMessage());
		exp.printStackTrace();
	}
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	   
	@Test
	   public void sampleTest() throws Exception {
		   
	     	Reporter.log("I am in Mpos Test", true);
	     	Thread.sleep(3000);
	     
	     }
    	
}


