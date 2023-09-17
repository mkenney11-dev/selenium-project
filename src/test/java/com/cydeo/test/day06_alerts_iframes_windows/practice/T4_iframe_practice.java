package com.cydeo.test.day06_alerts_iframes_windows.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T4_iframe_practice {

    @Test
    public void iframe_test(){

        Driver.getDriver().get("https://practice.cydeo.com/iframe");

        WebElement defaultText = Driver.getDriver().findElement(By.xpath("//"));
        Driver.getDriver().switchTo().frame(2);



    }
}
/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */