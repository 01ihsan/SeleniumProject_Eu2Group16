package com.cydeo.test.gitHub.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {
    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

}
