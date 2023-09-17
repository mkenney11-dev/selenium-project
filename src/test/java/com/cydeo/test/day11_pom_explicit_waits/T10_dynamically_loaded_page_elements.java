package com.cydeo.test.day11_pom_explicit_waits;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T10_dynamically_loaded_page_elements {

    @Test
    public void T10_dynamic_title_loading_verification(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.titleIs("Dynamic Title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        Assert.assertTrue(dynamicLoad7Page.spongebobPicture.isDisplayed());

    }
}
/*
TC#10 : Dynamically Loaded Page Elements 7
1. Go to https://practice.cydeo.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert: Message “Done” is displayed.
4. Assert: Image is displayed.
Note: Follow POM
 */