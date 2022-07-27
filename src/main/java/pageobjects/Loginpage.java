package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Loginpage {
	
	
	public Loginpage(AppiumDriver driver) {
		
		PageFactory.initElements(driver, this);
					
	}
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/login_mobile_edt")
	public WebElement usertxt;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/login_pwd_edt")
	public WebElement pwdtxt;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/login_btn")
	public WebElement logbtn;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement allow;
	
    @FindBy(xpath = "//*[@text='Home']")
	public  WebElement Home;
    
    public void Login() throws Throwable {
    	
    	usertxt.sendKeys("1239871239");
    	Thread.sleep(3000);
    	pwdtxt.sendKeys("123456");
    	Thread.sleep(3000);
    	logbtn.click();
    	Thread.sleep(10000);
    	allow.click();
    	Thread.sleep(3000);
    }
	
}
