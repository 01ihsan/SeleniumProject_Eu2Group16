package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.test.gitHub.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setupMethod() {
        libraryLoginPage=new LibraryLoginPage();
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
    }



    @Test
    public void requiredFieldErrorMessageTest() {
        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void invalidEmailFormatErrorMessageTest() {
        libraryLoginPage.inputUserName.sendKeys("somethingWrong");
        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void libraryNegativeLoginTest() {
        libraryLoginPage.inputUserName.sendKeys("some@thing.wrong");
        libraryLoginPage.inputPassword.sendKeys("password");
        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();
    }
}