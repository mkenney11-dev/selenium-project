package com.cydeo.test.day06_alerts_iframes_windows.practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Information_Alert {

    @Test
    public void informationAlertTest(){
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        WebElement jsPromptButton = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPromptButton.click();

        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(2);
        alert.sendKeys("hello");
        BrowserUtils.sleep(2);
        alert.accept();

        WebElement youEnteredMessage = Driver.getDriver().findElement(By.cssSelector("p[id='result']"));
        Assert.assertTrue(youEnteredMessage.isDisplayed());
    }
}
/*
TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed.
 */