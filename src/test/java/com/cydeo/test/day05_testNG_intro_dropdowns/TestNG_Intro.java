package com.cydeo.test.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Intro {


    @Test(priority =1 )
    public void test1(){
        System.out.println("Test1 is running...");

        String actual ="apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("test2 is running...");

        String actual = "white";
        String expected = "white";
        Assert.assertTrue(actual.equals(expected));
    }
}
