package com.cydeo.test.gitHub.bulent;


import com.cydeo.test.gitHub.utilities.HandleWait;
import com.cydeo.test.gitHub.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        //button[@onclick='addElement()']
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        // WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();
        HandleWait.staticWait(1);

        //4. Verify “Delete” button is displayed after clicking.
      WebElement deleteButton= driver.findElement(By.xpath("//button[@class='added-manually']"));
        //WebElement deleteButton= driver.findElement(By.xpath("//button[.='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        //5. Click to “Delete” button.
        deleteButton.click();
        HandleWait.staticWait(1);

        //6. Verify “Delete” button is NOT displayed after clicking.


        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");

        }

        driver.close();
    }
}
