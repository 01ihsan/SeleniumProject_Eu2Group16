package com.cydeo.test.gitHub.utilities;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();// right side open a webpage

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver();
            return new FirefoxDriver();

        } else {
            System.out.println("Given Browser Type does not exist/or is not currently suppoerted");
            System.out.println("Driver=null");
            return null;
        }
    }


}
