package Test;

import org.testng.annotations.Test;

import PageObjects.AddNewCustomerPage;
import PageObjects.MenuSelectionPage;


public class AddCustomer extends ValidLoginTest{
	@Test(priority=3)
	public void AddCust() throws Throwable {
		
		//Menu Selection 
				MenuSelectionPage MSP = new MenuSelectionPage();
				MSP.Billing();
		
		AddNewCustomerPage A = new AddNewCustomerPage();
		A.AddCustomerbtn();
		Thread.sleep(8000);

	  
 
	}
	
	

}
