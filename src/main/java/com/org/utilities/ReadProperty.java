package com.org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	static Properties prop;

	public static void initializepropertyFile() throws IOException {
		File file = new File("C:\\Users\\lginne\\eclipse-workspace\\NewLesingdesk\\TestData\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
public static String readProperty(String key) {
	return prop.getProperty(key);
	
}
}
