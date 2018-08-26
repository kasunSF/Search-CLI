package handler;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import def.Constants;
import entity.Organization;
import entity.Ticket;
import entity.User;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * This class processes search results
 */
public class SearchResultHandler {
    /**
     * Process search result and display in human readable format
     *
     * @param searchResult Search result
     * @return True if search result is successfully processed. Otherwise returns false.
     */
    public boolean handleSearchResult(LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> searchResult) {
        boolean status = true;

        System.out.println("------------ Search Results ------------\n");

        for (String key : searchResult.keySet()) {
            List<LinkedTreeMap<String, Object>> resultList = searchResult.get(key);

            System.out.printf("------ Result count: %s[%d]\n", key, resultList.size());

            for (LinkedTreeMap<String, Object> mapEntry : resultList) {
                status = status && showResult(key, mapEntry);
            }
        }

        return status;
    }

    /**
     * Display search result on stdout
     *
     * @param entityName Name of the entity
     * @param mapEntry   Entry of search result map
     * @return True if result is successfully shown on stdout. Otherwise returns false
     */
    private boolean showResult(String entityName, LinkedTreeMap<String, Object> mapEntry) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.toJsonTree(mapEntry).getAsJsonObject();
        boolean status = true;

        switch (entityName) {
            case Constants.ENTITY_NAME_ORGANIZATION:
                gson.fromJson(jsonObject, Organization.class).show();
                break;
            case Constants.ENTITY_NAME_TICKET:
                gson.fromJson(jsonObject.toString(), Ticket.class).show();
                break;
            case Constants.ENTITY_NAME_USER:
                gson.fromJson(jsonObject.toString(), User.class).show();
                break;
            default:
                status = false;
                break;
        }

        return status;
    }
}
