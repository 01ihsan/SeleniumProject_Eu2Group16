package com.cydeo.test.gitHub.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("NewClassNamingConvention")
public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest() {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropDownText = currentlySelectedOption.getText();
        String expectedSimpleDropDownText = "Please select an option";
        Assert.assertEquals(expectedSimpleDropDownText,actualSimpleDropDownText);
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateDropDown = "Select a State";
        String actualStateDropDown= stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateDropDown,expectedStateDropDown);
    }
}
