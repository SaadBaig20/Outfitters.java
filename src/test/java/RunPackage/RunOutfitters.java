package RunPackage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Outfitters.feature",
        glue = "StepsOfPurchase",
        tags = "@TestCase10",
        plugin = {"pretty", "html:target/cucumber-reports.html"})

public class RunOutfitters {

}
