package testNGAssertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
    @Test
    public void softAssertStudy() {
        String a = null;
        String b = "Test";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a, b, "expected and actual value are not equal");
        softAssert.assertNotNull(a, "a is null, TC fail");
        Reporter.log("Hi",true);
        softAssert.assertAll();
    }

}