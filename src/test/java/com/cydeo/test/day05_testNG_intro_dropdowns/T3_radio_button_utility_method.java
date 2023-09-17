package com.cydeo.test.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T3_radio_button_utility_method {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/radio_buttons");

        clickandVerifyRadioButton(driver, "sport", "hockey");


    }
    private static void clickandVerifyRadioButton(WebDriver driver, String nameAttribute, String expectedID){

            List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

            for (WebElement each : radioButtons) {
                String actualID = each.getAttribute("id");
                System.out.println("actualID = " + actualID);

                if (actualID.equals(expectedID)){
                    each.click();
                    System.out.println(actualID+ " is selected: "+ each.isSelected());
                    break;
                }
            }
        }
    }
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.

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
