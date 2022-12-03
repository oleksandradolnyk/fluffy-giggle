package Homework11_28_11.tests;

import Homework11_28_11.config.BaseClass;
import Homework11_28_11.data.User;
import Homework11_28_11.pageobjects.MainPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FormTest extends BaseClass {

    static MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    @Test
    public void formTestDefaultUser(){

        mainPage.formFilling(new User());

    }

}
