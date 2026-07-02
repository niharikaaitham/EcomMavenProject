package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.*;

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
        Reporter.log("=================================",true);
    }

    @AfterMethod
    public void postCondition() {
        Reporter.log("logout", true);
        Reporter.log("clear history", true);
        Reporter.log("close browser", true);
        Reporter.log("=================================",true);
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
    @BeforeClass
    public void beforeClass(){
        Reporter.log("select browser. Eg:Chrome, Edge",true);
        Reporter.log("user specifications",true);
        Reporter.log("=================================",true);
    }
    @AfterClass
    public void afterClass(){
        Reporter.log("=================================",true);
        Reporter.log("destroy object",true);
        Reporter.log("generate test report",true);
    }
}
