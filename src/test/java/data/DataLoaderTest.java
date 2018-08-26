package data;

import com.google.gson.internal.LinkedTreeMap;
import handler.JsonFileHandler;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DataLoaderTest extends TestCase {
    @InjectMocks
    private DataLoader dataLoader;
    @Mock
    private DataStorage dataStorageMock;
    @Mock
    private JsonFileHandler<LinkedTreeMap<String, Object>> fileHandlerMock;


    @Override
    protected void setUp() {
        dataLoader = new DataLoader(fileHandlerMock, dataStorageMock);
    }

    @Test
    public void testLoadData() {
        String entityName = "TestEntity";
        String fileName = "TestFileName";
        int expectedInvocationCount = 1;
        List<LinkedTreeMap<String, Object>> fileReadResult = new ArrayList<>();
        when(fileHandlerMock.readFile(fileName)).thenReturn(fileReadResult);

        dataLoader.loadData(entityName, fileName);
        verify(dataStorageMock, times(expectedInvocationCount)).addData(entityName, fileReadResult);
    }
}
