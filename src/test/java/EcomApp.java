import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class EcomApp {
    public static void main(String[] args) throws InterruptedException {
        String expectedTotalProducts = "50";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(By.cssSelector("#tab-admin")).click();
        WebElement usernameField = driver.findElement(By.cssSelector("#admin-username"));
        usernameField.sendKeys("9923478751");
        WebElement passwordField = driver.findElement(By.cssSelector("#admin-password"));
        passwordField.sendKeys("Velocity@123");
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", passwordField);
        driver.findElement(By.cssSelector("#btn-admin-signin")).click();
        Thread.sleep(4000);

        WebElement totalProducts = driver.findElement(By.xpath("(//div[@class='stat-value'])[1]"));
        WebElement totalOrders = driver.findElement(By.xpath("(//div[@class='stat-value'])[2]"));
        WebElement lowStockItems = driver.findElement(By.xpath("(//div[@class='stat-value'])[3]"));
        WebElement pendingOrders = driver.findElement(By.xpath("(//div[@class='stat-value'])[4]"));
        WebElement backorders = driver.findElement(By.xpath("(//div[@class='stat-value'])[5]"));

        System.out.println("Total products are " + totalProducts.getText());
        System.out.println("totalOrders are " + totalOrders.getText());
        System.out.println("lowStockItems are " + lowStockItems.getText());
        System.out.println("pendingOrders are " + pendingOrders.getText());
        System.out.println("backorders are " + backorders.getText());

        System.out.println("===========================================");
        if (expectedTotalProducts.equals(totalProducts.getText())) {
            System.out.println("actual and expected total products matched, TC PASSED");
        } else {
            System.out.println("actual and expected total products not matched, TC FAILED");
        }

        System.out.println("===========================================");


        //clicking on orders
        WebElement ordersButton = driver.findElement(By.xpath("//a[text()='Orders']"));
        ordersButton.click();
        List<WebElement> tableHeader = driver.findElements(By.xpath("//table/thead/tr/th"));
        for (WebElement th : tableHeader) {
            System.out.print(th.getText() + " ");
        }
        System.out.println();
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        //System.out.println("total rows are "+rows.size());

        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.print(column.getText() + " ");
            }
            System.out.println();
        }


    }
}
