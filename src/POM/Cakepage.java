package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class Cakepage extends Base_page {
	@FindBy(id="pdagDesktopSparkleHeadline")
	private WebElement cakevessel;
	
public Cakepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
 public void cakepreparationvessel()
 {
	 
	 cakevessel.click();
}
}