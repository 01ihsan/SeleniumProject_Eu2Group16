package com.cydeo.pages;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    public DynamicControlsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//form[@id='checkbox-example']//button")
    @FindBy(css = "form#checkbox-example>button")
    public WebElement removeButton;
    @FindBy(xpath = "//div[@id='loading']")
    public WebElement loadingBar;
    @FindBy(css = "input[type='checkbox']")
    public WebElement checkbox;
    @FindBy(css = "p[id='message']")
    public WebElement okMessage;
    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;
    @FindBy(xpath = "//form[@id='input-example']//input")
    public WebElement inputBox;

}
