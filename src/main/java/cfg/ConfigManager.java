package cfg;

import def.Constants;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Singleton configuration handler of the application
 */
public class ConfigManager {
    private static ConfigManager instance;
    private String organizationFileLocation;
    private String ticketFileLocation;
    private String userFileLocation;

    private ConfigManager() {
    }

    /**
     * @return singleton instance of ConfigManager
     */
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    /**
     * Initialize ConfigManager
     *
     * @return True if initialization successful. False otherwise
     */
    public boolean init() {
        InputStream inputStream = null;
        boolean isSuccess = false;

        try {
            Properties properties = new Properties();
            String propertyFileName = Constants.CONFIG_FILE_NAME;
            inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                System.out.println("Configuration file '" + propertyFileName + "' not found in the classpath");
                return isSuccess;
            }

            String fileLocation = properties.getProperty(Constants.PROPERTY_NAME_JSON_DIR);
            organizationFileLocation = fileLocation + File.separator + properties.getProperty(Constants.PROPERTY_NAME_FILE_NAME_ORGANIZATIONS);
            ticketFileLocation = fileLocation + File.separator + properties.getProperty(Constants.PROPERTY_NAME_FILE_NAME_TICKETS);
            userFileLocation = fileLocation + File.separator + properties.getProperty(Constants.PROPERTY_NAME_FILE_NAME_USERS);
            isSuccess = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return isSuccess;
    }

    /**
     * @return Location of the json file contains information of organizations
     */
    public String getOrganizationFileLocation() {
        return organizationFileLocation;
    }

    /**
     * @return Location of the json file contains information of tickets
     */
    public String getTicketFileLocation() {
        return ticketFileLocation;
    }

    /**
     * @return Location of the json file contains information of users
     */
    public String getUserFileLocation() {
        return userFileLocation;
    }
}
