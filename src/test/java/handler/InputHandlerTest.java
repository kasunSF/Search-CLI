package handler;

import com.google.gson.internal.LinkedTreeMap;
import data.DataStorage;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedHashMap;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class InputHandlerTest extends TestCase {
    @InjectMocks
    private InputHandler inputHandler;
    @Mock
    private DataStorage dataStorageMock;
    @Mock
    private SearchResultHandler searchResultHandlerMock;

    @Override
    protected void setUp() {
        inputHandler = new InputHandler(dataStorageMock, searchResultHandlerMock);
    }

    @Test
    public void testHandleInputSuccess() {
        String key = "TestSearchKey";
        String value = "TestSearchValue";
        String input = key + " = " + value;
        int expectedInvocationCount = 1;
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> searchResult = new LinkedHashMap<>();

        when(dataStorageMock.search(key, value)).thenReturn(searchResult);
        when(searchResultHandlerMock.handleSearchResult(searchResult)).thenReturn(true);

        Assert.assertTrue(inputHandler.handleInput(input));
        verify(dataStorageMock, times(expectedInvocationCount)).search(key, value);
        verify(searchResultHandlerMock, times(expectedInvocationCount)).handleSearchResult(searchResult);
    }

    @Test
    public void testHandleInputFailure() {
        String key = "TestSearchKey";
        String value = "TestSearchValue";
        String input = key + " = " + value;
        int expectedInvocationCount = 1;
        LinkedHashMap<String, List<LinkedTreeMap<String, Object>>> searchResult = new LinkedHashMap<>();

        when(dataStorageMock.search(key, value)).thenReturn(searchResult);
        when(searchResultHandlerMock.handleSearchResult(searchResult)).thenReturn(false);

        Assert.assertFalse(inputHandler.handleInput(input));
        verify(dataStorageMock, times(expectedInvocationCount)).search(key, value);
        verify(searchResultHandlerMock, times(expectedInvocationCount)).handleSearchResult(searchResult);
    }
}
