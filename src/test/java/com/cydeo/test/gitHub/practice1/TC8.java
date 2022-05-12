package com.cydeo.test.gitHub.practice1;


import com.cydeo.test.gitHub.utilities.HandleWait;
import com.cydeo.test.gitHub.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;



//TC #8: Selecting value from multiple select dropdown
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
//3. Select all the options from multiple select dropdown.
//4. Print out all selected values.
//5. Deselect all values


public class TC8 {

    static WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com//dropdown");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }

    @Test
    public void TestTheOptions() {

        selectTheOptionsAndPrintOut(6);

        deselectTheOptions(6);


    }









    public static void selectTheOptionsAndPrintOut(int numberOfOptions) {

        Select multipleDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));// here we find the multiple dropdown menu first

        List<WebElement> allOptions = multipleDropDown.getOptions();//there are 6 options here from java to c..,which is an <arraylist with six elements in

        for (int i = 0; i < numberOfOptions; i++) {

            // Select all the options from multiple select dropdown.
            multipleDropDown.selectByIndex(i);
            HandleWait.staticWait(1);

            // Print out all selected values.

        }
        for (WebElement each : allOptions) {
            if (each.isSelected()) {

                System.out.println(each.getText());
            }
        }

    }


    public static void deselectTheOptions(int numberOfOptions) {

        Select multipleDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));// here we find the multiple dropdown menu first


        for (int i = 0; i < numberOfOptions; i++) {
            multipleDropDown.deselectByIndex(i);
            HandleWait.staticWait(1);
        }


    }
}
