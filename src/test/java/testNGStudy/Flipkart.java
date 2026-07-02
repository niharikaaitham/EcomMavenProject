package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
    @Test
    public void fkAddToCart() {

        Reporter.log("AddToCart is running", true);
    }

    @Test(groups="AddToWishlist")
    public void fkAddToWishlist() {
        Reporter.log("Wishlist is running", true);
    }

    @Test
    public void fkSearchProduct() {
        Reporter.log("SearchProduct is running", true);
    }

    @Test
    public void fkCheckOutOrder() {
        Reporter.log("CheckOutOrder is running", true);
    }
}
