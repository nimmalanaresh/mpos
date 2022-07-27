package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Additempage {
	
	public Additempage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/search_item_edt")
	public WebElement scbtn;

	@FindBy(id="com.ns.mpos.nukkadshops:id/linearLayout4")
	public WebElement itemsel;
	
	
	public void Additem() {
		
		scbtn.click();
		itemsel.click();
		
	}
}
