package handler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

/**
 * This class processes json file
 *
 * @param <T>
 */
public class JsonFileHandler<T> {
    /**
     * Read json file and return results
     *
     * @param fileName Location of json file
     * @return List<T> contains file content
     */
    public List<T> readFile(String fileName) {
        Type type = new TypeToken<List<T>>() {
        }.getType();

        JsonReader jsonReader = null;

        try {
            jsonReader = new JsonReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        return gson.fromJson(jsonReader, type);
    }
}
