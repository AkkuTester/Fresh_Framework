package web_Common_Functions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_Reader {

	/*
	 * code for properties reader. 
	 * This code is reusable every time. that is why kept in the common functions
	 */

	public static String getValue(String filePath, String key) throws IOException {
		
		FileReader fr = new FileReader(filePath);
		Properties property = new Properties();
		property.load(fr);
	return	property.getProperty(key);
		
	}
	
}
