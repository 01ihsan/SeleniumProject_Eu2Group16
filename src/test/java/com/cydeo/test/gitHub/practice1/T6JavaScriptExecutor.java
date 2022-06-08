package com.cydeo.test.gitHub.practice1;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6JavaScriptExecutor {
    @Test
    public void javaScriptExeTest1(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        try{
            Thread.sleep(1000);
        }catch(Exception ignored){

        }
        js.executeScript("window.scrollBy(0,1000)");

        try{
            Thread.sleep(1000);
        }catch(Exception ignored){

        }
        js.executeScript("window.scrollBy(0,1000)");


        js.executeScript("window.scrollBy(0,-750)");
    }
}
