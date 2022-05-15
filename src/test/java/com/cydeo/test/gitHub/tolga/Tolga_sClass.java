package com.cydeo.test.gitHub.tolga;

import com.cydeo.test.gitHub.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tolga_sClass {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //WebElement resetPasswordButton =  driver.findElement(By.cssSelector("button[class=\"login-btn\"]"));
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button.login-btn"));

        String expected = "Reset password";
        String actual = resetPasswordButton.getAttribute("value");

        if (actual.equals(expected)) {
            System.out.println("PASSeD");
        } else {
            System.out.println( "FAILED");
        }

        driver.close();

    }
}


/*

TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from

cssSelector:
syntax: tagName [attribute='value']
syntax: tagName [attribute="value"]
syntax: tagName.classValue --> a.ff58
syntax: tagName#idValue -->  a#bb22
 */



