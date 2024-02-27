package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ExtentManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    private static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            htmlReporter = new ExtentHtmlReporter("target/cucumber-reports.html");
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }

    public static ExtentTest createTest(String PurchaseFromOutfitters) {
        test = extent.createTest(PurchaseFromOutfitters);
        return test;
    }
    public static void captureScreenshot(ExtentTest test, WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            String reportDirectory = new File("target/cucumber-reports.html").getParent();

            String screenshotPath = reportDirectory + File.separator + "screenshot.png";

            File destination = new File(screenshotPath);
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

            test.pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

