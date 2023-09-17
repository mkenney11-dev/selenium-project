package com.cydeo.test.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_form_collection {

    @Test
    public void registration_form() {


        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys("Jane");


        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys("Doe");


        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        inputUsername.sendKeys("janedoe58");


        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("janedoe@example.com");


        WebElement inputpassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputpassword.sendKeys("password");


        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys("333-222-4444");


        WebElement radioButtonFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        radioButtonFemale.click();


        WebElement inputbirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputbirthday.sendKeys("01/20/1980");


        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.name("department")));
        departmentDropdown.selectByVisibleText("Department of Engineering");

        Select jobTitleDropdown= new Select(Driver.getDriver().findElement(By.name("job_title")));
        jobTitleDropdown.selectByVisibleText("SDET");

        WebElement javaCheckbox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        javaCheckbox.click();

        WebElement signUpButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpButton.click();


        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(successMessage.isDisplayed());

        Driver.closeDriver();
    }
}
/*
TC#1: Registration form confirmation
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
 */