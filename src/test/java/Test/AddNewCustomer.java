package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import PageObjects.AddNewCustomerPage;
import PageObjects.MenuSelectionPage;

public class AddNewCustomer extends ValidLoginTest{
	
	@Test(priority=4)
	public void AddnewCust() throws Throwable{
		
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
				ANC.Save();
	}	
		
}


