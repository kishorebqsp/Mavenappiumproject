package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Wishlistpage extends Base_page {
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement shopnow;
	
	public Wishlistpage(AndroidDriver<MobileElement> driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void shopnowbtn()
	{
		shopnow.click();
	}

}
