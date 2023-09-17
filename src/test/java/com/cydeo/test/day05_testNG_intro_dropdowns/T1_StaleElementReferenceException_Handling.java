package com.cydeo.test.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
XPATH PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
public class T1_StaleElementReferenceException_Handling {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteElementButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteElementButton.isDisplayed(), expecting true = " + deleteElementButton.isDisplayed());

        Thread.sleep(2000);
        deleteElementButton.click();


        try {
            System.out.println("deleteElementButton.isDisplayed(), expecting false = " + deleteElementButton.isDisplayed());

        }catch(StaleElementReferenceException e){
            System.out.println("--> StaleElementReferenceException happened due to element being deleted from the page");
            System.out.println("Which concludes our test case PASSING");
            System.out.println("deleteElementButton.isDisplayed()= false");
        }

        driver.close();

    }
}
