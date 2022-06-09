package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {
    @Test
    public void dynamicLoad7Test() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
    }
    @Test
    public void dynamicLoad1Test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicLoad1Page dynamicLoad1Page=new DynamicLoad1Page();
        dynamicLoad1Page.startButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));
        wait.until(ExpectedConditions.visibilityOf(dynamicLoad1Page.userName));
        Assert.assertTrue(dynamicLoad1Page.userName.isDisplayed());
        dynamicLoad1Page.userName.sendKeys("tomSmith");
        dynamicLoad1Page.password.sendKeys("incorrectPassword");
        dynamicLoad1Page.submitButton.click();
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());
    }
}
