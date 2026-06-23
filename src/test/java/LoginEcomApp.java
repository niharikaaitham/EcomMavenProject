import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcomApp {
    static void main(String[] args) throws InterruptedException {
        String expectedTotalProducts = "50";
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

    }
}
