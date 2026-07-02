package CBTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonEcom {
    String browser = "firefox";
    WebDriver driver;

    @Test
    public void launchAmazon() {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("https://www.amazon.com/");
    }
}
