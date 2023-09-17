package com.cydeo.test.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_dropdown_intro {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

    }

    @Test
    public void simpleDropdownsTest(){

        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(simpleDropdown);

        String expectedDefaultValue = "Please select and option";
        String actualDefaultValue = select.getFirstSelectedOption().getText();


        Assert.assertEquals(actualDefaultValue, expectedDefaultValue
        );

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDefaultStateValue = "Select a State";
        String actualDefaultStateValue = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultStateValue,expectedDefaultStateValue);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
/*
TC#5: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */