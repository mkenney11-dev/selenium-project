package com.cydeo.test.day09_review_javafaker_driverutils;

public class Singleton {

    //#1 - create private constructor
    private Singleton(){}

    //#2- private static string
    private static String word;

    //#3- Utility method to return the 'private String'
    public static String getWord() {

        if (word == null) {
            System.out.println("First time call. Word object is null");
            System.out.println("Assigning value to it now.");
            word = "something";
        } else {
            System.out.println("Word already has a value");
        }
        return word;
    }



}
