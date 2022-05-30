package com.cydeo.test.gitHub.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1WebTableOrder {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void nameVerify_test(){
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("Bob Martin" +" - "+bobMartinCell.getText());
        Assert.assertEquals("Bob Martin",bobMartinCell.getText());
        WebElement bobMartinDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals("12/31/2021",bobMartinDate.getText());
        System.out.println("12/31/2021" +" - "+ bobMartinDate.getText());
    }
}
