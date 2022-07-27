package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Allitemspage {
	
	public Allitemspage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="com.ns.mpos.nukkadshops:id/fragment_cart_spinner_store_base_items")
	public WebElement itemsbtn;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public WebElement allitems;

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public WebElement storeitems;

}
