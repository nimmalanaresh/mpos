package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;

public class BillingScreenPage {
	public BillingScreenPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/fragment_cart_spinner_store_base_items")
	public WebElement AllItems;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public WebElement StoreItems;

	@FindBy(id="com.ns.mpos.nukkadshops:id/spinner_price_type")
	public WebElement Pricetpye;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public WebElement RetailPrice;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public WebElement WholesalePrice;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	public WebElement SpecialPrice;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/bill_btn")
	public WebElement PayButton;
	
	@FindBy(id="android:id/button1")
	public WebElement Proceed;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/select_payment_mode")
	public WebElement SelectPaymentMode;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
	public WebElement Cash;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView")
	public WebElement CashOnDelivery;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")
	public WebElement Card;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView")
	public WebElement Credit;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView")
	public WebElement Sodexo;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.ImageView")
	public WebElement Paytm;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.ImageView")
	public WebElement MobiKwik;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.ImageView")
	public WebElement PayU;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.ImageView")
	public WebElement WhatsApp;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]/android.widget.ImageView")
	public WebElement RedeemPoints;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.ImageView")
	public WebElement Others;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[12]/android.widget.ImageView")
	public WebElement Bhim;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[13]/android.widget.ImageView")
	public WebElement Cheque;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[14]/android.widget.ImageView")
	public WebElement Neft;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[15]/android.widget.ImageView")
	public WebElement GooglePay;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[16]/android.widget.ImageView")
	public WebElement Swiggy;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[17]/android.widget.ImageView")
	public WebElement Zomato;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[18]/android.widget.ImageView")
	public WebElement UberEats;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[19]/android.widget.ImageView")
	public WebElement FoodPanda;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[20]/android.widget.ImageView")
	public WebElement PhonePe;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[21]/android.widget.ImageView")
	public WebElement BharatPe;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[22]/android.widget.ImageView")
	public WebElement AmazonPe;
	
	
	public void PriceTab() {
		Pricetpye.click();
	}
	
	public void RetailPriceType() {
		RetailPrice.click();
		
	}
	
	public void WholesalePriceType() {
		WholesalePrice.click();
	}
	
	public void SpecialPriceType() {
		SpecialPrice.click();
	}
	
	public void WholeSalePrice() throws Throwable {
		Reporter.log("Price type tab clicked", true);
    	PriceTab();
	    Thread.sleep(2000);
    	WholesalePriceType();
    	Reporter.log("Price type changed to WholeSale Price", true);
    	Thread.sleep(2000);
	}
	
	public void SpecialPrice() throws Throwable {
		Reporter.log("Price type tab clicked", true);
    	PriceTab();
	    Thread.sleep(2000);
    	SpecialPriceType();
    	Reporter.log("Price type changed to WholeSale Price", true);
    	Thread.sleep(2000);
	}
	
	public void Retailprice() throws Throwable {
		Reporter.log("Price type tab clicked", true);
    	PriceTab();
	    Thread.sleep(2000);
    	RetailPriceType();
    	Reporter.log("Price type changed", true);
    	Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
