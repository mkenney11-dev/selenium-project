package com.cydeo.test.day06_alerts_iframes_windows;

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

public class Dropdowns_T6_T7_T8 {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void dropdownsTask6(){
    driver.get("https://practice.cydeo.com/dropdown");

        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));


        yearDropdown.selectByVisibleText("1933");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);


        String expectedYear = "1933";
        String expectedMonth ="December";
        String expectedDay = "1";

        String actualYear= yearDropdown.getFirstSelectedOption().getText();
        String actualMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }


    @Test
    public void dropdownTask7(){


        driver.get("https://practice.cydeo.com/dropdown");

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropDown.selectByValue("IL");
        stateDropDown.selectByVisibleText("Virginia");
        stateDropDown.selectByIndex(5);

        String expectedState = "California";
        String actualState = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualState, expectedState, "STATE DROPDOWN IS NOT AS EXPECTED!");

//        3. Select Illinois
//        4. Select Virginia
//        5. Select California
//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)







    }


    @Test
    public void dropdownTask8(){

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement linkDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));

        linkDropdown.click();

        WebElement facebookLink= driver.findElement(By.linkText("Facebook"));
        facebookLink.click();

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle, "TITLE IS NOT AS EXPECTED");

/*
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1933” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */