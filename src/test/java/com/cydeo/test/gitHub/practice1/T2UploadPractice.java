package com.cydeo.test.gitHub.practice1;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2UploadPractice {
    @Test
    public void uploadTest(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        String path = "C:\\Users\\Nutzer\\Downloads\\WhatsApp Image 2020-11-23 at 10.45.47.jpeg";
        WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        fileUpload.sendKeys(path);
        Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']")).click();
    }
    @AfterMethod
    public void closer(){
        //Driver.getDriver().close();
    }
}
