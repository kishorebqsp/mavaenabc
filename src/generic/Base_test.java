package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements constant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		 driver=new ChromeDriver();
		String u = Property.getdatas(propertyfilepath,"URL");
		driver.get(u);
	}
@AfterMethod
public void closeapp(ITestResult r)
{
	String name = r.getName();
	int status = r.getStatus();
	if(status==2)
	{
		Getphoto.getphotos(driver, photopath,name);
	}
	driver.close();
}
	
}
