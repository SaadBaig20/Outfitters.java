package PageObjectManager;

import java.io.InputStream;
import java.util.Properties;

public class ProjectManager {

    private static final String FILE_NAME = "config.properties";
    private static final Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = ProjectManager.class.getClassLoader().getResourceAsStream(FILE_NAME)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + FILE_NAME);
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

