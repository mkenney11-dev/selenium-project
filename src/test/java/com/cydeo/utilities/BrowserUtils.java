package com.cydeo.utilities;

/*
This class will be storing only the utility methods that can be used across the project
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept integer int (seconds) and execute Thread.sleep method for given duration
    Arg: int seconds
     */
    public static void sleep(int second){
        second +=1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }

/*
This method will accept driver, string - expected in URL, and string - expected in title and will execute the switch
and verification of the title name in the specified window
 */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }

    /*
    This method will accept string expected title and will verify the title equals expected title
     */
    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
    /*
    This method will accept a string - expectedInTitle and will verify that the title contains the given string
     */
    public static void verifyTitleContains(WebDriver driver, String expectedInTitle){

            Assert.assertTrue(driver.getTitle().contains(expectedInTitle));

        }

        /*
        This method accepts a web element - target, and waits for that element to not be displayed on the page
         */
        public static void waitForInvisibilityOfGiveElement(WebElement target){

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(target));
        }

        /*
        This method accepts String title, and waits for the Title to contain given string value
         */
    public static void waitForTitleContains(String title){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

}
