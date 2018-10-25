package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Elements {
	public static  void movetoelement(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void drop(WebDriver driver,WebElement ele,int r)
	{
		Select s=new Select(ele);
		s.selectByIndex(r);
		
	}
	
	
}
