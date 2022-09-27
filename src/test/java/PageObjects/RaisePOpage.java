package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class RaisePOpage {
	
	public RaisePOpage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);		
		
	}

	@FindBy(id="com.ns.mpos.nukkadshops:id/lay_addG")
	public WebElement AddPO;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/supplier_spinner")
	public WebElement supplier;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/edit_text")
	public WebElement searchbox;
	
	@FindBy(id="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
	public WebElement suppliername;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/selected_delivery_date_edt")
	public WebElement deliverydate;
	
	@FindBy(id="android:id/button1")
	public WebElement dateok;
	
	@FindBy(id="android:id/button1")
	public WebElement next;

	@FindBy(id="com.ns.mpos.nukkadshops:id/fab_search")
	public WebElement search1;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/fab_search")
	public WebElement search2;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/app_compact_auto_complete_textview_category")
	public WebElement category;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
	public WebElement selectcategory;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/go")
	public WebElement go;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.View")
	public WebElement  itemselected;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/save_btn")
	public WebElement savebtn;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/button_complete")
	public WebElement complete;

	public void Po() {
		
		AddPO.click();
		supplier.click();
		searchbox.click();
		suppliername.click();
		deliverydate.click();
		dateok.click();
		next.click();
		search1.click();
		search2.click();
		category.click();
		selectcategory.click();
		go.click();
		itemselected.click();
		savebtn.click();
		complete.click();
	}
	
}
