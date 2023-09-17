package com.cydeo.test.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {


        /*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */


        //step1
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //step2
        driver.get("https://google.com");

        //step3
        //locate search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //enter "apple" key, and press ENTER
        googleSearchBox.sendKeys("apple");
        googleSearchBox.sendKeys(Keys.ENTER);
        // googleSearchBox.sendKeys("apple" + Keys.ENTER);    also works

        String expectedBeginningOfTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedBeginningOfTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }
}
