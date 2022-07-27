package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Loginpage;

public class Invaliddata extends Baseclass{
	@Test
	public void Invalid() throws Throwable {
		
		Loginpage l = new Loginpage(driver);
		l.usertxt.sendKeys("1239871239");
		l.pwdtxt.sendKeys("qwert");
		l.logbtn.click();
		Thread.sleep(3000);
		String ele = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(ele);
		Assert.assertTrue(false, ele);
		
	}

}
