package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	public static String getdatas(String propertyfile,String keyvalue)
	{
		String s="";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(propertyfile));
			 s = p.getProperty(keyvalue);
		}
		catch(Exception e)
		{
			
		}
		return s;
	}

}
