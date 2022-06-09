package com.cydeo.test.gitHub.practice2;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void task4and5Test(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Actions actions = new Actions(Driver.getDriver());
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLink).perform();
    }
}
