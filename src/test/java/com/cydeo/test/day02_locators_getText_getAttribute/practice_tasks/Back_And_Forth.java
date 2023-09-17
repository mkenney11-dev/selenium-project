package com.cydeo.test.day02_locators_getText_getAttribute.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Back_And_Forth {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement google = driver.findElement(By.className("gb_v"));
        google.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification PASSED");
        }else{
            System.out.println("Title Verification FAILED");
        }


        driver.navigate().back();

        String googleExpectedTitle = "Google";
        String googleActualTitle = driver.getTitle();

        if(googleExpectedTitle.equals(googleActualTitle)){
            System.out.println("Google Title Verification - PASSED");
        }else{
            System.out.println("Google Title Verification - FAILED");
        }

        driver.quit();
    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */