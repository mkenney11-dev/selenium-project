package com.cydeo.test.day04_findElements_checkBoxes_radio.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_xpath_cssSelector {


    @Test
    public void xpath_cssSelector_Verification(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        a. “Home” link

        WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));
        home.click();
        driver.navigate().back();

       // WebElement homeCss = driver.findElement(By.cssSelector("a[class='nav-link']"));

//        b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

//        c. “E-mail” text
      //  WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailCSS = driver.findElement(By.cssSelector("label[for='email']"));

//        d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));
     //   emailInputBox.sendKeys("lenny@yahoo.com"+ Keys.ENTER);
      //  driver.navigate().back();

//        e. “Retrieve password” button
        WebElement retrievePassowrd = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
     //   WebElement retrievePassword2 = driver.findElement(By.cssSelector("i.icon-2x icon-signin"));


//        f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
     //   WebElement powerdCSS = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


        System.out.println("home.isDisplayed() = " + home.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailCSS.isDisplayed() = " + emailCSS.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassowrd.isDisplayed() = " + retrievePassowrd.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


    }
}

