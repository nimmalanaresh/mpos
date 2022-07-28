package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.BillingScreenPage;
import PageObjects.ItemsAddingtoCartPage;
import PageObjects.MenuSelectionPage;
import PageObjects.PaymentPage;
import PageObjects.QuickItemsPage;
import io.appium.java_client.AppiumBy;

public class PriceTypeChangeTest extends ValidLoginTest{
 
	@Test(priority=10)
	public void RetailType() throws Throwable {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AppiumTest\\NSPOS\\Global.properties");	
		  Properties prop=new Properties();
		  prop.load(fis);	
		  Thread.sleep(3000);
		  
	//Menu Selection 
		  MenuSelectionPage MSP = new MenuSelectionPage();
		  MSP.Billing();
		  String bill	= MSP.Billing.getText();
		  Thread.sleep(2000);
		  Assert.assertEquals(bill,"Billing");
		  Reporter.log(bill, true);
		
		
			
	//Customer adding
	
			AddNewCustomerPage ANC = new AddNewCustomerPage();

			ANC.AddNewCustomer();
			String CName =  (String) prop.get("CustName");
			ANC.CustName(CName);
			String CMobile =  (String) prop.get("CustMobile");
			ANC.CustMobile(CMobile);
			//ANC.Address();
			//Thread.sleep(3000);
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enable Customer for Loyalty Points\").instance(1))"));
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(id(com.ns.mpos.nukkadshops:id/customTextView20));"));
			Thread.sleep(3000);
			ANC.Loyalty();
			ANC.Save();
			
	//Item Adding from QuickItems
		
			QuickItemsPage Q = new QuickItemsPage();
			Q.QuickItems();

			
		
	//Items Adding from SearchBar 
					
			ItemsAddingtoCartPage IAC = new ItemsAddingtoCartPage();
		    String Item =  (String) prop.get("ItemName");
		    IAC.ItemsSearchBar(Item);
		
		  
 //Billing Type changed

		    	
		    
	     	BillingScreenPage BSP = new BillingScreenPage();
	     	BSP.Retailprice();

		    
		
//Payment method start
		
		    	
	    	 PaymentPage add = new PaymentPage(); 
	    	 add.Payment();


   }
}