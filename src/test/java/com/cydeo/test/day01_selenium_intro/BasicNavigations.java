package com.cydeo.test.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // Maximizes the currently open browser
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        //gets the current URL returned as string
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        driver.navigate().forward();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //User refreshes the page using navigate.refresh();
        driver.navigate().refresh();


        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //navigate to google.com using navigate.to();
        driver.navigate().to("https://www.google.com");

        //get title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        driver.close();

    }
}
