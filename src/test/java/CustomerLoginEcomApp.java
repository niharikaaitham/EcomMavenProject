import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class CustomerLoginEcomApp {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.manage().window().maximize();
        driver.findElement(By.id("customer-username")).sendKeys("9923478751");
        WebElement passwordField = driver.findElement(By.id("customer-password"));
        passwordField.sendKeys("Velocity@123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", passwordField);
        driver.findElement(By.id("btn-customer-signin")).click(); //clicked on login button and then wait to load
        Thread.sleep(2000);

        WebElement initialCart = driver.findElement(By.xpath("//span[@class='cart-count']"));
        System.out.println(initialCart.getText());

        driver.findElement(By.xpath("//button[@title='Dismiss']")).click();
        Thread.sleep(1000);

        WebElement addProductToCart = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]"));

        js.executeScript("arguments[0].scrollIntoView(true)", addProductToCart);
        Thread.sleep(500);
        addProductToCart.click();
        addProductToCart.click();

        String finalCart = driver.findElement(By.xpath("//span[@class='cart-count']")).getText();
        System.out.println(finalCart);

//        WebElement addProduct2 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[5]"));
//        Thread.sleep(500);
//        addProduct2.click();

        if (initialCart.equals(finalCart)){
            System.out.println("Cart is empty — items not added");
        }
        else {
            System.out.println("Items added to cart successfully");
        }


    }

}
