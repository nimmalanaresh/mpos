package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.MenuSelectionPage;
import PageObjects.QuickItemsPage;

public class QuickItems extends ValidLoginTest {
	@Test(priority=7)
	public void Quick() throws Throwable {
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

	}
	

}
