package com.cydeo.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*

In this class we will be creating the re-usable logic to read from the configurations.properties files
 */
public class ConfigurationReader {


    //1 - create the properties object
    //make it private so it is not accessible outside of this class
    //make it static so that it is created and loaded before everything else
    private static Properties properties = new Properties();

    static {


        try{

            //2 - Open file using FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            //3 - load the object with properties file
            properties.load(file);

            file.close();

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
        }

    }

    //create utility method to use the object to read
    //4 - Use properties object ot read from the file

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);

    }




}
