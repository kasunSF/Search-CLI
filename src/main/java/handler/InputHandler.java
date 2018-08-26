package handler;

import com.google.gson.internal.LinkedTreeMap;
import data.DataStorage;
import def.Constants;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * This is to handle user inputs
 */
public class InputHandler {
    private DataStorage dataStorage;
    private SearchResultHandler searchResultHandler;

    /**
     * @param dataStorage         In memory data storage
     * @param searchResultHandler Search result handler
     */
    public InputHandler(DataStorage dataStorage, SearchResultHandler searchResultHandler) {
        this.dataStorage = dataStorage;
        this.searchResultHandler = searchResultHandler;
    }

    /**
     * Process user input and send returned results to the search resulthandler
     *
     * @param input User input in string format
     * @return True if user's input is valid. Otherwise returns false.
     */
    public boolean handleInput(String input) {
        String[] tokens = input.split(Constants.INPUT_TOKEN_DELIMITER);
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> searchResult;

        String searchKey = tokens[Constants.KEY_INDEX].trim();
        String searchValue;

        if (tokens.length < Constants.SEARCH_TOKEN_COUNT) {
            searchValue = Constants.EMPTY_STRING;
        } else {
            searchValue = tokens[Constants.VALUE_INDEX].trim();
        }

        searchResult = dataStorage.search(searchKey, searchValue);
        return searchResultHandler.handleSearchResult(searchResult);
    }
}
