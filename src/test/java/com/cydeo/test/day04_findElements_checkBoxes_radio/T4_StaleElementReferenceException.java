package com.cydeo.test.day04_findElements_checkBoxes_radio;

/*
TC #4: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.

This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it.
 */

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


         driver.navigate().refresh();
        System.out.println("Refreshing the page.....");

        System.out.println("After refresh cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("After refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}
