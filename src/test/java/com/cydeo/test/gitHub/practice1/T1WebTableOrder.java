package com.cydeo.test.gitHub.practice1;

import com.cydeo.test.base.Testbase;
import com.cydeo.test.gitHub.utilities.WebTableUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1WebTableOrder extends Testbase {
    @Test
    public void nameVerify_test(){
        driver.get("https://practice.cydeo.com/web-tables");
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("Bob Martin" +" - "+bobMartinCell.getText());
        Assert.assertEquals("Bob Martin",bobMartinCell.getText());
        WebElement bobMartinDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals("12/31/2021",bobMartinDate.getText());
        System.out.println("12/31/2021" +" - "+ bobMartinDate.getText());
    }
    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/web-tables");
        String customerOrderDate = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println(customerOrderDate);
        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println(customerOrderDate2);
    }
    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/web-tables");
        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");
    }

}
