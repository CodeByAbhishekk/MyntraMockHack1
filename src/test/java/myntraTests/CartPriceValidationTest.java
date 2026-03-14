package myntraTests;

import base.BaseTest;
import pages.*;
import utils.PriceUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPriceValidationTest extends BaseTest {
	
	@Test
    public void verifyCartPriceCalculation() {

        HomePage home = new HomePage(driver);
        home.searchProduct("Women Sneakers");

        SearchResultsPage results = new SearchResultsPage(driver);
        results.selectFirstProduct();

        ProductPage product = new ProductPage(driver);

        String unitPriceText = product.getUnitPrice();
        double unitPrice = PriceUtils.extractPrice(unitPriceText);

        product.addToCart();

        CartPage cart = new CartPage(driver);

        int quantity = 10;

        cart.updateQuantity(quantity);

        String totalPriceText = cart.getTotalPrice();
        double totalPrice = PriceUtils.extractPrice(totalPriceText);

        double expectedPrice = unitPrice * quantity;

        Assert.assertEquals(totalPrice, expectedPrice, "Price calculation mismatch");
    }

}
