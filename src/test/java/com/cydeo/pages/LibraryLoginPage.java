package com.cydeo.pages;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUserName;
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;
    @FindBy(xpath = "//div[@class='has-error']")
    public WebElement errorMessage;
}
