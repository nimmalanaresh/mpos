package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.LoginPage;

public class ValidLoginTest extends BaseClass{
	@Test (priority=1)  
	  public  void LoginTest() throws Throwable {
		  
		  LoginPage L =new LoginPage(driver);
		 
		  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");	
		  Properties prop=new Properties();
		  prop.load(fis);	
		  Thread.sleep(3000); 
		  
		  String username =  (String) prop.get("username2");
	      L.Enterusername2(username);
	      Reporter.log("Username entered", true);
	      Thread.sleep(3000);
	      
	      String password =  (String) prop.get("password2");
	      L.Enterpassword2(password);
	      Reporter.log("password entered", true);
	      Thread.sleep(3000);
	      
	      L.ClickOnLoginbutton();
	      Reporter.log("Login button clicked", true);
	      
	      Reporter.log("Valid login details entered", true);
	  	  Reporter.log("Login page opened successfully", true);
	      
	  	  Thread.sleep(5000);
	      L.ClickOnAllowbutton();
	      Reporter.log("Home Page Displayed Successfully");
	      Thread.sleep(8000);
	       String Ho = L.Home.getText();
	       Assert.assertEquals(Ho,"Home");
	       Reporter.log(Ho, true);
	      }


}
