package POM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Loginpage extends Base_page  {
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement menubtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Log In   .   Sign Up']")
	private WebElement login;
	
	public Loginpage(AndroidDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void manubutton()
	{
		menubtn.click();
	}

	
	public void loginbtn()
	{
		login.click();
	}
}
