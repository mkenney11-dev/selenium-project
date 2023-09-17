package com.cydeo.test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {


        //TC +1: Cydeo practice tool verifications 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        //3. Verify URL contains expected: cydep
        //4. Verify title contains expected: Practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");


        String expectedInURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURL)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }



        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();//returns title from the browser window directly

        if(actualTitle.equals(actualTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED");
        }



        driver.close();//closes browser



    }
}
