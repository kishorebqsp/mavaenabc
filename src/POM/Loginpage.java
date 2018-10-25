package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class Loginpage extends Base_page {
	//decalartion
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement signbtn;
	
	@FindBy(id="ap_email")
	private WebElement email;
	
   @FindBy(id="ap_password")
   private WebElement pwd;
   
   @FindBy(id="signInSubmit")
   private WebElement login;
   
   //initalization
   public Loginpage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   //utilization
   public void hellosignin()
   {
	   signbtn.click(); 
   }
   
   public void emailaddresstb(String emailtb)
   {
	   email.sendKeys(emailtb);
   }
   
   public void passwordtb(String pass)
   {
	   pwd.sendKeys(pass);
	   
   }
   public void loginbtn()
   {
	   login.click();
	   
	   
	   
   }
}
