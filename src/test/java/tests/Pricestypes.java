package tests;

import pageobjects.Additempage;
import pageobjects.Billing2page;
import pageobjects.Generatebillpage;
import pageobjects.PriceTypespage;

public class Pricestypes extends Login{
	
	public void Billflow() throws Throwable {
		
	Billing2page bb = new Billing2page(driver);
		
		bb.menu.click();
		Thread.sleep(3000);
		bb.billing.click();
		Thread.sleep(3000);
		bb.Newbill.click();
		Thread.sleep(3000);
		
		 Additempage add = new Additempage(driver);
		 add.scbtn.sendKeys("aaa");
		 Thread.sleep(5000);
		 add.itemsel.click();
		
	}
	
	public void Retailtype() {
		
		PriceTypespage pt = new PriceTypespage(driver);
		pt.btn.click();
		pt.retailprice.click();
	}
	
	public void Wholesale() {
		PriceTypespage pt = new PriceTypespage(driver);
		pt.btn.click();
		pt.wsprice.click();
		
	}
	
	public void Special() {
		PriceTypespage pt = new PriceTypespage(driver);
		pt.btn.click();
		pt.spprice.click();
	}
		
	public void Generatebill() throws Throwable {
		
		 Generatebillpage g = new Generatebillpage(driver);
		 g.paybtn.click();
		 Thread.sleep(5000);
		 g.proceed.click();
		 Thread.sleep(5000);
		 g.paymode.click();
		 Thread.sleep(5000);
		 g.cash.click();
		 Thread.sleep(5000);
		 g.savebtn.click();
		 Thread.sleep(5000);
		 g.wop.click();
		 
	}
}
