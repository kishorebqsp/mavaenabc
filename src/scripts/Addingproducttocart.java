package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cakepage;
import POM.Cartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.ProductDeatils;
import generic.Base_test;
import generic.Excel;
import generic.constant;

public class Addingproducttocart extends Base_test{

	@Test
	public void testcase1() throws InterruptedException
	{
		
		
		String emailtb = Excel.getdata(excelpath,"Sheet1",1,1);
		String pass = Excel.getdata(excelpath,"Sheet1",1,2);
		String cake = Excel.getdata(excelpath,"Sheet1",1,3);
		
		
		Loginpage l=new Loginpage(driver);
		l.hellosignin();
		l.emailaddresstb(emailtb);
		l.passwordtb(pass);
		l.loginbtn();
		Homepage h=new Homepage(driver);
		h.searchtxtbox(cake);
		h.serachbutton();
		Thread.sleep(3000);
		Cakepage c=new Cakepage(driver);
		c.cakepreparationvessel();
		Thread.sleep(3000);
		ProductDeatils p=new ProductDeatils(driver);
		p.seemoreoptionbtn();
		p.mouse(driver);
		p.logout();
		Cartpage pt=new Cartpage(driver);
		pt.cartbtn();
		

	}

}
