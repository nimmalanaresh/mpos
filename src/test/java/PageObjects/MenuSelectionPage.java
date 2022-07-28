package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;

public class MenuSelectionPage {
	

	public MenuSelectionPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}
	
	@FindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Open\"]")
	public WebElement SliderMenu;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
	public WebElement BillingTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.TextView")
	public WebElement NewBillTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView")
	public WebElement SettlementTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[3]/android.widget.TextView")
	public WebElement CreditTab;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[4]/android.widget.TextView")
	public WebElement Transactions;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[5]/android.widget.TextView")
	public WebElement Refund;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
	public WebElement ManageInventory;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.TextView")
	public WebElement ItemMaster;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView")
	public WebElement Inventory;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[3]/android.widget.TextView")
	public WebElement GRN;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[4]/android.widget.TextView")
	public WebElement PO;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout")
	public WebElement Reports;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.TextView")
	public WebElement InventoryReports;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView")
	public WebElement SalesReports;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.RelativeLayout[3]/android.widget.TextView")
	public WebElement RefundReports;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout")
	public WebElement VendorManagement;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
	public WebElement PrinterSettings;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
	public WebElement Settings;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.ExpandableListView/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
	public WebElement Logout;
	
	@FindBy(xpath="//*[@text='Billing']")
	public WebElement Billing;
	
	public void Openslidermenu() {
		SliderMenu.click();
	}
	
	public void Clickonbillingtab() {
		BillingTab.click();
	}
	
	public void Clickonnewbill() {
		NewBillTab.click();
	}
	
	public void ClickonSettlementTab() {
		SettlementTab.click();
	}
	
	public void ClickonCreditTab() {
		CreditTab.click();
	}
	
	public void ClickonTransactionTab(){
		Transactions.click();
		
	}
	
	public void ClickonRefundTab() {
		Refund.click();
	}
	
	public void ClickonManageInventoryTab() {
		ManageInventory.click();
	}
	
	public void ClickonItemMasterTab() {
		ItemMaster.click();
	}
	
	public void ClickonInventoryTab() {
		Inventory.click();
	}
	
	public void ClickonGrnTab() {
		GRN.click();
	}
	
	public void ClickonPOTab() {
		PO.click();
	}
	
	public void ClickonReportsTab() {
		Reports.click();
	}
	
	public void ClickonInventoryReportsTab() {
		InventoryReports.click();
	}
	
	public void ClickonSalesReportsTab() {
		SalesReports.click();
	}
	
	public void ClickonRefundReports() {
		RefundReports.click();
	}
	
	public void ClickonVendorManagement() {
		VendorManagement.click();
	}
	
	public void ClickonPrinterSettings() {
		PrinterSettings.click();
	}
	
	public void ClickonSettings() {
		Settings.click();
	}
	
	public void ClickonLogout() {
		Logout.click();
	}
	
	public void Billing() throws Throwable {
		Openslidermenu();
		Thread.sleep(2000);
		Clickonbillingtab();
		Thread.sleep(2000);
		Clickonnewbill();
		Thread.sleep(2000);
		Reporter.log("Billing UI Displayed Successful", true);
		
	}
	
	public void RefundFromTranscations() {
		Openslidermenu();
		Clickonbillingtab();
		ClickonTransactionTab();
	}
}
