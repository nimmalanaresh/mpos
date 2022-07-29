package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;

public class QuickItemsPage {
	public QuickItemsPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}
	
	@FindBy(id= "com.ns.mpos.nukkadshops:id/iv_quick_items")
	public WebElement QuickItems;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")
	public WebElement Item;
	
	public void QuickItemsIcon() {
		QuickItems.click();
	}
	
	public void ClickonItems() {
		Item.click();
	}
	
	public void QuickItems() throws Throwable {
		Reporter.log("Quick item started Successfully", true);
		QuickItemsIcon();
		Thread.sleep(8000);
		Reporter.log("Quick items icon selected", true);
		ClickonItems();
		Reporter.log("Item added Successfully", true);
		Thread.sleep(8000);
		
		
		
	}
	
	
	
	}


