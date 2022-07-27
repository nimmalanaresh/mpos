package Test;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.Reporter;
import PageObjects.LoginPage;


public class InValidLoginTest extends BaseClass{
	

	
	@Test
	public void testone() throws Throwable{
		
	LoginPage L=new LoginPage(driver);
	
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");	
	Properties prop=new Properties();
    prop.load(fis);
	 
    Thread.sleep(3000);
     String username =  (String) prop.get("username1");
          L.Enterusername1(username);
	      Reporter.log("Username entered", true);
	      Thread.sleep(3000);  
	      
	 String password =  (String) prop.get("password1");
	      L.Enterpassword1(password);
	      Reporter.log("password entered", true);
	      Thread.sleep(5000);   
	    
	      L.ClickOnLoginbutton();
	      Reporter.log("Login button clicked", true);
	      Thread.sleep(8000);  
	      
//	  String toastmessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//      System.out.println(toastmessage);
//	  Assert.assertEquals("Account doesn't exists", toastmessage);
//	  TakesScreenshot ts = (TakesScreenshot)driver;
//	      File src= ts.getScreenshotAs(OutputType.FILE);
//	      File dest= new File("D:\\Notes\\NSPOS\\screenshot.png");
//	      Files.copy(src, dest);
	      
	      Thread.sleep(5000);
	      L.ClearUsername();
	      Thread.sleep(5000);
	      L.ClearUsername();
	      Thread.sleep(5000);
	      Reporter.log("cleared the invalid entered details", true);
	      
	}
	      
	  
	
	}

