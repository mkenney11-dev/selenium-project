package com.cydeo.test.day09_review_javafaker_driverutils;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_DriverUtil_Practice {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//
//        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    }

    @Test
    public void tile_verification(){

        //Driver.getDriver() will return the 'driver'
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        BrowserUtils.sleep(2);
       String expectedTitle= ConfigurationReader.getProperty("searchValue")+" - Search ";
       String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}

