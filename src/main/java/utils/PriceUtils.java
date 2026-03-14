package utils;

public class PriceUtils {
	
	 public static double extractPrice(String priceText) {

	        priceText = priceText.replaceAll("[^0-9]", "");
	        return Double.parseDouble(priceText);
	    }

}
