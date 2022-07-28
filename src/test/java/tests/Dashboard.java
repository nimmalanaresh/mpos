package tests;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Dashboard extends Login {
   @Test(priority = 2)
	public void Dashscroll() {
		
	//	 WebElement ele = driver.findElement(By.xpath("//*[@text='Average Basket']"));
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoView(text(\"Average Basket\"));"));

		 
	}
	
}
