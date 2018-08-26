package data;

import com.google.gson.internal.LinkedTreeMap;
import handler.JsonFileHandler;

import java.util.List;

/**
 * This class loads information from JSON files in to the memory
 */
public class DataLoader {
    private DataStorage dataStorage;
    private JsonFileHandler<LinkedTreeMap<String, Object>> fileHandler;

    /**
     * @param fileHandler JSON file handler
     * @param dataStorage Data storage
     */
    public DataLoader(JsonFileHandler<LinkedTreeMap<String, Object>> fileHandler, DataStorage dataStorage) {
        this.fileHandler = fileHandler;
        this.dataStorage = dataStorage;
    }

    /**
     * @param entityName Name of the entity of loading data
     * @param fileName   Path to file that contains data
     */
    public void loadData(String entityName, String fileName) {
        List<LinkedTreeMap<String, Object>> listOfData = fileHandler.readFile(fileName);
        dataStorage.addData(entityName, listOfData);
    }
}
