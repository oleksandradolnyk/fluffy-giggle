package Homework11_28_11.pageobjects;

import Homework11_28_11.data.User;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "userNumber")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    WebElement genderFemale;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    WebElement genderMale;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    WebElement sport;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    WebElement reading;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")
    WebElement music;

    @FindBy(id = "subjectsInput")
    WebElement subjects;

    @FindBy(id = "react-select-3-input")
    WebElement state;

    @FindBy(id = "react-select-4-input")
    WebElement city;

    String[] subjectChoice = {"Maths", "Chemistry", "Economics"};

    public void formFilling(User user){

        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        email.sendKeys(user.getEmail());
        phoneNumber.sendKeys(user.getPhone());

        if (user.getGender().equals("Female")){
            genderFemale.click();
        } else if (user.getGender().equals("Male")) {
            genderMale.click();
        }

        currentAddress.sendKeys(user.getAddress());

        if (user.isMusicLover()){
            music.click();
        }
        if (user.isReadingLover()) {
            reading.click();
        }
        if (user.isSportLover()){
            sport.click();
        }

        for (String sub:subjectChoice){
            subjects.sendKeys(sub);
            subjects.sendKeys(Keys.ENTER);
        }

        if (user.getState().equals("Uttar Pradesh")){
            state.sendKeys("Uttar Pradesh");
            state.sendKeys(Keys.ENTER);
            if (user.getCity().equals("Agra")){
                city.sendKeys("Agra");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Lucknow")){
                city.sendKeys("Lucknow");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Merrut")) {
                city.sendKeys("Merrut");
                city.sendKeys(Keys.ENTER);
            }
        } else if (user.getState().equals("NCR")){
            state.sendKeys("NCR");
            state.sendKeys(Keys.ENTER);
            if (user.getCity().equals("Delhi")){
                city.sendKeys("Delhi");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Gurgaon")){
                city.sendKeys("Gurgaon");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Noida")) {
                city.sendKeys("Noida");
                city.sendKeys(Keys.ENTER);
            }
        } else if (user.getState().equals("Haryana")){
            state.sendKeys("Haryana");
            state.sendKeys(Keys.ENTER);
            if (user.getCity().equals("Karnal")){
                city.sendKeys("Karnal");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Panipat")) {
                city.sendKeys("Panipat");
                city.sendKeys(Keys.ENTER);
            }
        } else if (user.getState().equals("Rajasthan")) {
            state.sendKeys("Haryana");
            state.sendKeys(Keys.ENTER);
            if (user.getCity().equals("Jaiput")){
                city.sendKeys("Jaiput");
                city.sendKeys(Keys.ENTER);
            } else if (user.getCity().equals("Jaiselmer")) {
                city.sendKeys("Jaiselmer");
                city.sendKeys(Keys.ENTER);
            }
        }
    }
}
