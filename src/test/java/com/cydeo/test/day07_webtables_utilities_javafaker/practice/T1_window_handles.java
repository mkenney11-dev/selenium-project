package com.cydeo.test.day07_webtables_utilities_javafaker.practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_window_handles {

   @Test
    public void window_handles(){
       Driver.getDriver().get("https://www.amazon.com");


       ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://google.com','_blank');");
       ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://etsy.com','_blank');");
       ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://facebook.com','_blank');");

       BrowserUtils.switchWindowAndVerify(Driver.getDriver(), "etsy", "Etsy");
   }

}
/*
TC #1: Window Handle practice
1. Create new test and make set ups
2. Go to : https://www.amazon.com
3. Copy paste the lines from below into your class
4. Create a logic to switch to the tab where Etsy.com is open
5. Assert: Title contains “Etsy”
Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simply open new tabs using something called JavascriptExecutor
and get those pages. We will learn JavascriptExecutor later as well.
 */