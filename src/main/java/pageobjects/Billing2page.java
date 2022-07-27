package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Billing2page {
	
	public  Billing2page(AppiumDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@text ='Billing']")
	public WebElement billing;
	
	@FindBy(xpath = "//*[@text ='New Bill']")
	public WebElement Newbill;
	
	
	public void Menu() throws Throwable {
		
		menu.click();
		Thread.sleep(3000);
		billing.click();
		Thread.sleep(3000);
		Newbill.click();
		Thread.sleep(3000);
	}

}
