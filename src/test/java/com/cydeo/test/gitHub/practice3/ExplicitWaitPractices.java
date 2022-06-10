package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {
    DynamicControlsPage dynamicControlsPage;
    Actions actions;
    WebDriverWait wait;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
        actions = new Actions(Driver.getDriver());
        wait = new WebDriverWait(Driver.getDriver(), 10);
    }
    @Test
    public void removeButtonTest(){
        dynamicControlsPage.removeButton.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        try{
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        Assert.assertTrue(dynamicControlsPage.okMessage.isDisplayed());
    }
}
