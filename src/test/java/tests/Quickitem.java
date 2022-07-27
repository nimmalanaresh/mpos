package tests;

import pageobjects.Quickitemspage;

public class Quickitem extends Login{
	
	public void Quick() {
	
	Quickitemspage qt = new  Quickitemspage(driver);
	qt.Qitem.click();
	qt.additem.click();
	
	}

}
