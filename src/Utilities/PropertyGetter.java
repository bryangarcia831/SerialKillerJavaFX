package Utilities;

import java.io.*;
import java.util.Properties;

/**
 * Used to pull values from the config.properties file
 *
 * @author Bryan Garcia
 */
public class PropertyGetter {

    private InputStream fileStream;
    private String propFileName;

    /**
     * Goes to the property file and grabs the key's value
     *
     * @param key The key you want to grab from config.properties
     * @return value of the key
     */
    public String getPropValues(String key) {

        String value = "";

        try {

            Properties prop = new Properties();
            propFileName = "resources/config/config.properties";

            fileStream = new FileInputStream(new File(propFileName));

            prop.load(fileStream);

            value = prop.getProperty(key);

        } catch (FileNotFoundException e) {
            System.out.println("The file " + propFileName + " has not been found!");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            if (!(fileStream == null)) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

}
