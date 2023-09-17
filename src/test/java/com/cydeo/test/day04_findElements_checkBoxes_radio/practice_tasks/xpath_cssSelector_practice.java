package com.cydeo.test.day04_findElements_checkBoxes_radio.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class xpath_cssSelector_practice {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        a. “Home” link
        WebElement homeButtonCSS = driver.findElement(By.cssSelector("a.nav-link"));
//        b. “Forgot password” header

        WebElement forgotPasswordHeaderCSS= driver.findElement(By.tagName("h2"));
//        c. “E-mail” text

        WebElement emailSubHeaderCSS = driver.findElement(By.cssSelector("label[for='email']"));
//        d. E-mail input box

        WebElement emailInputBoxCSS = driver.findElement(By.cssSelector("input[name='email']"));
//        e. “Retrieve password” button

        WebElement retrievePasswordButtonCSS = driver.findElement(By.cssSelector("button#form_submit"));
//        f. “Powered by Cydeo text ????
        WebElement cydeoTextCSS = driver.findElement(By.cssSelector(""));
//        4. Verify all web elements are displayed.



    }
}
/*
XPATH and CSS Selector PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
*/