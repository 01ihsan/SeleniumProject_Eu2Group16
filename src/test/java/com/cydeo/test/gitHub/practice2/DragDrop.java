package com.cydeo.test.gitHub.practice2;

import com.cydeo.test.gitHub.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop {
    @Test
    public void circleDragDrop() throws InterruptedException {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(1000);
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        //actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();
        Thread.sleep(1000);
        Assert.assertEquals("You did great!", bigCircle.getText());
    }
}
