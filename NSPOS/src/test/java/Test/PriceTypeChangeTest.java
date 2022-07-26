package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.BillingScreenPage;
import PageObjects.ItemsAddingtoCartPage;
import PageObjects.MenuSelectionPage;
import PageObjects.PaymentPage;
import PageObjects.QuickItemsPage;

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

		
			
	//Customer adding
	
			AddNewCustomerPage ANC = new AddNewCustomerPage();

			ANC.AddNewCustomer();
			String CName =  (String) prop.get("CustName");
			ANC.CustName(CName);
			String CMobile =  (String) prop.get("CustMobile");
			ANC.CustMobile(CMobile);
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