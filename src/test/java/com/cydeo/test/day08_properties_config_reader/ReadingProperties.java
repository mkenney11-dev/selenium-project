package com.cydeo.test.day08_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {




    @Test
    public void reading_from_properties_test() throws IOException {

        //STEPS TO READ FROM PROPERTIES TYPE OF FILE

        //1-create object of properties class
        Properties properties = new Properties();

        //2-open the file in the java memory using fileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");


        //3-load the properties file in the properties object
        properties.load(file);


        //4- use the properties object to read value from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }
}
