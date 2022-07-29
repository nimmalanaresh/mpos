package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.BaseClass;

public class Refundpage {
	
	public Refundpage() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(id= "com.ns.mpos.nukkadshops:id/edit_text")
	public WebElement search ;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/transaction_data_layout")
	public WebElement firstbill;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/button")
	public WebElement Refundbtn;
	
	@FindBy(id = "com.ns.mpos.nukkadshops:id/cb_select_all")
	public WebElement selectall;
	
	@FindBy(id = "android:id/text1")
	public WebElement selectreason;
	
	@FindBy(xpath = "//*[@text='Damaged Goods']")
	public WebElement damagegoods;
	
	@FindBy(xpath = "//*[@text='Wrong variant']")
	public WebElement wrongvariant;
	
	@FindBy(xpath = "//*[@text='Overpriced']")
	public WebElement Overpriced;
	
	@FindBy(xpath = "//*[@text='Others']")
	public WebElement Others;
	
	@FindBy(xpath = "//*[@text='Cash']")
	public WebElement cash;
	
	@FindBy(xpath = "//*[@text='Credit']")
	public WebElement credit;
	
	@FindBy(xpath = "//*[@text='COMPLETE']")
	public WebElement complete;
	
	public void refund() throws Throwable {
		
		firstbill.click();
		Thread.sleep(4000);
		Refundbtn.click();
		Thread.sleep(4000);
		selectall.click();
		Thread.sleep(4000);
		selectreason.click();
		Thread.sleep(4000);
		wrongvariant.click();
		Thread.sleep(4000);
		cash.click();
		Thread.sleep(4000);
		complete.click();
	}
	
	
}
