import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
    @Test
    public void launchApplication(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        Reporter.log("launchApplication running",true);

    }

    @Test
    public void launchApplication1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://x.com/");
        Reporter.log("launchApplication1 running",true);
    }
    @Test
    public void launchApplication3(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/?hl=en");
        Reporter.log("launchApplication3 running",true);

    }
}
