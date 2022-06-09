package com.cydeo.test.gitHub.practice3;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.test.gitHub.utilities.Driver;
import org.testng.annotations.Test;

public class POMPractices {
    @Test
    public void requiredFieldErrorMessageTest() {
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    }
}
