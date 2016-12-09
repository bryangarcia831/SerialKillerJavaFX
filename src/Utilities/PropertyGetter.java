package Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author Bryan Garcia
 */
public class PropertyGetter {

    InputStream inputStream;

    public String getPropValues(String check) throws IOException {
        String value = "";

        try {
            Properties prop = new Properties();
            String propFileName = "resources/config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            value = prop.getProperty(check);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return value;
    }
}
