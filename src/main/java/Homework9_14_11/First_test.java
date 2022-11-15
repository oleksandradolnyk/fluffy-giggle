package Homework9_14_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class First_test{

    public static void main(String[] args) {

        test();

    }

    public static void test(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}