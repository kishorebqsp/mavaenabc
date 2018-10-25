package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Base_test;
import generic.Excel;
import generic.constant;

public class Validlogin extends Base_test {

	@Test
	public void tc2()
	{
		
		
		String us=Excel.getdata(excelpath,"Sheet1",1,1);
		String pwd=Excel.getdata(excelpath,"Sheet1",1,2);
		
		driver.findElement(By.xpath("//span[.='Hello. Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys(us);
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
