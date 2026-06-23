package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomDashBoardPage {
    //variables--> WebElements
    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalProducts;
    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement totalOrders;
    @FindBy(xpath = "(//div[@class='stat-value'])[3]")
    private WebElement lowStockItems;
    @FindBy(xpath = "(//div[@class='stat-value'])[4]")
    private WebElement pendingOrders;
    @FindBy(xpath = "(//div[@class='stat-value'])[5]")
    private WebElement backorders;

    //constructor
    public EcomDashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //methods

    public String getTotalOrders() {
        System.out.println("getting  totalOrders");
        return totalOrders.getText();
    }

    public String getTotalProducts() {
        System.out.println("getting total products");
        return totalProducts.getText();
    }

}
