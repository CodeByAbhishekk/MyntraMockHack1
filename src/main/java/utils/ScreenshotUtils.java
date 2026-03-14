package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

import constants.FrameworkConstants;


public class ScreenshotUtils {

	public static void captureScreenshot(WebDriver driver, String testName) {
		 File src = ((TakesScreenshot) driver)
	                .getScreenshotAs(OutputType.FILE);

	        File dest = new File(
	                FrameworkConstants.SCREENSHOT_PATH + testName + ".png"
	        );

	        try {

	            FileUtils.copyFile(src, dest);

	        } catch (IOException e) {

	            e.printStackTrace();
	        }
		
	}

}
