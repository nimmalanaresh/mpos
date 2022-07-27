package tests;

import org.testng.annotations.Test;

import pageobjects.Billing2page;
import pageobjects.Dayshiftendpage;


public class DayEnd extends Login{
	@Test(priority = 2)
	public void Dayend() throws Throwable {
		
		
	Billing2page bb = new Billing2page(driver);
	
	bb.Menu();
		
	}
	
	@Test(priority = 3)
		public void shiftend() throws Throwable {
			
		Dayshiftendpage ds = new  Dayshiftendpage(driver);
		ds.Dayend();
		
	}
}
