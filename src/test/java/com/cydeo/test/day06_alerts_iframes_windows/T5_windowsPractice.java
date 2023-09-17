package com.cydeo.test.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_windowsPractice {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void windowsTest(){

        driver.get("https://practice.cydeo.com/windows");
        //4. ASsert: Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        System.out.println("Title before click: " +driver.getTitle());

        //5. click to "Click Here" link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        System.out.println("Title after click: "+ driver.getTitle());


        for (String each: driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());

            //7. Assert: Title is "New Window"
            String expectedTitleAfterClick = "New Window";
            actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitleAfterClick);

            //if we have to go back to main page to continue our TCs
            //we can use mainHandle to switch
            driver.switchTo().window(mainHandle);
        }

    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
/*
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */