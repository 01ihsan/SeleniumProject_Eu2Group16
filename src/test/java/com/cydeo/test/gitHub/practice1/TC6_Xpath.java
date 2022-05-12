package com.cydeo.test.gitHub.practice1;


import com.cydeo.test.gitHub.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC6_Xpath {

    static WebDriver driver;

    public static void main(String[] args) {
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to http://practice.cydeo.com/multiple_buttons

        driver.get("http://practice.cydeo.com/multiple_buttons");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //3. Click on Button 1
        clickButton(1);

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        verifyText("one");

        driver.close();

    }

    public static void clickButton(int  ButtonNummer) {
        //Button = Button.toLowerCase();
        WebElement clickButton = driver.findElement(By.xpath("//button[@onclick='button"+ ButtonNummer + "()" + "']"));
        clickButton.click();
    }

    public static void verifyText(String buttonNumber) {
        WebElement displayedText = driver.findElement(By.id("result"));
        System.out.println("displayedText.getText() = " + displayedText.getText());

        if(displayedText.getText().equals("Clicked on button "+buttonNumber+"!")){
            System.out.println("Displayed Text Verification Passed! Good Job!");
        }else{
            System.out.println("Displayed Text Verification failed! Tell the Developper!");
        }
    }

}
