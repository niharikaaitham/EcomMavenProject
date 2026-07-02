package ecomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest {
    @Test
    public void launchAmazon(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ajio.com/");
    }
}
