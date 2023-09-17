package com.cydeo.test.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_T3_T4_T5_T6_ActionsPractices {

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    }

    @Test
    public void test2_default_value_verification(){

//        TC2 #: Drag and drop default value verification
//        1. Go to https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

//        2. Verify big circle default text is as below.
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

//        3. Assert:
//        -Text in big circle changed to: “Drag the small circle here.”
        String expectedText = "Drag the small circle here.";
        String actualText = bigCircle.getText();

        Assert.assertTrue(actualText.equals(expectedText));

    }

    @Test
    public void test3_drop_into_bigCircle(){

//
//        TC3 #: Drag and drop into the big circle

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the object to do our actions
        Actions actions = new Actions(Driver.getDriver());

//        2. Drag and drop the small circle to bigger circle.
        actions.dragAndDrop(smallCircle,bigCircle).perform();

//        3. Assert:
//        -Text in big circle changed to: “You did great!”
        String expectedText = "You did great!";
        String actualText = bigCircle.getText();
        Assert.assertTrue(actualText.equals(expectedText));

//
    }

    @Test
    public void test4(){
//
//        TC4 #: Click and hold

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the object to do our actions
        Actions actions = new Actions(Driver.getDriver());

//        actions.clickAndHold(smallCircle)
//                .pause(1000)
//                .moveToElement(bigCircle)
//                .pause(1000)
//                .release()
//                .perform();

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(cydeoLink)
                .pause(1000)
                .perform();

        String expectedText = "Drop here.";
        String actualText = bigCircle.getText();

        Assert.assertTrue(actualText.equals(expectedText));



    }


    @Test
    public void test5_drop_outside_of_bigCircle(){
//
//        TC4 #: Click and hold

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(cydeoLink)
                .pause(1000)
                .release()
                .perform();

        String expectedText = "Try again!";
        String actualText = bigCircle.getText();

        Assert.assertTrue(actualText.equals(expectedText));



    }



    @Test
    public void test6_bigCircle_hovering_text(){
//
//        TC6 #: Drag and hover

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .perform();

        String expectedText = "Now drop...";
        String actualText = bigCircle.getText();

        Assert.assertTrue(actualText.equals(expectedText));



    }



    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


}
/*


TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Click and hold the small circle.
3. Assert:
-Text in big circle changed to: “Drop here.”

TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”

TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify.
3. Assert:
-Text in big circle changed to: “Now drop...”
 */