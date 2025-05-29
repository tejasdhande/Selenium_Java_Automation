package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	public static String getData(String key) throws IOException {
		
		// Create file class object
		File file = new File("C:\\Users\\Kanaka\\Desktop\\TestData.properties");
		
		//  Create File reader class object
		FileReader reader = new FileReader(file);
		
		// Create properties class object
		Properties prop = new Properties();
		
		// Load the properties file
		prop.load(reader);
		
		// call getValue method of properties class
		return (String) prop.get(key);  // type cast cause it was returning object
		
	}

}
