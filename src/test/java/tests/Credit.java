package tests;

import org.testng.Reporter;

import pageobjects.Sidemenupage;

public class Credit extends Login{
	
	public void credit() {
	
	Sidemenupage sm = new Sidemenupage(driver);
	
	sm.CreditTab.click();
	
	driver.hideKeyboard();
	
	Reporter.log("naresh");
	
	}

}
