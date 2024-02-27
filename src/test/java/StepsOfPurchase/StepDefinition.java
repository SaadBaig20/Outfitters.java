package StepsOfPurchase;

import Configs.ConfigReader;
import Utility.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinition {

    private WebDriver driver;
    private ExtentReports extent = ExtentManager.getInstance();
    private ExtentTest test;

    private WebElement findElementByXPath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    @Given("I open the outfitters website")
    public void i_open_the_outfitters_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ConfigReader.getWebdriverConfigValue("url"));
        driver.manage().window().maximize();
        test = ExtentManager.createTest("User Purchases a Biker Leather Jacket");
    }

    @Given("I should see search icon to navigate to search section")
    public void i_navigate_to_search_section() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='search-text']")));
        button.click();
        test.log(Status.PASS,"Navigated to search section");
    }

    @When("I enter search term to see blazers option")
    public void i_enter_search_term() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='search__input field__input']")));
        button.click();
        test.log(Status.PASS,"I enter search term");
    }

    @Then("I should see blazers option to click on blazers")
    public void i_click_on_blazers() {

        String productDetailsXPath = "//a[@href='/search?q=blazzer&options%5Bprefix%5D=last']";
        WebElement productDetails = findElementByXPath(productDetailsXPath);
        productDetails.click();
        test.log(Status.PASS,"Clicked on blazers");
    }

    @When("I should see products page to click on Faux Blazer")
    public void i_click_on_Faux_Blazer() {

        WebElement xlButton = driver.findElement(By.xpath("//a[@id='CardLink-template--16592948527295__main-7363061055679']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", xlButton);
        test.log(Status.PASS,"Click on Faux Blazer");
    }

    @When("I click Faux blazer i should see size chart with xl to select")
    public void i_click_on_size_xl() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='template--16592948494527__main-2-3']")));
        element.click();
        test.log(Status.PASS,"Click on size xl");
    }

    @Then("I should be able to click add to cart button")
    public void i_click_add_to_cart_button() {

        String cartPageXPath = "//button[@class='desktop product-form__submit button button--full-width button--primary']";
        findElementByXPath(cartPageXPath).click();
        test.log(Status.PASS,"Click add to cart");
    }

    @When("I should see drown down to click on view cart button")
    public void i_click_on_view_cart_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button btn-view-cart']")));
        element.click();
        test.log(Status.PASS,"Clicked the view cart button");
    }

    @When("I click on view cart i should see checkout page to click checkout button")
    public void i_click_on_checkout_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='checkout']")));
        button.click();
        test.log(Status.PASS,"Clicked the checkout button");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        extent.flush();
    }

}


