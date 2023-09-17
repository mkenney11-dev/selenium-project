package com.cydeo.test.day05_testNG_intro_dropdowns.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_Radio_Button_Handling {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void radio_button_handling(){

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton = driver.findElement(By.cssSelector("input[id='hockey']"));
        hockeyButton.click();
        System.out.println("hockeyButton.isSelected(), expecting true = " + hockeyButton.isSelected());


        driver.quit();
    }
}
/*
TC #2: Radiobutton handling
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */