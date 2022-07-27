package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Dayshiftendpage {

	public Dayshiftendpage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/menu_day_end")
	public WebElement shiftendimage;
	
//	@FindBy(id = "com.ns.mpos.nukkadshops:id/ok_btn")
	public WebElement ok;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/btn_shift_end")
	public WebElement shiftendbtn;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/one")
	public WebElement shiftendok;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/btn_day_end")
	public WebElement dayend;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/one")
	public WebElement dayendok;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/proceed_btn")
	public WebElement proceddbtn;
	
	public void Dayend() throws Throwable {
		
		shiftendimage.click();
		Thread.sleep(3000);
		ok.click();
		Thread.sleep(3000);
		shiftendbtn.click();
		Thread.sleep(3000);
		shiftendok.click();
		Thread.sleep(3000);
		dayend.click();
		Thread.sleep(3000);
		dayendok.click();
		Thread.sleep(3000);
		proceddbtn.click();
		Thread.sleep(3000);
		
	}
}
