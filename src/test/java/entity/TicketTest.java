package entity;

import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TicketTest extends TestCase {
    @Test
    public void testJsonToTicketID() {
        String id = "436bf9b0-1147-4c0a-8439-6f79833bff5b";
        String jsonString = "  {\n" +
                "    \"_id\": " + id + ",\n" +
                "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                "    \"type\": \"incident\",\n" +
                "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                "    \"priority\": \"high\",\n" +
                "    \"status\": \"pending\",\n" +
                "    \"submitter_id\": 38,\n" +
                "    \"assignee_id\": 24,\n" +
                "    \"organization_id\": 116,\n" +
                "    \"tags\": [\n" +
                "      \"Ohio\",\n" +
                "      \"Pennsylvania\",\n" +
                "      \"American Samoa\",\n" +
                "      \"Northern Mariana Islands\"\n" +
                "    ],\n" +
                "    \"has_incidents\": false,\n" +
                "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                "    \"via\": \"web\"\n" +
                "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(id, ticket.getID());
    }

    @Test
    public void testJsonToTicketURL() {
        String url = "http://initech.zendesk.com/api/v2/tickets/101.json";

        String jsonString = "  {\n" +
                "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                "    \"url\": \"" + url + "\",\n" +
                "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                "    \"type\": \"incident\",\n" +
                "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                "    \"priority\": \"high\",\n" +
                "    \"status\": \"pending\",\n" +
                "    \"submitter_id\": 38,\n" +
                "    \"assignee_id\": 24,\n" +
                "    \"organization_id\": 116,\n" +
                "    \"tags\": [\n" +
                "      \"Ohio\",\n" +
                "      \"Pennsylvania\",\n" +
                "      \"American Samoa\",\n" +
                "      \"Northern Mariana Islands\"\n" +
                "    ],\n" +
                "    \"has_incidents\": false,\n" +
                "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                "    \"via\": \"web\"\n" +
                "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(url, ticket.getUrl());
    }

    @Test
    public void testJsonToTicketExternalID() {
        String externalID = "9270ed79-35eb-4a38-a46f-35725197ea8d";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"" + externalID + "\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(externalID, ticket.getExternalID());
    }

    @Test
    public void testJsonToTicketCreatedAt() {
        String createdAt = "2016-05-21T11:10:28 -10:00";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"" + createdAt + "\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(createdAt, ticket.getCreatedAt());
    }

    @Test
    public void testJsonToTicketType() {
        String type = "incident";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"" + type + "\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(type, ticket.getType());
    }

    @Test
    public void testJsonToTicketSubject() {
        String subject = "A Catastrophe in Korea (North)";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"" + subject + "\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(subject, ticket.getSubject());
    }

    @Test
    public void testJsonToTicketDescription() {
        String description = "Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"\",\n" +
                        "    \"description\": \"" + description + "\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(description, ticket.getDescription());
    }

    @Test
    public void testJsonToTicketPriority() {
        String priority = "high";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"\",\n" +
                        "    \"description\": \"\",\n" +
                        "    \"priority\": \"" + priority + "\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(priority, ticket.getPriority());
    }

    @Test
    public void testJsonToTicketStatus() {
        String status = "pending";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"\",\n" +
                        "    \"description\": \"\",\n" +
                        "    \"priority\": \"\",\n" +
                        "    \"status\": \"" + status + "\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(status, ticket.getStatus());
    }

    @Test
    public void testJsonToTicketSubmitterID() {
        int submitterID = 38;

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"\",\n" +
                        "    \"description\": \"\",\n" +
                        "    \"priority\": \"\",\n" +
                        "    \"status\": \"\",\n" +
                        "    \"submitter_id\": " + submitterID + ",\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(submitterID, ticket.getSubmitterID());
    }

    @Test
    public void testJsonToTicketAssigneeID() {
        int assigneeID = 24;

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"\",\n" +
                        "    \"type\": \"\",\n" +
                        "    \"subject\": \"\",\n" +
                        "    \"description\": \"\",\n" +
                        "    \"priority\": \"\",\n" +
                        "    \"status\": \"\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": " + assigneeID + ",\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(assigneeID, ticket.getAssigneeID());
    }

    @Test
    public void testJsonToTicketOrganizationID() {
        int organizationID = 119;

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": \"" + organizationID + "\",\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(organizationID, ticket.getOrganizationID());
    }

    @Test
    public void testJsonToTicketHasIncidents() {
        boolean hasIncidents = true;

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 118,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": " + hasIncidents + ",\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertTrue(ticket.hasIncidents());
    }

    @Test
    public void testJsonToTicketDueAt() {
        String dueAt = "2016-07-31T02:37:50 -10:00";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 118,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"" + dueAt + "\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(dueAt, ticket.getDueAt());
    }

    @Test
    public void testJsonToTicketVia() {
        String via = "web";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 118,\n" +
                        "    \"tags\": [\n" +
                        "      \"Ohio\",\n" +
                        "      \"Pennsylvania\",\n" +
                        "      \"American Samoa\",\n" +
                        "      \"Northern Mariana Islands\"\n" +
                        "    ],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"\",\n" +
                        "    \"via\": \"" + via + "\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(via, ticket.getVia());
    }

    @Test
    public void testJsonToTicketTags() {
        String tag = "Ohio";

        String jsonString =
                "  {\n" +
                        "    \"_id\": \"436bf9b0-1147-4c0a-8439-6f79833bff5b\",\n" +
                        "    \"url\": \"http://initech.zendesk.com/api/v2/tickets/436bf9b0-1147-4c0a-8439-6f79833bff5b.json\",\n" +
                        "    \"external_id\": \"9210cdc9-4bee-485f-a078-35396cd74063\",\n" +
                        "    \"created_at\": \"2016-04-28T11:19:34 -10:00\",\n" +
                        "    \"type\": \"incident\",\n" +
                        "    \"subject\": \"A Catastrophe in Korea (North)\",\n" +
                        "    \"description\": \"Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.\",\n" +
                        "    \"priority\": \"high\",\n" +
                        "    \"status\": \"pending\",\n" +
                        "    \"submitter_id\": 38,\n" +
                        "    \"assignee_id\": 24,\n" +
                        "    \"organization_id\": 116,\n" +
                        "    \"tags\": [" + tag + "],\n" +
                        "    \"has_incidents\": false,\n" +
                        "    \"due_at\": \"2016-07-31T02:37:50 -10:00\",\n" +
                        "    \"via\": \"web\"\n" +
                        "  }";

        Gson gson = new Gson();

        Ticket ticket = gson.fromJson(jsonString, Ticket.class);
        Assert.assertEquals(tag, ticket.getTags()[0]);
    }
}
