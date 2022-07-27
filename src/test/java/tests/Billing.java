package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.Billing2page;
import pageobjects.Billingpage;

@Listeners

public class Billing extends Login {
	@Test(priority =2)
	public void Addcustomer() throws Throwable {
		
		Billing2page bb = new Billing2page(driver);
		bb.Menu();
		
		Billingpage b = new Billingpage(driver);
		b.billing();
		
	}
	
}



