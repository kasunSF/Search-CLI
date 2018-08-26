package data;

import com.google.gson.internal.LinkedTreeMap;
import def.Constants;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * This class maintains data from JSON files in memory and facilitate searching data by fields
 */
public class DataStorage {
    private ArrayList<List<LinkedTreeMap<String, Object>>> arrayListOfData;
    private LinkedHashMap<Integer, String> entityMap;
    private int index;

    public DataStorage() {
        arrayListOfData = new ArrayList<>();
        entityMap = new LinkedHashMap<>();
        index = -1;
    }

    /**
     * Add data in to the memory
     *
     * @param entityName Name of the entity
     * @param data       Data to be stored in memory
     */
    public void addData(String entityName, List<LinkedTreeMap<String, Object>> data) {
        arrayListOfData.add(data);
        entityMap.put(++index, entityName);
    }

    /**
     * Search all entities that has given key field and filed value matches(fully or partially) with searching value
     *
     * @param searchKey   Key field of search
     * @param searchValue Searching value of the key field
     * @return Search result as a LinkedHashMap<String, List<LinkedTreeMap<String, Object>>>
     */
    public LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> search(String searchKey, String searchValue) {
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> mapOfResult = new LinkedHashMap<>();

        for (int i = 0; i < arrayListOfData.size(); ++i) {
            List<LinkedTreeMap<String, Object>> dataList = arrayListOfData.get(i);
            List<LinkedTreeMap<String, Object>> listOfLinkedTreeMap = new ArrayList<>();

            for (LinkedTreeMap<String, Object> mapEntry : dataList) {
                if (!mapEntry.containsKey(searchKey)) {//End looping if the entity does not has a filed matches with given key
                    System.out.println("[INFO] " + entityMap.get(i) + " does not have a field as '" + searchKey + "'");
                    break;
                }

                String value = Constants.EMPTY_STRING + mapEntry.get(searchKey);

                if (searchValue.length() == 0) {//Searching for empty values
                    if (value.contentEquals(searchValue)) {
                        listOfLinkedTreeMap.add(mapEntry);
                    }
                } else if (value.toLowerCase().contains(searchValue.toLowerCase())) {
                    listOfLinkedTreeMap.add(mapEntry);
                }
            }

            if (listOfLinkedTreeMap.size() > 0) {//If there exists at least 1 matching result, add it to the map
                mapOfResult.put(entityMap.get(i), listOfLinkedTreeMap);
            }
        }

        return mapOfResult;
    }

    /**
     * @return Data as a ArrayList<List<LinkedTreeMap<String, Object>>>
     */
    ArrayList<List<LinkedTreeMap<String, Object>>> getArrayListOfData() {
        return arrayListOfData;
    }
}
