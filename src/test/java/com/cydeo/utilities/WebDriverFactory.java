package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType){

        if(browserType.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
           return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browserType.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else if(browserType.equalsIgnoreCase("Safari")){
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }else{
            System.out.println("Given string doesn't represent any browser");
            System.out.println("Either that browser does not exist or is not currently supported");
            System.out.println("driver = null");
            return null;
        }

    }




    //NEW METHOD CREATION
    //name: getDriver
    //Static Method
    // Accepts String arg: browser type
    // this arg will determine what type of browser is opened
    // if chrome passed it will open chrome, if firefox passed it will open firefox, etc.
    // Return Type: webdriver


}
