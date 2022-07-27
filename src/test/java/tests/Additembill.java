package tests;

import org.testng.annotations.Test;

import pageobjects.Additempage;

public class Additembill extends Login {
	
	 @Test(priority =3)
	 public void Additem() throws Throwable {
		 
		 Additempage add = new Additempage(driver);
		 add.Additem();
			 }
	
}
