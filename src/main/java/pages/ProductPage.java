package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    By price = By.cssSelector(".pdp-price strong");
    By sizeOptions = By.cssSelector(".size-buttons-size-button");
    By colorOptions = By.cssSelector(".color-buttons-color-button");
    By variantOptions = By.cssSelector(".product-variants-item");
    By addToBag = By.xpath("//button[contains(text(),'ADD TO BAG')]");

    public String getUnitPrice() {

        return driver.findElement(price).getText();

    }
    public void selectSize() {

        driver.findElements(sizeOptions).get(0).click();
    }

    public void selectColor() {

        if(driver.findElements(colorOptions).size() > 0) {

            driver.findElements(colorOptions).get(0).click();
        }
    }

    public void selectVariant() {

        if(driver.findElements(variantOptions).size() > 0) {

            driver.findElements(variantOptions).get(0).click();
        }
    }

    public void addToCart() {

        selectSize();
        selectColor();
        selectVariant();

        driver.findElement(addToBag).click();
    }
}