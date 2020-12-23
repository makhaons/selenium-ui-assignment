package com.selenium.main.support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public Properties properties;

    public PropertiesReader(String FilePath) {
        try {
            FileInputStream Locator = new FileInputStream(FilePath);
            properties = new Properties();
            properties.load(Locator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getData(String ElementName) {
        return properties.getProperty(ElementName);
    }
}
