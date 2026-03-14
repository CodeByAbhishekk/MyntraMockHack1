package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class HomePage {

	 WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By searchBox = By.cssSelector("input.desktop-searchBar");

	    public void searchProduct(String product) {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));

	        driver.findElement(searchBox).sendKeys(product);
	        driver.findElement(searchBox).sendKeys(Keys.ENTER);
	    }
	
}
