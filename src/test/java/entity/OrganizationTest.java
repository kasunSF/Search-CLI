package entity;

import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class OrganizationTest extends TestCase {
    @Test
    public void testJsonToOrganizationID() {
        int id = 101;
        String jsonString =
                "  {\n" +
                        "    \"_id\": " + id + ",\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(id, organization.getID());
    }

    @Test
    public void testJsonToOrganizationURL() {
        String url = "http://initech.zendesk.com/api/v2/organizations/101.json";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"" + url + "\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(url, organization.getUrl());
    }

    @Test
    public void testJsonToOrganizationExternalID() {
        String externalID = "9270ed79-35eb-4a38-a46f-35725197ea8d";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"" + externalID + "\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(externalID, organization.getExternalID());
    }

    @Test
    public void testJsonToOrganizationName() {
        String name = "Enthaze";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"" + name + "\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(name, organization.getName());
    }

    @Test
    public void testJsonToOrganizationDomainNames() {
        String domainName = "kage.com";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [" + domainName + "],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(domainName, organization.getDomainNames()[0]);
    }

    @Test
    public void testJsonToOrganizationCreatedAt() {
        String createdAt = "2016-05-21T11:10:28 -10:00";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"" + createdAt + "\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(createdAt, organization.getCreatedAt());
    }

    @Test
    public void testJsonToOrganizationDetails() {
        String details = "MegaCorp";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"" + details + "\",\n" +
                        "    \"shared_tickets\": false,\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(details, organization.getDetails());
    }

    @Test
    public void testJsonToOrganizationSharedTickets() {
        String sharedTickets = "true";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": \"" + sharedTickets + "\",\n" +
                        "    \"tags\": []\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertTrue(organization.isSharedTickets());
    }

    @Test
    public void testJsonToOrganizationTags() {
        String tag = "Fulton";

        String jsonString =
                "  {\n" +
                        "    \"_id\": 101,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"domain_names\": [],\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"details\": \"\",\n" +
                        "    \"shared_tickets\": \"\",\n" +
                        "    \"tags\": [" + tag + "]\n" +
                        "  }";

        Gson gson = new Gson();

        Organization organization = gson.fromJson(jsonString, Organization.class);
        Assert.assertEquals(tag, organization.getTags()[0]);
    }
}
