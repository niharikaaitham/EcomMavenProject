package ecomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTest {
    @Test
    public void launchFlipkart(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
    }
}
