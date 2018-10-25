package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;
import generic.Elements;

public class ProductDeatils extends Base_page {
	@FindBy(xpath="(//span[.='See buying options'])[1]")
	private WebElement option;
	
	@FindBy(xpath="//span[.='Hello, Bharani']")
	private WebElement log;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement out;
	
public ProductDeatils (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
 public void seemoreoptionbtn()
 {
	 
	 option.click();
}

public void mouse(WebDriver driver)
{
	Elements.movetoelement(driver,log);
}

public void logout()
{
	out.click();
}
}
