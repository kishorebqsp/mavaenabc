package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class Cartpage extends Base_page {
	@FindBy(id="add-to-cart-button")
	private WebElement cart;
	
	
	
public Cartpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
 
public void cartbtn()
{
	cart.click();
}


}
