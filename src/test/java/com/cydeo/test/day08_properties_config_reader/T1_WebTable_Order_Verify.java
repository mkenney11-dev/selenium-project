package com.cydeo.test.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void order_verify_name_test(){

        WebElement bobsCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));


        System.out.println("bobsCell.getText() = " + bobsCell.getText());

        String expectedName = "Bob Martin";
        String actualName = bobsCell.getText();

        Assert.assertEquals(actualName, expectedName, "Names are not matching");

        //locator for bob's order date
        //WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../tx[5]"));

        WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = bobsOrderDate.getText();

        Assert.assertEquals(actualDate, expectedDate);




    }


    @Test
    public void test2_use_order_verify_method(){

        String alexandraGray = WebOrderUtils.returnOrderDate(driver, "Alexandra Gray");

        System.out.println("alexandraGray = " + alexandraGray);
    }

}

/*1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021

 */