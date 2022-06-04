package com.cydeo.test.gitHub.practice1;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathPractice {
    @Test
    public void automationExercise(){
        Driver.getDriver().get("https://automationexercise.com/");
        Driver.getDriver().findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]")).click();
//        Driver.getDriver().findElement(By.xpath("//div[@id='Men']//a")).click();
    }
}
