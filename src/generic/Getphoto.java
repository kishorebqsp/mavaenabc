package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Getphoto {
	public static String getphotos(WebDriver driver,String folder,String testcasename)
	{
		String path="";
		try {
		Date d=new Date();
		String datetime = d.toString().replace(":","-");
	path = folder+testcasename+datetime+".png";
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			
		}
	
	
		
		return path;
	}

}
