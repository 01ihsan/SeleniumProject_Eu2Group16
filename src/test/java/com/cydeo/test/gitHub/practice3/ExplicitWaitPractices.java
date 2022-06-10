package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.test.gitHub.utilities.BrowserUtils;
import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {
    DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }
    @Test
    public void removeButtonTest(){
        dynamicControlsPage.removeButton.click();
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
        try{
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        Assert.assertTrue(dynamicControlsPage.okMessage.isDisplayed());
    }

    @Test
    public void enableButtonTest(){
        dynamicControlsPage.enableButton.click();
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());
    }
}