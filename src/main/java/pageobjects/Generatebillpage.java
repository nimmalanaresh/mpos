package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Generatebillpage {
	
	public Generatebillpage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/bill_btn")
	public WebElement paybtn;
	
	@FindBy(id="android:id/button1")
	public WebElement proceed;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/select_payment_mode")
	public WebElement paymode;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	public WebElement cash;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/save_btn")
	public WebElement savebtn;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/complete_without_print_btn")
	public WebElement wop;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/close")
	public WebElement close;
	
	public void Generatebill() throws Throwable {
		
		paybtn.click();
		Thread.sleep(3000);
		proceed.click();
		Thread.sleep(3000);
		paymode.click();
		Thread.sleep(3000);
		cash.click();
		Thread.sleep(3000);
		savebtn.click();
		Thread.sleep(3000);
		wop.click();
		Thread.sleep(3000);
		close.click();
		Thread.sleep(3000);
	}

}
