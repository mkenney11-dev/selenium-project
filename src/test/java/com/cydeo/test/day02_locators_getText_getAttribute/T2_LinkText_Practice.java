package com.cydeo.test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Step 2
        driver.get("https://practice.cydeo.com");

        //Step 3
        Thread.sleep(2000);
       driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink =  driver.findElement(By.linkText("A/B Testing"));
        //The above step stores the A/B testing link for later use, otherwise it would be gone

        //Step4
        String expectedTitle= "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }

        Thread.sleep(2000);
        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }




    }
}
/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
 */