package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_page {
	public void button(WebElement element,WebDriver driver)
	{
		try {
		WebDriverWait W=new WebDriverWait(driver,5);
		W.until(ExpectedConditions.elementToBeClickable(element));
		Reporter.log("element is clickable",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not clickable",true);
			Assert.fail();
		
		}
	}	
		public void txtbox(WebElement element,WebDriver driver)
		{
			try {
				WebDriverWait W=new WebDriverWait(driver,5);
				W.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("element is found",true);
				}
				catch(Exception e)
				{
					Reporter.log("element is not found",true);
					Assert.fail();
				
				}
		}
	}


