package com.cydeo.test.day04_findElements_checkBoxes_radio.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class StaleElementExceptionTask {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void StaleElementExceptionTest(){
        driver.get("https://practice.cydeo.com/abtest");


        WebElement cydeoLink = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.quit();


    }
}
/*
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
 */