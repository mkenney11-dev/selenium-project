package com.cydeo.test.day05_testNG_intro_dropdowns.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_Stale_Element_Exception_Handling {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test
    public void stale_Element_Exception_Handling(){
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        System.out.println("deleteButton.isDisplayed(), expecting true = " + deleteButton.isDisplayed());
        deleteButton.click();

        try{
            System.out.println("deleteButton.isDisplayed(), expecting false = " + deleteButton.isDisplayed());

        }catch(StaleElementReferenceException e){
            System.out.println("---> StaleElementException happened due to element being deleted from the page");
            System.out.println("Which concludes our test is PASSING!");
            System.out.println("deleteButton.isDisplayed()= false");
        }



        driver.quit();
    }

}

/*
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */