package handler;

import com.google.gson.internal.LinkedTreeMap;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileHandlerTest extends TestCase {
    private JsonFileHandler<LinkedTreeMap<String, Object>> fileHandler;
    private String testFileName = "test.json";

    @Override
    protected void setUp() {
        fileHandler = new JsonFileHandler<>();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(testFileName));
            String jsonString = "[\n" +
                    "  {\n" +
                    "    \"_id\": 101,\n" +
                    "    \"url\": \"http://initech.zendesk.com/api/v2/organizations/101.json\",\n" +
                    "    \"external_id\": \"9270ed79-35eb-4a38-a46f-35725197ea8d\",\n" +
                    "    \"name\": \"Enthaze\",\n" +
                    "    \"domain_names\": [\n" +
                    "      \"kage.com\",\n" +
                    "      \"ecratic.com\",\n" +
                    "      \"endipin.com\",\n" +
                    "      \"zentix.com\"\n" +
                    "    ],\n" +
                    "    \"created_at\": \"2016-05-21T11:10:28 -10:00\",\n" +
                    "    \"details\": \"MegaCorp\",\n" +
                    "    \"shared_tickets\": false,\n" +
                    "    \"tags\": [\n" +
                    "      \"Fulton\",\n" +
                    "      \"West\",\n" +
                    "      \"Rodriguez\",\n" +
                    "      \"Farley\"\n" +
                    "    ]\n" +
                    "  }\n" +
                    "]\n";

            bufferedWriter.write(jsonString);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void tearDown() {
        File file = new File(testFileName);
        if (file.exists()) {
            file.deleteOnExit();
        }
    }

    @Test
    public void testReadFile() {
        List<LinkedTreeMap<String, Object>> fileContent = fileHandler.readFile(testFileName);
        Assert.assertNotNull(fileContent);
    }
}
