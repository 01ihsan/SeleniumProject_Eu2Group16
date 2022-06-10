package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick {
    @Test
    public void doubleClickTest() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().findElement(By.id("accept-choices")).click();

        Driver.getDriver().switchTo().frame("iframeResult");
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();
        Assert.assertTrue(doubleClickPage.textToDoubleClick.getAttribute("style").contains("red"));
    }
}
