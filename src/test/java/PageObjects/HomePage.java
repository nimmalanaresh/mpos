package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	public HomePage(AppiumDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/floating_billing")
	public WebElement QuickBilling;
	
	
	public void QuickbillingIcon() {
		QuickBilling.click();
	}
	

}
