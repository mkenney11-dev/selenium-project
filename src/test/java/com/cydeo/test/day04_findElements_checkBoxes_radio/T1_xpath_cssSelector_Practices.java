package com.cydeo.test.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*        TC #1: XPATH and cssSelector Practices
        1. Open Chrome browser


      2. Go to https://practice.cydeo.com/forgot_password


       3. Locate all the WebElements on the page using XPATH and/or CSS
       locator only (total of 6)
       a. “Home” link
       b. “Forgot password” header
       c. “E-mail” text
       d. E-mail input box
      e. “Retrieve password” button
      f. “Powered by Cydeo text



       4. Verify all web elements are displayed.


 */
public class T1_xpath_cssSelector_Practices {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/forgot_password");


        //locate home link using cssSelector, syntax #1, class attribute value
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate home link using cssSelector, syntax #2, class attribute value
        //WebElement homelink2 = driver.findElement(By.cssSelector("a.nav-link"));

        //Locate home link using cssSelector syntax #1 href, class attribute
       // WebElement homelink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //Locate 'forgot password' header using xpath, using text of h2
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //Locate header, using cssSelector, syntax #1, locate parent element and move down to h2
        WebElement header1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        //OR syntax #2
       WebElement header2 = driver.findElement(By.cssSelector("div.example>h2"));

       //locate email label using xpath
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));

        //locate email input box using xpath
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        //locate email input box using xpath contains method
        //contains method ------> tagName[contains(@attribute, 'value)]
        WebElement emailInput2 = driver.findElement(By.xpath("//input[contains(@pattern, '[a-z0-9._%+-]')]"));

        //locate 'retrieve password' button using xpath
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //locate "powered by cydeo"text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //verify all web elements are displayed
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


        Thread.sleep(2000);
        driver.close();






    }
}
