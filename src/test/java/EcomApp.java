import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class EcomApp {
    static void main(String[] args) throws InterruptedException {
        String expectedTotalProducts = "50";
        WebDriver driver = new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.id("tab-admin")).click();
        driver.findElement(By.id("admin-username")).sendKeys("9923478751");
        WebElement passwordField = driver.findElement(By.id("admin-password"));
        passwordField.sendKeys("Velocity@123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", passwordField);
        driver.findElement(By.id("btn-admin-signin")).click(); //clicked on login button and then wait to load
        Thread.sleep(2000);

        String dashboardText = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard Overview')]")).getText();
        System.out.println(dashboardText);

        WebElement totalProducts = driver.findElement(By.xpath("//div[@class='admin-stat-card success']"));
        String totalOrders = driver.findElement(By.xpath("(//div[@class='admin-stat-card'])[1]")).getText();
        String lowStockItems = driver.findElement(By.xpath("//div[@class='admin-stat-card warning']")).getText();
        String pendingOrders = driver.findElement(By.xpath("//div[@class='admin-stat-card danger']")).getText();
        String backOrders = driver.findElement(By.xpath("(//div[@class='admin-stat-card'])[2]")).getText();
        System.out.println(totalProducts);
        System.out.println(totalOrders);
        System.out.println(lowStockItems);
        System.out.println(pendingOrders);
        System.out.println(backOrders);
        //clicked on orders page
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
