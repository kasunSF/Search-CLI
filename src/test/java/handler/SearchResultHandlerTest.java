package handler;

import com.google.gson.internal.LinkedTreeMap;
import def.Constants;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SearchResultHandlerTest extends TestCase {
    private SearchResultHandler searchResultHandler;

    @Override
    protected void setUp() {
        searchResultHandler = new SearchResultHandler();
    }

    @Test
    public void testHandleSearchResultOrganization() {
        LinkedTreeMap<String, Object> linkedTreeMap = new LinkedTreeMap<>();
        linkedTreeMap.put("_id", 101);
        linkedTreeMap.put("domain_names", new String[]{"kage.com"});
        linkedTreeMap.put("tags", new String[]{"Fulton"});
        List<LinkedTreeMap<String, Object>> linkedTreeMapList = new ArrayList<>();
        linkedTreeMapList.add(linkedTreeMap);
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> testSearchResult = new LinkedHashMap<>();
        testSearchResult.put(Constants.ENTITY_NAME_ORGANIZATION, linkedTreeMapList);

        boolean status = searchResultHandler.handleSearchResult(testSearchResult);
        Assert.assertTrue(status);
    }

    @Test
    public void testHandleSearchResultTicket() {
        LinkedTreeMap<String, Object> linkedTreeMap = new LinkedTreeMap<>();
        linkedTreeMap.put("tags", new String[]{"Ohio"});
        List<LinkedTreeMap<String, Object>> linkedTreeMapList = new ArrayList<>();
        linkedTreeMapList.add(linkedTreeMap);
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> testSearchResult = new LinkedHashMap<>();
        testSearchResult.put(Constants.ENTITY_NAME_TICKET, linkedTreeMapList);

        boolean status = searchResultHandler.handleSearchResult(testSearchResult);
        Assert.assertTrue(status);
    }

    @Test
    public void testHandleSearchResultUser() {
        LinkedTreeMap<String, Object> linkedTreeMap = new LinkedTreeMap<>();
        linkedTreeMap.put("tags", new String[]{"Springville"});
        List<LinkedTreeMap<String, Object>> linkedTreeMapList = new ArrayList<>();
        linkedTreeMapList.add(linkedTreeMap);
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> testSearchResult = new LinkedHashMap<>();
        testSearchResult.put(Constants.ENTITY_NAME_USER, linkedTreeMapList);

        boolean status = searchResultHandler.handleSearchResult(testSearchResult);
        Assert.assertTrue(status);
    }
}
