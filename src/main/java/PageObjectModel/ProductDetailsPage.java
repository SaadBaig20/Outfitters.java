package PageObjectModel;

import Configs.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void selectSize(String size) {
        String sizeXPath = ConfigReader.getProductConfigValue(size);
        WebElement sizeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sizeXPath)));
        sizeElement.click();
    }
}

