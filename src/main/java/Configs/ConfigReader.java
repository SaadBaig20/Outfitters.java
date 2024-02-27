package Configs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final String WEBDRIVER_CONFIG_FILE_PATH = "src/test/resources/config/Config.properties";
    private static final String SHIPPING_CONFIG_FILE_PATH = "src/test/resources/config/ShippingInfo.properties";
    private static final String PRODUCT_FILE_PATH = "src/test/resources/config/Product.properties";
    private static final String VALIDATION_FILE_PATH = "src/test/resources/config/ValidationXpath.properties";
    private static final String VALIDATION_TEXT_FILE_PATH = "src/test/resources/config/ValidationText.properties";
    private static final Properties webdriverProperties;
    private static final Properties shippingProperties;
    private static final Properties productProperties;
    private static final Properties validationProperties;
    private static final Properties validationTextProperties;

    static {
        webdriverProperties = loadProperties(WEBDRIVER_CONFIG_FILE_PATH);
        shippingProperties = loadProperties(SHIPPING_CONFIG_FILE_PATH);
        productProperties = loadProperties(PRODUCT_FILE_PATH);
        validationProperties = loadProperties(VALIDATION_FILE_PATH);
        validationTextProperties = loadProperties(VALIDATION_TEXT_FILE_PATH);
    }

    private static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getWebdriverConfigValue(String key) {
        return webdriverProperties.getProperty(key);
    }

    public static String getProductConfigValue(String keys) {
        return productProperties.getProperty(keys);
    }

    public static String getValidationConfigValue(String keys) {
        return validationProperties.getProperty(keys);
    }

    public static String getValidationTextConfigValue(String keys) {
        return validationTextProperties.getProperty(keys);
    }

    public static String getWebsiteUrl() {
        return webdriverProperties.getProperty("website.Url");
    }

    public static String getChromeDriverPath() {
        return webdriverProperties.getProperty("chromeDriverPath");
    }

    public static String getFirstName() {
        return shippingProperties.getProperty("firstName");
    }

    public static String getLastName() {
        return shippingProperties.getProperty("lastName");
    }

    public static String getShippingEmail() {
        return shippingProperties.getProperty("shippingEmail");
    }

    public static String getShippingAddress() {
        return shippingProperties.getProperty("shippingAddress");
    }

    public static String getShippingCity() {
        return shippingProperties.getProperty("shippingCity");
    }

    public static String getShippingZipcode() {
        return shippingProperties.getProperty("shippingZipcode");
    }

    public static String getCheckShirt() {
        return productProperties.getProperty("CheckShirt");
    }

    public static String getSizeXL() {
        return productProperties.getProperty("sizeXL");
    }

    public static String getPoloShirt() {
        return productProperties.getProperty("PoloShirt");
    }

    public static String getSizeM() {
        return productProperties.getProperty("sizeM");
    }

    public static String getSlimFitJeans() {
        return productProperties.getProperty("SlimFitJeans");
    }

    public static String getsize30() {
        return productProperties.getProperty("size30");
    }

    public static String getSkinnyComfortJeans() {
        return productProperties.getProperty("SkinnyComfortJeans");
    }

    public static String getS30() {
        return productProperties.getProperty("S30");
    }

    public static String getBasicJoggers() {
        return productProperties.getProperty("BasicJoggers");
    }

    public static String getSizeL() {
        return productProperties.getProperty("sizeL");
    }

    public static String getLinenBermudaShorts() {
        return productProperties.getProperty("BasicJerseyShorts");
    }

    public static String getSize30() {
        return productProperties.getProperty("SizeS");
    }

    public static String getLowTopSnicker() {
        return productProperties.getProperty("LowTopSnickers");
    }

    public static String getSize40() {
        return productProperties.getProperty("Size40");
    }

    public static String getGoodVibes() {
        return productProperties.getProperty("goodvibes");
    }

    public static String getSizeFree() {
        return productProperties.getProperty("SizeFree");
    }

    public static String getDarkKnight() {
        return productProperties.getProperty("DarkKnight");
    }

    public static String getSizefree() {
        return productProperties.getProperty("Sizefree");
    }

    public static String getCheckShirtName() {
        return validationTextProperties.getProperty("CheckShirtName");
    }
    public static String getCheckShirtPrice() {
        return validationTextProperties.getProperty("CheckShirtPrice");
    }
    public static String getCheckShirtColor() {
        return validationTextProperties.getProperty("CheckShirtColor");
    }
    public static String getCheckShirtSize() {
        return validationTextProperties.getProperty("CheckShirtSize");
    }
    public static String getCheckShirtSeason() {
        return validationTextProperties.getProperty("CheckShirtSeason");
    }
    public static String getPoloShirtName() {
        return validationTextProperties.getProperty("PiqueSportsPoloShirtName");
    }
    public static String getPoloShirtPrice() {
        return validationTextProperties.getProperty("PiqueSportsPoloShirtPrice");
    }
    public static String getPoloShirtColor() {
        return validationTextProperties.getProperty("PiqueSportsPoloShirtColor");
    }
    public static String getPoloShirtSize() {
        return validationProperties.getProperty("PiqueSportsPoloShirtSize");
    }
    public static String getPoloShirtSeason() {
        return validationProperties.getProperty("PiqueSportsPoloShirtSeason");
    }
    public static String getSlimFitJeansName() {
        return validationProperties.getProperty("SlimFitJeansName");
    }
    public static String getSlimFitJeansPrice() {
        return validationProperties.getProperty("SlimFitJeansPrice");
    }
    public static String getSlimFitJeansColor() {
        return validationProperties.getProperty("SlimFitJeansColor");
    }
    public static String getSlimFitJeansSize() {
        return validationProperties.getProperty("SlimFitJeansSize");
    }
    public static String getSlimFitJeansSeason() {
        return validationProperties.getProperty("SlimFitJeansSeason");
    }
    public static String getSkinnyComfortJeansName() {return validationProperties.getProperty("SkinnyComfortJeansName");}
    public static String getSkinnyComfortJeansPrice() {return validationProperties.getProperty("SkinnyComfortJeansPrice");}
    public static String getSkinnyComfortJeansColor() {return validationProperties.getProperty("SkinnyComfortJeansColor");}
    public static String getSkinnyComfortJeansSize() {return validationProperties.getProperty("SkinnyComfortJeansSize");}
    public static String getSkinnyComfortJeansSeason() {return validationProperties.getProperty("SkinnyComfortJeansSeason");}
    public static String getBasicJoggerTrouserName() {return validationProperties.getProperty("BasicJoggersName");}
    public static String getBasicJoggerTrouserColor() {return validationProperties.getProperty("BasicJoggersColor");}
    public static String getBasicJoggerTrouserPrice() {return validationProperties.getProperty("BasicJoggersPrice");}
    public static String getBasicJoggerTrouserSize() {return validationProperties.getProperty("BasicJoggersSize");}
    public static String getBasicJoggerTrouserSeason() {return validationProperties.getProperty("BasicJoggersSeason");}
    public static String getLinenBermudaShortsName() {return validationProperties.getProperty("BasicJerseyShortsName");}
    public static String getLinenBermudaShortsPrice() {return validationProperties.getProperty("BasicJerseyShortsPrice");}
    public static String getLinenBermudaShortsColor() {return validationProperties.getProperty("BasicJerseyShortsColor");}
    public static String getLinenBermudaShortsSize() {return validationProperties.getProperty("BasicJerseyShortsSize");}
    public static String getLinenBermudaShortsSeason() {return validationProperties.getProperty("BasicJerseyShortsSeason");}
    public static String getLowTopSnickerName() {
        return validationTextProperties.getProperty("lowtopsneakersName");
    }
    public static String getLowTopSnickerPrice() {
        return validationTextProperties.getProperty("lowtopsneakersPrice");
    }
    public static String getLowTopSnickerColor() {
        return validationTextProperties.getProperty("lowtopsneakersColor");
    }
    public static String getLowTopSnickerSize() {
        return validationTextProperties.getProperty("lowtopsneakersSize");
    }
    public static String getLowTopSnickerSeason() {
        return validationTextProperties.getProperty("lowtopsneakersSeason");
    }
    public static String getGoodVibesName() {
        return validationTextProperties.getProperty("goodvibesName");
    }
    public static String getGoodVibesPrice() {
        return validationTextProperties.getProperty("goodvibesPrice");
    }
    public static String getGoodVibesColor() {
        return validationTextProperties.getProperty("goodvibesColor");
    }
    public static String getGoodVibesSize() {
        return validationTextProperties.getProperty("goodvibesSize");
    }
    public static String getGoodVibesSeason() {
        return validationTextProperties.getProperty("goodvibesSeason");
    }
    public static String getDarkKnightName() {
        return validationTextProperties.getProperty("DarkKnightName");
    }
    public static String getDarkKnightPrice() {return validationTextProperties.getProperty("DarkKnightPrice");}
    public static String getDarkKnightColor() {
        return validationTextProperties.getProperty("DarkKnightColor");
    }
    public static String getDarkKnightSize() {
        return validationTextProperties.getProperty("DarkKnightSize");
    }
    public static String getDarkKnightSeason() {
        return validationTextProperties.getProperty("DarkKnightSeason");
    }
}

