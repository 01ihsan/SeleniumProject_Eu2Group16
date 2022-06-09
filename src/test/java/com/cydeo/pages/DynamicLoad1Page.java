package com.cydeo.pages;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;
    @FindBy(css = "div#loading")
    public WebElement loadingBar;
    @FindBy(xpath = "//input[@type='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@id='flash-messages']")
    public WebElement errorMessage;
}
