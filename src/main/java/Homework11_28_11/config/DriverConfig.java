package Homework11_28_11.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver create(BROWSERS browser){
        switch (browser){
            case CHROME -> createChrome();
            case FIREFOX -> createFirefox();
        }
        return driver;
    }

    private static void createFirefox() {
        driver = new FirefoxDriver();
    }

    private static void createChrome() {
        driver = new ChromeDriver();
    }
}
