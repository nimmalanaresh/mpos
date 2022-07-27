package tests;

import org.testng.annotations.Test;

import pageobjects.Generatebillpage;

public class Generatebill extends Login  {
	
	 @Test
	 public void Generatebilling() throws Throwable {
		 Generatebillpage g = new Generatebillpage(driver);
		 g.Generatebill();		 
		 
	 }

}
