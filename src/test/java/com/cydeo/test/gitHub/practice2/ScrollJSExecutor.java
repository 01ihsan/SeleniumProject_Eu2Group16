package com.cydeo.test.gitHub.practice2;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollJSExecutor {
    @Test
    public void task7ScrollTest(){
        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        Driver.closeDriver();
    }
}
