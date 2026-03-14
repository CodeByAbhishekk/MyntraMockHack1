package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.ScreenshotUtils;
import base.DriverManager;

public class TestListener implements ITestListener{
	
	 @Override
	    public void onTestStart(ITestResult result) {

	        System.out.println("Starting Test: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {

	        System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        System.out.println("Test Failed: " + result.getName());

	        ScreenshotUtils.captureScreenshot(
	                DriverManager.getDriver(),
	                result.getName()
	        );
	    }

}
