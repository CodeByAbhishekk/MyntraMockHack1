package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	

	    WebDriver driver;

	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By quantityDropdown = By.name("quantity");
	    By totalPrice = By.className("price");

	    public void updateQuantity(int qty) {

	        Select select = new Select(driver.findElement(quantityDropdown));
	        select.selectByValue(String.valueOf(qty));
	    }

	    public String getTotalPrice() {

	        return driver.findElement(totalPrice).getText();
	    }

}
