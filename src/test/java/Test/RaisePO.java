package Test;

import org.testng.annotations.Test;

import PageObjects.MenuSelectionPage;
import PageObjects.RaisePOpage;

public class RaisePO extends ValidLoginTest{
	@Test(priority=13)
	public void mgmt() throws Throwable {
		
		MenuSelectionPage ms = new MenuSelectionPage();
		ms.SliderMenu.click();
	//	Thread.sleep(5000);
		ms.ClickonManageInventoryTab();
	//	Thread.sleep(5000);
		ms.PO.click();
	//	Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "mgmt")
	public void Raisepo() {
		RaisePOpage po = new RaisePOpage(driver);
		po.Po();
		
	}

}
