package com.cydeo.test.gitHub.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ConfigPractice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
    }

    @Test
    public void google_search_test(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

        searchBox.sendKeys("apple"+ Keys.ENTER);

        String currentTitle = driver.getTitle();
        Assert.assertEquals("apple - Google Search",currentTitle);

    }

}
