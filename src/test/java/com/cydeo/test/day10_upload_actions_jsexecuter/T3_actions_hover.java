package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_actions_hover {


    @Test
    public void actions_hover_test() {
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
//
//
        WebElement userHeader1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement userHeader2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement userHeader3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


        //THIS IS HOW YOU HOVER! (....board)
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(image1).perform();
        Assert.assertTrue(userHeader1.isDisplayed());

        actions.moveToElement(image2).perform();
        Assert.assertTrue(userHeader2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(userHeader3.isDisplayed());

        Driver.closeDriver();

    }
}
/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed
 */