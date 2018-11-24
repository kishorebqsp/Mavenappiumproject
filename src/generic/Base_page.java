package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	
	public void button(WebElement element,WebDriver driver)
	{
		try {
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e)
		{
			
		}
	}

	
	public void textbox(WebElement element,WebDriver driver)
	
	{
		try {
			WebDriverWait w=new WebDriverWait(driver,10);
			w.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e)
			{
				
			}
		
	}
	
}
