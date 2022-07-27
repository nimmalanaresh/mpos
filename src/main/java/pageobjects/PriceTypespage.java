package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PriceTypespage {
	
	public PriceTypespage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(id ="android:id/text1")
	public WebElement btn;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public WebElement retailprice;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public WebElement wsprice;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	public WebElement spprice;
}
