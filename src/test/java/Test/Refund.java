package Test;

import org.testng.annotations.Test;

import PageObjects.MenuSelectionPage;
import PageObjects.Refundpage;

public class Refund extends  ValidLoginTest {
	@Test
	public void Refundmethod() throws Throwable {
		
		//Menu Selection 
		  MenuSelectionPage msp = new MenuSelectionPage();
		  msp.RefundFromTranscations();
		  
		  Refundpage r = new Refundpage();
		  r.refund();	
		
	}
	
	

}
