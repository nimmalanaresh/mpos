package Test;

import org.testng.annotations.Test;

import PageObjects.MenuSelectionPage;
import PageObjects.Refundpage;

public class Refund extends  ValidLoginTest {
	@Test(priority=12)
	public void Refundmethod() throws Throwable {
		
		//Menu Selection 
		  MenuSelectionPage MSP = new MenuSelectionPage();
		  MSP.RefundFromTranscations();
		  
		  Refundpage r = new Refundpage();
		  r.refund();	
		
	}
	
	

}
