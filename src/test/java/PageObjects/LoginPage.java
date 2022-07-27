package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class LoginPage {
	
	public LoginPage(AppiumDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	//new AppiumFieldDecorator(driver
	

	@FindBy(className="android.widget.EditText")
	public WebElement username;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/login_pwd_edt")
	public WebElement password;
	
	@FindBy(id="com.ns.mpos.nukkadshops:id/login_btn")
	public WebElement Loginbutton;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement AllowButton;
	
	@FindBy(xpath="//*[@text='Home']")
	public WebElement Home;
	
	public void Enterusername1(String username1) {
		username.sendKeys(username1);
	}
	
	public void Enterusername2(String username2) {
		username.sendKeys(username2);
	}
	
	public void Enterpassword1(String password1) {
		password.sendKeys(password1);
	}
	public void Enterpassword2(String password2) {
		password.sendKeys(password2);
	}
	public void ClickOnLoginbutton() {
		Loginbutton.click();
	}
	public void ClickOnAllowbutton() {
		AllowButton.click();
	}
	
	public void ClearUsername() {
		username.clear();
	}
	
	public void ClearPassword() {
		password.clear();
	}
	
	
}
