package com.cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    // 1 we created properties object
    private static final Properties properties = new Properties();

    static {
        //2-get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
          //3 we need to open the file
            FileInputStream file = new FileInputStream(path);
          //4 we need to load the file to properties object
            properties.load(file);

            //5 close file
            file.close();


        } catch (Exception e) {
            System.out.println("Failed to load properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}