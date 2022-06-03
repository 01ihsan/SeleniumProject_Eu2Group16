package com.cydeo.test.gitHub.practice1;

import com.cydeo.test.gitHub.utilities.ConfigurationReader;
import com.cydeo.test.gitHub.utilities.Driver;
import com.cydeo.test.gitHub.utilities.WebDriverFactory;
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
//    public WebDriver driver;
//
//    @BeforeMethod
//    public void setupMethod(){
//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }

    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']")).click();
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        String searchItem = ConfigurationReader.getProperty("searchItem");
        searchBox.sendKeys(searchItem+ Keys.ENTER);

        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(searchItem+" - Google Search",currentTitle);
        Driver.getDriver().quit();

    }

}
