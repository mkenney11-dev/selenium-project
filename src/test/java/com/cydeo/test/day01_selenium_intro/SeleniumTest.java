package com.cydeo.test.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // Setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        //webdrivermanager...get me the chrome driver....and do the set up

        //Creating the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();
        // this line is what is actually creating/opening a new Chrome browser

        //Test if driver and browser are working as expected
        driver.get("https://www.google.com");
        // this line tells selenium which website to go to when it opens the chrome browser


    }
}
