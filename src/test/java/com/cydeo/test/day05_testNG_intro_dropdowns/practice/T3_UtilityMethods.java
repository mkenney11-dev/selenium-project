package com.cydeo.test.day05_testNG_intro_dropdowns.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class T3_UtilityMethods {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    public void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String expectedID){


        List<WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));
        WebElement hockeyButton = driver.findElement(By.name(nameAttribute));

        for (WebElement each : listOfRadioButtons) {
            String actualID=each.getAttribute("id");
            System.out.println("actualID = " + actualID);

            if(actualID.equals(expectedID)){
                each.click();
                System.out.println(actualID + " is Selected: "+each.isSelected());
                break;
            }
        }
        driver.quit();
    }
}
/*

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */