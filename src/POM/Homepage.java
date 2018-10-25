package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class Homepage extends Base_page {
	@FindBy(id="twotabsearchtextbox")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement serachbtn;
	
public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
 public void searchtxtbox(String cake)
 {
	 serachtb.sendKeys(cake);
 }

 public void serachbutton()
 {
	 serachbtn.click();
 }
}
