package Homework10_17_11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

class Form_test{

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://demoqa.com/automation-practice-form");
        testForm();

    }

    public static void testForm(){

        String[] subjectChoice = {"Maths", "Chemistry", "Economics"}; // values for "subjects" field


        // LOCATORS

        By firstNameLocator = By.id("firstName");
        By lastNameLocator = By.id("lastName");
        By emailLocator = By.id("userEmail");

        By genderFemaleLocator = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");

        By phoneLocator = By.id("userNumber");
        By subjectsLocator = By.id("subjectsInput");

        By sportLocator = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");
        By readingLocator = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
        By musicLocator = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label");

        By addressLocator = By.id("currentAddress");

        By stateLocator = By.id("react-select-3-input");
        By cityLocator = By.id("react-select-4-input");


        // WEB ELEMENTS INITIALIZATION

        WebElement firstName = driver.findElement(firstNameLocator);
        WebElement lastName = driver.findElement(lastNameLocator);
        WebElement email = driver.findElement(emailLocator);

        WebElement genderFemale = driver.findElement(genderFemaleLocator);

        WebElement phone = driver.findElement(phoneLocator);
        WebElement subjects = driver.findElement(subjectsLocator);

        WebElement sport = driver.findElement(sportLocator);
        WebElement reading = driver.findElement(readingLocator);
        WebElement music = driver.findElement(musicLocator);

        WebElement address = driver.findElement(addressLocator);

        WebElement state = driver.findElement(stateLocator);
        WebElement city = driver.findElement(cityLocator);


        // WEB ELEMENTS FILLING

        firstName.sendKeys("Oleksandra");
        lastName.sendKeys("Dolnyk");
        email.sendKeys("test_email@gmail.com");

        genderFemale.click();

        phone.sendKeys("1234567890");

        for (String i:subjectChoice) { // Maths, Chemistry, Economics
            subjects.sendKeys(i);
            subjects.sendKeys(Keys.ENTER);
        }

        address.sendKeys("вулиця Мечникова, 14/1, Київ, Україна, 02000");

        sport.click();
        music.click();
        reading.click();

        state.sendKeys("Haryana");
        state.sendKeys(Keys.ENTER);

        city.sendKeys("Karnal");
        city.sendKeys(Keys.ENTER);

    }

}