import cfg.ConfigManager;
import com.google.gson.internal.LinkedTreeMap;
import data.DataLoader;
import data.DataStorage;
import def.Constants;
import handler.InputHandler;
import handler.JsonFileHandler;
import handler.SearchResultHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.init();

        JsonFileHandler<LinkedTreeMap<String, Object>> fileHandler = new JsonFileHandler<>();
        DataStorage dataStorage = new DataStorage();
        DataLoader dataLoader = new DataLoader(fileHandler, dataStorage);
        SearchResultHandler searchResultHandler = new SearchResultHandler();
        InputHandler inputHandler = new InputHandler(dataStorage, searchResultHandler);

        loadData(dataLoader, configManager);
        readInput(inputHandler);
    }

    private static void loadData(DataLoader dataLoader, ConfigManager configManager) {
        dataLoader.loadData(Constants.ENTITY_NAME_ORGANIZATION, configManager.getOrganizationFileLocation());
        dataLoader.loadData(Constants.ENTITY_NAME_TICKET, configManager.getTicketFileLocation());
        dataLoader.loadData(Constants.ENTITY_NAME_USER, configManager.getUserFileLocation());
    }

    private static void readInput(InputHandler inputHandler) throws IOException {
        System.out.println("Please enter search query in filed=value format. To exit, enter '#'");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = bufferedReader.readLine()) != null && !input.equalsIgnoreCase(Constants.INPUT_TERMINATOR)) {
            if (input.length() == 0 || input.contains("//")) {//Skip comments and empty lines
                continue;
            }

            if (!inputHandler.handleInput(input)) {
                System.out.println("[ERROR] Failed to interpret user input");
            }
        }

        bufferedReader.close();
    }
}