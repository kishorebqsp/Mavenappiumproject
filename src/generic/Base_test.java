package generic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_test implements Constant {
	public AndroidDriver<MobileElement> driver;
	public AppiumDriverLocalService service;
	@BeforeSuite
	public void serveron()
	{
		 service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
				.withAppiumJS(new File("C:\\\\Users\\\\Admin\\\\AppData\\\\Local\\\\Programs\\\\appium-desktop\\\\resources\\\\app\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"))
				.withIPAddress("0.0.0.0").usingPort(4723));
				System.out.println("server started");
				service.start();
	}
	
	@BeforeMethod
	public void openapp() throws MalformedURLException
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("deviceName","Asus");
		d.setCapability("platformName","android");
		d.setCapability("platformVersion","6.0.1");
		d.setCapability("appPackage", "com.myntra.android");
		d.setCapability("appActivity","com.myntra.android.activities.LoginRegisterActivity");
		//URL u=new URL("http://localhost:4723/wd/hub");
		 driver=new  AndroidDriver<MobileElement>(d);
	}
	
	
	@AfterMethod 
	public void closeappp(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Photo.getphoto(driver,name,photopath);
		}
		driver.closeApp();
	}
	@AfterSuite
	public void turnoff()
	{
		service.stop();
	}
}



