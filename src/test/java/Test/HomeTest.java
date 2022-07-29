package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import PageObjects.MenuSelectionPage;
import io.appium.java_client.android.AndroidDriver;

public class HomeTest extends ValidLoginTest{
	AndroidDriver driver;
	
	
	@Test(priority=2)
	public void HomeScreen() throws Throwable  {
	      

		//Menu Selection 
			MenuSelectionPage MSP = new MenuSelectionPage();
			MSP.Billing();
			String bill	= MSP.Billing.getText();
			Thread.sleep(2000);
			Assert.assertEquals(bill,"Billing");
			Reporter.log(bill, true);
		
		
	}
 

}
