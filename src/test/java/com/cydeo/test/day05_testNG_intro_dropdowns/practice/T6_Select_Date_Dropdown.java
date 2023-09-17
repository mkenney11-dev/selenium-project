package com.cydeo.test.day05_testNG_intro_dropdowns.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T6_Select_Date_Dropdown {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void select_date_test(){

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement yearDropdown = driver.findElement(By.cssSelector("select[id='year']"));
        Select select1 = new Select(yearDropdown);
        select1.selectByVisibleText("1993");
        Select select2 = new Select(driver.findElement(By.cssSelector("select[id='month']")));
        select2.selectByValue("11");
        Select select3 = new Select(driver.findElement(By.cssSelector("select[id='day']")));
        select3.selectByIndex(0);


    }
}
/*
3. Select “December 1st, 1933” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */