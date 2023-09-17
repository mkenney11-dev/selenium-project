package com.cydeo.test.day05_testNG_intro_dropdowns.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_Simple_DropDown {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void dropDown(){

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select select = new Select(dropDown);

        String expectedDefaultValue = "Please select an option";
        String actualDefaultValue = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultValue, expectedDefaultValue);

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDefault="Select a State";
        String actualDefault = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedDefault,actualDefault);

    }

    @Test
    public void dropdown_test2(){

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));

        Select select = new Select(dropdown);

        String expectedDefault = "Please select an option";
        String actualDefault = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefault, expectedDefault);

    }
}
/*
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */