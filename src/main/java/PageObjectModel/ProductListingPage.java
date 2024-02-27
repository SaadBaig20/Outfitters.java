package PageObjectModel;

import Configs.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductListingPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void ClickOnProduct(String productName) {
        String productXPath = ConfigReader.getProductConfigValue(productName);
        WebElement productElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productXPath)));
        productElement.click();
    }
}
