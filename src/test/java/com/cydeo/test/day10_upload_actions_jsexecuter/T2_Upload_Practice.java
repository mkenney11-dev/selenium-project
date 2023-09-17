package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void uploading_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "/Users/maggie/Desktop/Java Class Materials/ArrayList Shorts";

        WebElement chooseFileButton  = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        chooseFileButton.sendKeys(path);

        WebElement uploadButton  = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }
}
/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the
 */