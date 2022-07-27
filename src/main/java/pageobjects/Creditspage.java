package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Creditspage {

	public Creditspage(AppiumDriver driver) {
			
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id ="com.ns.mpos.nukkadshops:id/menu_add_credit")
	public WebElement Addbtn;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/search_customer_edt")
	public WebElement scbtn;
	
	public void jhbjkh() {
		
		Addbtn.click();
		scbtn.sendKeys("652+8+5+");
	}
	
}
