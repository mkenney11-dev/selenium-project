package com.cydeo.test.day03_cssSelector_xpath.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class xpath_Practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("https://practice.cydeo.com/inputs");

        WebElement homeButton = driver.findElement(By.className("nav-link"));
        homeButton.click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification -PASSED");
        }else{
            System.out.println("Title verification -FAILED");
        }

        driver.quit();
    }
}
/*
HWP #4: Practice Cydeo – xpath locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “xpath” locator
 */