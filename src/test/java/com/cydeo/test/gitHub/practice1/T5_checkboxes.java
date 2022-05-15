package com.cydeo.test.gitHub.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;



public class T5_checkboxes {


    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes

        DriverManager WebDriverFactory;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes

        // WebElement checkbox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        //  WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));
        checkBoxIsSelected("checkbox1");
        //2. Confirm checkbox #1 is NOT selected by default.
        checkBoxIsSelected("checkbox2");


        //2. Confirm checkbox #1 is NOT selected by default.
        //System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        // System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        // 4. Click checkbox #1 to select it.
        //        Thread.sleep(2000);
        //        checkbox1.click();
        //
        // 5. Click checkbox #2 to deselect it.
        //        Thread.sleep(2000);
        //        checkbox2.click();

        Thread.sleep(2000);
        checkBoxClick("checkbox1");
        Thread.sleep(2000);
        checkBoxClick("checkbox2");


        // 6. Confirm checkbox #1 is SELECTED.
        // System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());
        checkBoxIsSelected("checkbox1");
        //7. Confirm checkbox #2 is NOT selected.
        //        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

        checkBoxIsSelected("checkbox2");

//      if(checkbox1.isSelected()){
////            System.out.println("verification passed");
////        }else{
////            System.out.println("verification fail");
////        }
////        //   7. Confirm checkbox #2 is NOT selected.
////
////        if(!checkbox2.isSelected()){
////            System.out.println("verification passed");
////        }else{
////            System.out.println("verification fail");
////        }

        driver.close();
    }

    public static void checkBoxIsSelected(String box){
        WebElement checkbox= driver.findElement(By.xpath("//input[@name='"+box+"']"));
        System.out.println(box+".isSelected(), expecting false = " + checkbox.isSelected());
    }

    public static void checkBoxClick(String box) {
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='" + box + "']"));
        checkbox.click();
    }


}
//checkbox1.isSelected(), expecting false = false
//checkbox2.isSelected(), expecting false = true
//checkbox1.isSelected(), expecting false = true
//checkbox2.isSelected(), expecting false = false




