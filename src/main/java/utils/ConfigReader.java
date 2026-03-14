package utils;

import java.io.FileInputStream;
import java.util.Properties;

import constants.FrameworkConstants;


public class ConfigReader {
	
	 private static Properties properties;

	    static {

	        try {

	            FileInputStream fis = new FileInputStream(
	                    FrameworkConstants.CONFIG_FILE_PATH
	            );

	            properties = new Properties();

	            properties.load(fis);

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {

	        return properties.getProperty(key);
	    }


}
