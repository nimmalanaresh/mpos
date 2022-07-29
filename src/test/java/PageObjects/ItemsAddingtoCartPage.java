package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test.BaseClass;

public class ItemsAddingtoCartPage {
	
	public ItemsAddingtoCartPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	
	}

	@FindBy(id="com.ns.mpos.nukkadshops:id/search_item_edt")
	public WebElement Item;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/customTextView28")
	public WebElement selectitem;
	
	public void ItemsSearchBar(String ItemName) {
		Item.sendKeys(ItemName);
	}
	
	public void SelectItem() {
		selectitem.click();
	}
	
	public void ItemsSearchbar(String Item) throws Throwable {
		
		ItemsSearchBar(Item);
	    Reporter.log("Item Searching Started", true);
	    Thread.sleep(5000);
	    SelectItem();
	    Reporter.log("Item added Successfully", true);
	}
	
	
	

}
