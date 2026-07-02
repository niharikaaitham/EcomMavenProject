package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
    @Test
    public void azAddToCart() {

        Reporter.log("AddToCart is running", true);
    }

    @Test(groups="AddToWishlist")
    public void azAddToWishlist() {
        Reporter.log("Wishlist is running", true);
    }

    @Test
    public void azSearchProduct() {
        Reporter.log("SearchProduct is running", true);
    }

    @Test
    public void azCheckOutOrder() {
        Reporter.log("CheckOutOrder is running", true);
    }
}
