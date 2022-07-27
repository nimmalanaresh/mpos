package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Quickitemspage {
	
	public  Quickitemspage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/iv_quick_items")
	public WebElement Qitem;
	
	@FindBy(id="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	public WebElement additem;
	
	

}
