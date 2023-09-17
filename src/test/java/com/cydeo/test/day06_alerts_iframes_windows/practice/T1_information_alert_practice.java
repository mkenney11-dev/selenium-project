package com.cydeo.test.day06_alerts_iframes_windows.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_information_alert_practice {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void information_alert_test(){

        driver.get("http://practice.cydeo.com/javascript_alerts");

        WebElement jsAlertButton = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }


    @Test
    public void information_alert_test2(){

        driver.quit();
    }
}
/*
TC #1: Information alert practice
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */
