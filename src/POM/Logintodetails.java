package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Logintodetails  extends Base_page {
	@FindBy(id="et_email_address")
	private WebElement emailaddress;
	
	@FindBy(id="et_loginregister_password")
	private WebElement password;
	
	@FindBy(id="btn_loginregister_continue_signin")
	private WebElement loginbtn;
	
	public Logintodetails(AndroidDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void emailtxtbox(String email)
	{
		emailaddress.sendKeys(email);
	}

	public void passwordtxtbox(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
}
