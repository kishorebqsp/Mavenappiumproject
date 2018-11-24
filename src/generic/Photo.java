package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class Photo {
	public static void getphoto(WebDriver driver,String path,String testcasename) 
	{
		try {
		Date d=new Date();
		String s = d.toString();
		String date = s.replaceAll(":","-");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(testcasename+path+date+".png");
		FileUtils.copyFile(src,dest);
		}
		catch(Exception e)
		{
			Reporter.log("photo should be taken",true);
		}

	}
}
