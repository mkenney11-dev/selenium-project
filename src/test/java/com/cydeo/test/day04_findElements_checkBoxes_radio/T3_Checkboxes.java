package com.cydeo.test.day04_findElements_checkBoxes_radio;

/*
TC#3: Checkboxes
1. Go to https://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_Checkboxes {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //confirm checkbox 1 is NOT selected by default
        //confirm checkbox 2 is selected by default
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        // click checkbox 1 to select
        //click checkbox 2 to deselect

        System.out.println("-------------------------------------");
        checkbox1.click();
        checkbox2.click();

        //confirm checkbox 1 is selected
        //confirm checkbox 2 is not selected
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());


        driver.quit();
    }


}
