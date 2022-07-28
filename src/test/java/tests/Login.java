package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Loginpage;

public class Login extends Baseclass {
	
  	@Test(priority = 1)
	public void LogInfo() throws Throwable {
  	
  	
  		
		Loginpage l = new Loginpage(driver);
		l.Login();
		
		String bill = l.Home.getText();
		
		Reporter.log(bill,true);
		
		Assert.assertEquals(bill, "Home");	
		
		Thread.sleep(4000);
		
	}
}


