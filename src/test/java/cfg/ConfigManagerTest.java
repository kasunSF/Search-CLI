package cfg;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ConfigManagerTest extends TestCase {
    private ConfigManager configManager;

    @Override
    protected void setUp() {
        configManager = ConfigManager.getInstance();
    }

    @Test
    public void testInit() {
        boolean isSuccess = configManager.init();
        Assert.assertTrue(isSuccess);
    }

    @Test
    public void testGetOrganizationFileLocation() {
        String fileLocation = configManager.getOrganizationFileLocation();

        Assert.assertTrue(fileLocation.length() > 0);
    }

    @Test
    public void testGetTicketFileLocation() {
        String fileLocation = configManager.getOrganizationFileLocation();

        Assert.assertTrue(fileLocation.length() > 0);
    }

    @Test
    public void testGetUserFileLocation() {
        String fileLocation = configManager.getOrganizationFileLocation();

        Assert.assertTrue(fileLocation.length() > 0);
    }
}