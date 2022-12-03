package Homework11_28_11.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static final String mainURL = "https://demoqa.com/automation-practice-form";
    public static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        driver = DriverConfig.create(BROWSERS.CHROME);
        driver.get(mainURL);
    }

    @AfterClass
    public static void closeDriver(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
