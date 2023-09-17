package com.cydeo.test.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_TestNG_Selenium_Intro {
   WebDriver driver;
   @BeforeMethod
   public void setUpMethod(){

       driver = WebDriverFactory.getDriver("Chrome");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();

       driver.get("https://practice.cydeo.com");

   }

    @Test
    public void test1_cydeo_title_verification(){

        String actual =driver.getTitle();
        String expected ="Practice";

        Assert.assertEquals(actual, expected);

    }

    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
}
