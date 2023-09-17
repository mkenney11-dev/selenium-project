package com.cydeo.test.day04_findElements_checkBoxes_radio.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T2_FindElements {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void links_test() {

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        for (WebElement each : listOfLinks) {
            System.out.println("Text of links = " + each.getText());
            System.out.println("HREF attributes' values = " + each.getAttribute("href"));
        }

        driver.quit();

    }

    @Test
    public void links_test2(){

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        for (WebElement each : listOfLinks) {
            System.out.println("Text of link = " + each.getText());
            System.out.println("HREF attributes' value = " + each.getAttribute("href"));
        }


        driver.quit();
    }

    @Test
    public void google_link_test(){
        driver.get("https://google.com");

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
        System.out.println("listOfLinks.size() = " + listOfLinks.size());

        for (WebElement each : listOfLinks) {
            System.out.println("Text of link = " + each.getText());
            System.out.println("HREF attributes' value = " + each.getAttribute("href"));

        }
        driver.quit();
    }

}
