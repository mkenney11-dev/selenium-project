package com.cydeo.test.day04_findElements_checkBoxes_radio;


/*
TC #2: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T2_FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/abtest");

        //locate all links on the page
        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

       // WebElement homeButton = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //WebElement cydeoButton = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        //print out the number of links on the page
        System.out.println(listOfLinks.size());

        //print out the texts of the links
        for (WebElement each : listOfLinks) {
            System.out.println("Text of Links: " + each.getText());


            //print out the href attribute values of the links

            System.out.println("HREF attributes' values: " + each.getAttribute("href"));

        }


        driver.quit();

    }
}
