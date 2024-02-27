package StepsOfPurchase;

import Configs.ConfigReader;
import PageObjectModel.CartPage;
import PageObjectModel.Dashboard;
import PageObjectModel.ProductDetailsPage;
import PageObjectModel.ProductListingPage;
import Utility.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingSteps {

    private final WebDriver driver;
    private final Dashboard dashboard;
    private final ProductListingPage productListingPage;
    private final ProductDetailsPage productDetailsPage;
    private final CartPage cartPage;
    private final ExtentReports extent= ExtentManager.getInstance();
    private final ExtentTest test;
    public ShoppingSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dashboard = new Dashboard(driver);
        productListingPage = new ProductListingPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        cartPage=new CartPage(driver);
        test = ExtentManager.createTest("User Add to Cart Product");
    }

    @Given("User is on outfitters website")
    public void is_on_outfitters_website() {
        driver.get(ConfigReader.getWebdriverConfigValue("url"));
        driver.manage().window().maximize();
        test.log(Status.PASS, "User is on Outfitters Website");
    }

    @And("User should see search button to click on search button")
    public void click_on_search_button() {
        dashboard.clickSearchButton();
        test.log(Status.PASS, "Clicked on the search button to initiate product search");
    }

    @And("User enter {string} in search term and see product listing page")
    public void EnterSearchTerm( String EnterSearchTerm) {

        dashboard.enterSearchTerm(EnterSearchTerm);
        test.log(Status.PASS, " enters search term: " + EnterSearchTerm);
    }

    @And("User click on {string}")
    public void ClickOnProduct(String product) {
        productListingPage.ClickOnProduct(product);
        test.log(Status.PASS, "Click on product: " + product);
    }

    @Then("User validates Search and LogIn element on the webpage")
    public void validateElementsOnWebpage() {

        WebElement searchTextElement = driver.findElement(By.xpath("//span[@class='search-text']"));
        Assert.assertTrue("Search text field is not displayed", searchTextElement.isDisplayed());

        WebElement loginTextElement = driver.findElement(By.xpath("//a[@href='/account/login']"));
        Assert.assertTrue("Login text is not displayed", loginTextElement.isDisplayed());
        test.log(Status.PASS, "Validation of search and logIn element successful");
    }

    @And("User should see size chart to select {string}")
    public void SelectSize(String size) {
        productDetailsPage.selectSize(size);
        test.log(Status.PASS, "Click on size: " + size);
    }

    @When("User click on add to cart button and see a drop down he should be able to select view cart or continue shopping")
    public void ClickOnAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='desktop product-form__submit button button--full-width button--primary']")));
        button.click();
        test.log(Status.PASS, "Click on add to cart button");
    }

    @Then("User select view cart option and see checkout page")
    public void SelectsViewCartOption() {
        cartPage.ClickViewCartButton();
        test.log(Status.PASS, "Select view cart option");
    }

    @Then("User validates {string} product details")
    public void validateProductDetails(String product) {

        String productName = driver.findElement(By.xpath(ConfigReader.getValidationConfigValue("Name"))).getText();
        String productPrice = driver.findElement(By.xpath(ConfigReader.getValidationConfigValue("Price"))).getText();
        String productColor = driver.findElement(By.xpath(ConfigReader.getValidationConfigValue("Color"))).getText();
        String productSize = driver.findElement(By.xpath(ConfigReader.getValidationConfigValue("Size"))).getText();
        String productSeason = driver.findElement(By.xpath(ConfigReader.getValidationConfigValue("Season"))).getText();

        String expectedName = ConfigReader.getValidationTextConfigValue(product + "Name");
        String expectedPrice = ConfigReader.getValidationTextConfigValue(product + "Price");
        String expectedColor = ConfigReader.getValidationTextConfigValue(product + "Color");
        String expectedSize = ConfigReader.getValidationTextConfigValue(product + "Size");
        String expectedSeason = ConfigReader.getValidationTextConfigValue(product + "Season");

        Assert.assertEquals(expectedName, productName);
        Assert.assertEquals(expectedPrice, productPrice);
        Assert.assertEquals(expectedColor, productColor);
        Assert.assertEquals(expectedSize, productSize);
        Assert.assertEquals(expectedSeason, productSeason);

        test.log(Status.PASS, "Product details Validation Successful");
        ExtentManager.captureScreenshot(test, driver);
    }

    @And("User click on on Checkout button to proceed to info page")
    public void ClickCheckoutButton() {
        cartPage.ClickCheckoutButton();
        test.log(Status.PASS, "Clicked the checkout button");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        extent.flush();
    }
}
