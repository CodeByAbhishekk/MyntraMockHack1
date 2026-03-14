package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class SearchResultsPage {
	
	 WebDriver driver;

	    public SearchResultsPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public String getUnitPrice() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        WebElement priceElement =
	                wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));

	        return priceElement.getText();
	    }

	    By firstProduct = By.cssSelector(".product-base");

	    public void selectFirstProduct() {

	        driver.findElements(firstProduct).get(0).click();
	        
	        // Switch to new tab
	        for (String tab : driver.getWindowHandles()) {
	            driver.switchTo().window(tab);
	    }
	}

}
