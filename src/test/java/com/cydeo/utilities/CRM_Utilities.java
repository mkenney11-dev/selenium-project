package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
This project will store the methods related to CRM project
 */
public class CRM_Utilities {

    /*
    This method will login using below credentials
    @Username = helpdesk1@cydeo.com
    @Password = UserUser
     */
    public void logInCRM(WebDriver driver){
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cydeo.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[nane='USER_PASSWORD']"));
        inputUsername.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver, "(2) Portal");

    }

    public void login_crm(WebDriver driver, String username, String password){
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.xpath("//input[nane='USER_PASSWORD']"));
        inputUsername.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver, "(2) Portal");

    }





}
