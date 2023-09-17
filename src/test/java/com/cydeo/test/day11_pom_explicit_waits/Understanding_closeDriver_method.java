package com.cydeo.test.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class Understanding_closeDriver_method {

    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        //verify something
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com");
        //verify something else
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
        //verify something completely different
    }

}
