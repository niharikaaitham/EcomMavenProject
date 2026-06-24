package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
    @Test      //method
    public void rechargeMobile() {
        Reporter.log("==================================", true);
        Reporter.log("Enter Mobile Number", true);
        Reporter.log("Enter Amount", true);
        Reporter.log("Click on recharge now button", true);
        Reporter.log("Check confirmation message", true);

    }

    @BeforeMethod
    public void preCondition() {
        Reporter.log("Open browser", true);
        Reporter.log("login", true);
        Reporter.log("navigate to rechage module", true);
    }

    @AfterMethod
    public void postCondition() {
        Reporter.log("logout", true);
        Reporter.log("clear history", true);
        Reporter.log("close browser", true);
    }

    @Test
    public void rechargeElectricity() {
        Reporter.log("==================================", true);
        Reporter.log("Enter Mobile Number", true);
        Reporter.log("Enter Amount", true);
        Reporter.log("Click on recharge now button", true);
        Reporter.log("Check confirmation message", true);

    }

    @Test
    public void rechargeDTH() {
        Reporter.log("==================================", true);
        Reporter.log("Enter Mobile Number", true);
        Reporter.log("Enter Amount", true);
        Reporter.log("Click on recharge now button", true);
        Reporter.log("Check confirmation message", true);
    }
}
