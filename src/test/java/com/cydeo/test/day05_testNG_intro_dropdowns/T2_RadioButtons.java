package com.cydeo.test.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
XPATH PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
public class T2_RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(2000);
        hockeyRadioButton.click();

        if(hockeyRadioButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED");
        }else{
            System.out.println("Button not selected. Verification FAILED");
        }


    }


}

