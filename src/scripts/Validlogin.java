package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.Homepage;
import POM.Loginpage;
import POM.Logintodetails;
import POM.Signuppage;
import POM.Wishlistpage;
import generic.Base_test;
import generic.Constant;
import generic.Excelsheet;
import generic.Property;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Validlogin extends Base_test {

	@Test
	public void login() throws InterruptedException
	{
		Loginpage l=new Loginpage(driver);
		Thread.sleep(9000);
		l.manubutton();
		Thread.sleep(3000);
		l.loginbtn();
		
		Signuppage s=new Signuppage(driver);
	
		s.signupbtn();
		
		Logintodetails dl=new Logintodetails(driver);
		
		String email = Property.getproperty(propertypath,"username");
	
		dl.emailtxtbox(email);
		
		//String pass = Property.getproperty(propertypath,"password");
		String pass = Excelsheet.getexceldata(excelpath,"Sheet1",1,1);
		
		dl.passwordtxtbox(pass);
		
		dl.loginbutton();
		
		
		Homepage h=new Homepage(driver);
	
		h.wishlistbtn();

	   Wishlistpage w=new Wishlistpage(driver);
	   
	   w.shopnowbtn();
	}
}
