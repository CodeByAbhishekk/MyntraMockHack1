package myntraTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;


public class SearchProductTest extends BaseTest {
	
	 @Test
	    public void verifyProductSearch() {
		 HomePage homePage = new HomePage(driver);
		 homePage.searchProduct("Women Sneakers");

		 String pageTitle = driver.getTitle();
		 
		 Assert.assertTrue(pageTitle.contains("Sneakers"),"Search results not displayed");
	 }

}
