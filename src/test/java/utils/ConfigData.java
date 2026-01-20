package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigData {

    private static Properties prop;

    public static Properties loadProperties() {
        prop = new Properties();
        try {
            InputStream input =
                ConfigData.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                throw new RuntimeException("config.properties not found in classpath");
            }

            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}

