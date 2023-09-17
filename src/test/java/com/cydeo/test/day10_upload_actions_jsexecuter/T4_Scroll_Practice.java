package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Scroll_Practice {

    @Test
    public void scroll_test1(){
        Driver.getDriver().get("https://practice.cydeo.com/");


        WebElement poweredByCydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(poweredByCydeo).perform();

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();





    }


}
/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method
 */