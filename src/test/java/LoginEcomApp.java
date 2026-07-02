import commonlyUsedMethods.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EcomDashBoardPage;
import pages.EcomLoginPage;

import java.io.IOException;
import java.time.Duration;

public class LoginEcomApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        EcomLoginPage ecomLoginPage = new EcomLoginPage(driver);
        ecomLoginPage.clickOnAdminButton();
        ecomLoginPage.enterUserName(Utility.readDataFromExcel(0, 0));
        ecomLoginPage.enterPassword(Utility.readDataFromExcel(0, 1));


        Thread.sleep(5000);
        ecomLoginPage.clickOnAccessDashBoardButton(driver);

        Thread.sleep(2000);
        EcomDashBoardPage ecomDashBoardPage = new EcomDashBoardPage(driver);
        String actualTotalOrders = ecomDashBoardPage.getTotalOrders();
        String actualTotalProducts = ecomDashBoardPage.getTotalProducts();

        String expTotalOrders = "48";
        String expTotalProducts = "50";
        System.out.println("===========================================");
        System.out.println("validating Total orders ");
        if (actualTotalOrders.equals(expTotalOrders)) {
            System.out.println("Total orders validation pass");
        } else {
            System.out.println("Total orders validation failed");
        }

        System.out.println("===========================================");
        System.out.println("validating Total products ");
        if (actualTotalProducts.equals(expTotalProducts)) {
            System.out.println("Total products validation pass");
        } else {
            System.out.println("Total products validation failed");
        }
        Utility.takeScreenshot(driver, "TC123");
    }
}
