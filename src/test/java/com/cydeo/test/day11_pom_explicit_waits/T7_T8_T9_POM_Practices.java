package com.cydeo.test.day11_pom_explicit_waits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T7_T8_T9_POM_Practices {

    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage = new LibraryLoginPage();
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void T7_field_required_error_message_test(){
        /*
TC #7:
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
NOTE: FOLLOW POM DESIGN PATTERN
 */

        //LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());

    }

    @Test
    public void T8_email_error_format_error_message_test(){
//          TC#7
//        3- Enter invalid email format
        loginPage.emailInput.sendKeys("username");
        loginPage.signInButton.click();
//        4- Verify expected error is displayed:
//        Expected: Please enter a valid email address.
        Assert.assertTrue(loginPage.enterValidEmailErrorMessage.isDisplayed());

    }

    @Test
    public void T9_wrong_email_or_password_message(){
//        TC #9: Library negative login
//        3- Enter incorrect username or incorrect password
        loginPage.emailInput.sendKeys("wrongemail@something.com");
        loginPage.passwordInput.sendKeys("1234xks");
        loginPage.signInButton.click();

//        4- Verify title expected error is displayed:
//        Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(loginPage.sorryWrongEmailOrPasswordErrorMessage.isDisplayed());
//
//        NOTE: FOLLOW POM DESIGN PATTERN
    }


}
