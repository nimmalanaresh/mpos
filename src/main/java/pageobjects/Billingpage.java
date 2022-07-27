package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Billingpage {
	
	public  Billingpage(AppiumDriver driver) {
		
		PageFactory.initElements(driver,this);
	}		
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/floating_billing")
	public WebElement fltbill;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/mobile_txt")
	public WebElement Addcust1;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/add_customer_iv")
	public WebElement addbtn;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/enter_full_name_edt")
	public WebElement addname;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/mobile_no_edt")
	public WebElement addmn;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/save_proceed_btn")
	public WebElement savebtn;

public void billing() throws Throwable {
	  
   Addcust1.click();
   Thread.sleep(3000);
   addbtn.click();
   Thread.sleep(3000);
   addname.sendKeys("mahesh");
   Thread.sleep(3000);
   addmn.sendKeys("1236549871");
   Thread.sleep(3000);
   savebtn.click();

}
}
