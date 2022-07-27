package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.BaseClass;

public class AddNewCustomerPage {
	
	
	public AddNewCustomerPage()
	
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}
	
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/fragment_cart_relative_layout_customer_details")
	public WebElement AddCustomerbutton;

	@FindBy(id="com.ns.mpos.nukkadshops:id/add_customer_iv")
	public WebElement Add;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/enter_full_name_edt")
	public WebElement Name;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/mobile_no_edt")
	public WebElement Mobile;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/save_proceed_btn")
	public WebElement Save;
	
	@FindBy(xpath="//*[@text='Add New Customer']")
	public WebElement AddNewCustomer;
	
	
	
	
	public void AddCustomerbtn() {
		AddCustomerbutton.click();
	}
	
	public void AddIcon() {
		Add.click();
	}
	
	public void CustName(String CName) {
		Name.sendKeys(CName);
	}
	
	public void CustMobile(String CMobile) {
		Mobile.sendKeys(CMobile);
	}
	
	public void CustSave() {
		Save.click();
	}
	
	public void AddNewCustomer() throws Throwable {
		AddCustomerbtn();
		Thread.sleep(5000);
		AddIcon();
		Thread.sleep(5000);
	}
	public void Save() throws Throwable {
		CustSave();
		Thread.sleep(10000);	
	}
		
		
	}
	

