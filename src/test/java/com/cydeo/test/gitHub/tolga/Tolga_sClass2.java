package com.cydeo.test.gitHub.tolga;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolga_sClass2 {

    public static void main(String[] args) throws InterruptedException {

        // THIS TASK FAILED!!!

    //   set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to google
        driver.get("https://google.com");

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();// used to click on any button
        Thread.sleep(5000);

        // identify and save the "Helpful tips to fact-check information online" element
        WebElement happyTeacher = driver.findElement(By.className("NKcBbd"));
        // verify the "Helpful tips to fact-check information online" text appear correctly
        if ((happyTeacher.getText().equals("Happy Teacher Appreciation Week"))) {
            System.out.println("Test appears correctly!");
        } else {
            System.out.println("Text does not appear correctly");
        }

        //close the browser
        driver.quit();

    }
}
