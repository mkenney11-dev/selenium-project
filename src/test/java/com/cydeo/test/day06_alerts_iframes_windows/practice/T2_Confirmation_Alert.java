package com.cydeo.test.day06_alerts_iframes_windows.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Confirmation_Alert {



    @Test
    public void confirmation_alert_test(){

        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        WebElement jsConfirmButton = Driver.getDriver().findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        jsConfirmButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        WebElement okConfirmation = Driver.getDriver().findElement(By.cssSelector("p[id='result']"));

        Assert.assertTrue(okConfirmation.isDisplayed());


    }
}

/*
TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
 */