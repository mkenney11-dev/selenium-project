package com.cydeo.test.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_iframes {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void iframes_test(){

        driver.get("https://practice.cydeo.com/iframe");

       driver.switchTo().frame("mce_0_ifr");


        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));

        Assert.assertTrue(paragraphText.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement h3 = driver.findElement(By.tagName("h3"));

        Assert.assertTrue(h3.isDisplayed());


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
/*
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */