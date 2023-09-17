package com.cydeo.test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Practice {

    public static void main(String[] args) {



    //        TC #4: Library verifications
    //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();

        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");


        //4. Enter password: “incorrect password”
        //locate password enter box
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("anything");

        //Locate sign in button using : tagName locator


        //5. Verify: visually “Sorry, Wrong Email or Password”
        WebElement signInButton = driver.findElement(By.tagName("button"));

        signInButton.click();


        //VERIFIED


    }
}
