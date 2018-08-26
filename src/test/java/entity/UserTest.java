package entity;

import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserTest extends TestCase {
    @Test
    public void testJsonToUserID() {
        int id = 101;
        String jsonString = "{\n" +
                "    \"_id\": " + id + ",\n" +
                "    \"url\": \"http://initech.zendesk.com/api/v2/users/1.json\",\n" +
                "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                "    \"name\": \"\",\n" +
                "    \"alias\": \"Miss Coffey\",\n" +
                "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                "    \"active\": true,\n" +
                "    \"verified\": true,\n" +
                "    \"shared\": false,\n" +
                "    \"locale\": \"en-AU\",\n" +
                "    \"timezone\": \"Sri Lanka\",\n" +
                "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                "    \"phone\": \"8335-422-718\",\n" +
                "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                "    \"user_id\": 119,\n" +
                "    \"tags\": [\n" +
                "      \"Springville\",\n" +
                "      \"Sutton\",\n" +
                "      \"Hartsville/Hartley\",\n" +
                "      \"Diaperville\"\n" +
                "    ],\n" +
                "    \"suspended\": true,\n" +
                "    \"role\": \"admin\"\n" +
                "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(id, user.getID());
    }

    @Test
    public void testJsonToUserURL() {
        String url = "http://initech.zendesk.com/api/v2/users/101.json";

        String jsonString = "{\n" +
                "    \"_id\": 1,\n" +
                "    \"url\": \"" + url + "\",\n" +
                "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                "    \"name\": \"\",\n" +
                "    \"alias\": \"Miss Coffey\",\n" +
                "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                "    \"active\": true,\n" +
                "    \"verified\": true,\n" +
                "    \"shared\": false,\n" +
                "    \"locale\": \"en-AU\",\n" +
                "    \"timezone\": \"Sri Lanka\",\n" +
                "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                "    \"phone\": \"8335-422-718\",\n" +
                "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                "    \"user_id\": 119,\n" +
                "    \"tags\": [\n" +
                "      \"Springville\",\n" +
                "      \"Sutton\",\n" +
                "      \"Hartsville/Hartley\",\n" +
                "      \"Diaperville\"\n" +
                "    ],\n" +
                "    \"suspended\": true,\n" +
                "    \"role\": \"admin\"\n" +
                "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(url, user.getUrl());
    }

    @Test
    public void testJsonToUserExternalID() {
        String externalID = "9270ed79-35eb-4a38-a46f-35725197ea8d";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"" + externalID + "\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": true,\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"user_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(externalID, user.getExternalID());
    }

    @Test
    public void testJsonToUserName() {
        String name = "Cross Barlow";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"" + name + "\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": true,\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(name, user.getName());
    }

    @Test
    public void testJsonToUserAlias() {
        String alias = "Miss Coffey";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"" + alias + "\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": true,\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(alias, user.getAlias());
    }

    @Test
    public void testJsonToUserCreatedAt() {
        String createdAt = "2016-05-21T11:10:28 -10:00";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"" + createdAt + "\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": true,\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(createdAt, user.getCreatedAt());
    }

    @Test
    public void testJsonToUserActive() {
        String active = "true";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": \"" + active + "\",\n" +
                        "    \"verified\": true,\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertTrue(user.isActive());
    }

    @Test
    public void testJsonToUserVerified() {
        String verified = "true";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"" + verified + "\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertTrue(user.isVerified());
    }

    @Test
    public void testJsonToUserShared() {
        String shared = "true";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": \"" + shared + "\",\n" +
                        "    \"locale\": \"en-AU\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertTrue(user.isShared());
    }

    @Test
    public void testJsonToUserLocale() {
        String locale = "en-AU";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"" + locale + "\",\n" +
                        "    \"timezone\": \"Sri Lanka\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(locale, user.getLocale());
    }

    @Test
    public void testJsonToUserTimeZone() {
        String timezone = "Sri Lanka";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"" + timezone + "\",\n" +
                        "    \"last_login_at\": \"2013-08-04T01:03:27 -10:00\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(timezone, user.getTimezone());
    }

    @Test
    public void testJsonToUserLastLogin() {
        String lastLogin = "2013-08-04T01:03:27 -10:00";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"" + lastLogin + "\",\n" +
                        "    \"email\": \"coffeyrasmussen@flotonic.com\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(lastLogin, user.getLastLoginAt());
    }

    @Test
    public void testJsonToUserEmail() {
        String email = "coffeyrasmussen@flotonic.com";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"" + email + "\",\n" +
                        "    \"phone\": \"8335-422-718\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(email, user.getEmail());
    }

    @Test
    public void testJsonToUserPhone() {
        String phone = "8335-422-718";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"" + phone + "\",\n" +
                        "    \"signature\": \"Don't Worry Be Happy!\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(phone, user.getPhone());
    }

    @Test
    public void testJsonToUserSignature() {
        String signature = "Don't Worry Be Happy!";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"signature\": \"" + signature + "\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(signature, user.getSignature());
    }

    @Test
    public void testJsonToUserOrganizationID() {
        int organizationID = 119;

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"signature\": \"\",\n" +
                        "    \"organization_id\": \"" + organizationID + "\",\n" +
                        "    \"tags\": [\n" +
                        "      \"Springville\",\n" +
                        "      \"Sutton\",\n" +
                        "      \"Hartsville/Hartley\",\n" +
                        "      \"Diaperville\"\n" +
                        "    ],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(organizationID, user.getOrganizationID());
    }

    @Test
    public void testJsonToUserTags() {
        String tag = "Springville";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"signature\": \"\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [" + tag + "],\n" +
                        "    \"suspended\": true,\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(tag, user.getTags()[0]);
    }

    @Test
    public void testJsonToUserSuspended() {
        String suspended = "false";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"signature\": \"\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [],\n" +
                        "    \"suspended\": \"" + suspended + "\",\n" +
                        "    \"role\": \"admin\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertFalse(user.isSuspended());
    }

    @Test
    public void testJsonToUserRole() {
        String role = "admin";

        String jsonString =
                "{\n" +
                        "    \"_id\": 1,\n" +
                        "    \"url\": \"\",\n" +
                        "    \"external_id\": \"74341f74-9c79-49d5-9611-87ef9b6eb75f\",\n" +
                        "    \"name\": \"\",\n" +
                        "    \"alias\": \"Miss Coffey\",\n" +
                        "    \"created_at\": \"2016-04-15T05:19:46 -10:00\",\n" +
                        "    \"active\": true,\n" +
                        "    \"verified\": \"\",\n" +
                        "    \"shared\": false,\n" +
                        "    \"locale\": \"\",\n" +
                        "    \"timezone\": \"\",\n" +
                        "    \"last_login_at\": \"\",\n" +
                        "    \"email\": \"\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"signature\": \"\",\n" +
                        "    \"organization_id\": 119,\n" +
                        "    \"tags\": [],\n" +
                        "    \"suspended\": \"false\",\n" +
                        "    \"role\": \"" + role + "\"\n" +
                        "  }";

        Gson gson = new Gson();

        User user = gson.fromJson(jsonString, User.class);
        Assert.assertEquals(role, user.getRole());
    }
}
