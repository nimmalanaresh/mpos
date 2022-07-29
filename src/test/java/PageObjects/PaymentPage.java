package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;

public class PaymentPage {
	public PaymentPage() 
	{
		
		PageFactory.initElements(BaseClass.driver,this);
	}
 
	@FindBy(id="com.ns.mpos.nukkadshops:id/bill_btn")
	public WebElement paybutton;
	
	@FindBy(id="android:id/button1")
	public WebElement Proceed;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/select_payment_mode")
	public WebElement SelectPaymentmode;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/payment")
	public WebElement Paymentmode;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/save_btn")
	public WebElement Paymentsavebutton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement CompleteWithoutPrint;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
	public WebElement Notes;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")
	public WebElement Save;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public WebElement Done;
	
	public void ClickonPaybutton() {
		paybutton.click();
	}
	
	public void ClickonProceed() {
		Proceed.click();
	}
	
	public void SelectPaymentmode() {
		SelectPaymentmode.click();
	}
	
	public void Paymentmode() {
		Paymentmode.click();
	}
	
	public void Paysavebtn() {
		Paymentsavebutton.click();
	}
	
	public void CompletewithoutPrint() {
		CompleteWithoutPrint.click();
	}
	
	public void AddNotes() {
		Notes.sendKeys("Welcome to nukkadshops");
	}
	
	public void Save() {
		Save.click();
	}
	
	public void Done() {
		Done.click();
		
	}
	
	public void Payment() throws Throwable {
		
		ClickonPaybutton();
	        Reporter.log("Payment method started", true);
	        Thread.sleep(5000);
	    ClickonProceed();
	        Reporter.log("Proceed button Clicked", true);
	        Thread.sleep(5000);
	    SelectPaymentmode();
	        Reporter.log("Payment mode Clicked", true);
	        Thread.sleep(8000);
	    Paymentmode();
	        Reporter.log("Paymentmode selected", true);
	        Thread.sleep(5000);
	    Paysavebtn();
	        Reporter.log("Payment save button clicked", true);
	    CompletewithoutPrint();
	        Reporter.log("Complete without print button clicked", true);
	        Thread.sleep(5000);
	    AddNotes();
	        Reporter.log("Notes tab sucessfully clicked", true);
	        Thread.sleep(5000);
	    Save();
	        Reporter.log("save button clicked", true);
	        Thread.sleep(5000);
	    Done();
	        Reporter.log("Done button Clicked", true);
	}
}

