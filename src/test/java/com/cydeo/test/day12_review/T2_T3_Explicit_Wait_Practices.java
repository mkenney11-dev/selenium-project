package com.cydeo.test.day12_review;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T2_T3_Explicit_Wait_Practices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public void setUp(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
         dynamicControlsPage = new DynamicControlsPage();
    }


    @Test
    public void t2_remove_checkbox_test(){

        dynamicControlsPage.removeButton.click();

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        BrowserUtils.waitForInvisibilityOfGiveElement(dynamicControlsPage.loadingBar);

        try {
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch(NoSuchElementException n){
            System.out.println("NoSuchElementException is thrown. It means that the checkbox is not on the page and teh test passes");
            Assert.assertTrue(true);
        }

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
    }


    @Test
    public void t3_input_input_box_test(){

        dynamicControlsPage.enableButton.click();
        BrowserUtils.waitForInvisibilityOfGiveElement(dynamicControlsPage.loadingBar);

        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        String actualMessageText = dynamicControlsPage.message.getText();
        Assert.assertTrue(actualMessageText.equals("It's enabled!"));
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


}
/*
TC #3: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Enable” button
4- Wait until “loading bar disappears”
5- Verify:
a. Input box is enabled.
b. “It’s enabled!” message is displayed.
NOTE: FOLLOW POM
 */







/*
TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.
NOTE: FOLLOW POM
 */