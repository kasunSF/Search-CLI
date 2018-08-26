package data;

import com.google.gson.internal.LinkedTreeMap;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DataStorageTest extends TestCase {
    private DataStorage dataStorage;

    @Override
    protected void setUp() {
        dataStorage = new DataStorage();
    }

    @Test
    public void testAddDataString() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        String value = "Test value";
        testDataMap.put(key, value);
        testDataList.add(testDataMap);

        dataStorage.addData(entityName, testDataList);
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsKey(key));
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsValue(value));
    }

    @Test
    public void testAddDataInteger() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        Integer value = 117;
        testDataMap.put(key, value);
        testDataList.add(testDataMap);

        dataStorage.addData(entityName, testDataList);
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsKey(key));
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsValue(value));
    }

    @Test
    public void testAddDataBoolean() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        Boolean value = Boolean.TRUE;
        testDataMap.put(key, value);
        testDataList.add(testDataMap);

        dataStorage.addData(entityName, testDataList);
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsKey(key));
        Assert.assertTrue(dataStorage.getArrayListOfData().get(0).get(0).containsValue(value));
    }

    @Test
    public void testSearchFullValueMatch() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        String value = "Test value";
        testDataMap.put(key, value);
        testDataList.add(testDataMap);
        dataStorage.addData(entityName, testDataList);

        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> result = dataStorage.search(key, value);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testSearchPartialValueMatch() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        String value = "Test value";
        testDataMap.put(key, value);
        testDataList.add(testDataMap);
        dataStorage.addData(entityName, testDataList);

        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> result = dataStorage.search(key, value.substring(3));
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testSearchEmptyValueMatch() {
        List<LinkedTreeMap<String, Object>> testDataList = new ArrayList<>();
        String entityName = "TestEntity";
        LinkedTreeMap<String, Object> testDataMap = new LinkedTreeMap<>();
        String key = "Test key";
        String value = "";
        testDataMap.put(key, value);
        testDataList.add(testDataMap);
        dataStorage.addData(entityName, testDataList);

        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> result = dataStorage.search(key, value);
        Assert.assertEquals(1, result.size());
    }
}
