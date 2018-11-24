package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Signuppage extends Base_page  {
	@FindBy(xpath="//android.widget.TextView[@text='LOG IN']")
	private WebElement loginbtn;
	
	public Signuppage(AndroidDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void signupbtn()
	{
		loginbtn.click();
	}
}
