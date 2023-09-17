package com.cydeo.test.day12_review;

import com.cydeo.pages.W3Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick_Practice {


    @Test
    public void T1_double_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli\n" +
                "ck2");

        Driver.getDriver().switchTo().frame("iframeResult");

        W3Page w3Page = new W3Page();

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(w3Page.paragraph).perform();

        String actualStyleAttributeValue = w3Page.paragraph.getAttribute("style");
        String expectedInAttributeValue = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInAttributeValue));


    }
}
/*
TC #1: Double Click Test
1. Go to
https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
ck2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.
NOTE: FOLLOW POM
 */