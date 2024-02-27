package Factory;

import org.openqa.selenium.WebDriver;
import Enum.EnumOutfitters;

public class FactoryOutfitters {
    private final WebDriver driver;

    public FactoryOutfitters(WebDriver driver) {
        this.driver = driver;
    }

    public void executeStep(EnumOutfitters step) {
        switch (step) {
            case OPEN_WEBSITE:

                break;

            case NAVIGATE_TO_POPULAR_SECTION:

                break;

            case CLICK_ON_JACKET:

                break;

            case VIEW_PRODUCT_DETAILS:
                break;

            case SELECT_SIZE_XL:

                break;

            case VIEW_CART:

                break;

            case VIEW_CART_PAGE:

                break;

            case CLICK_CHECKOUT:
                break;

            case ENTER_EMAIL:
                break;

            case ENTER_FIRST_NAME:
                break;

            case ENTER_LAST_NAME:
                break;

            case ENTER_ADDRESS:
                break;

            case ENTER_CITY:

                break;

            case ENTER_POSTAL_CODE:

                break;

            default:
                throw new IllegalArgumentException("Unsupported step: " + step);
        }
    }
}



