package runner;

import cfg.ConfigManagerTest;
import data.DataLoaderTest;
import data.DataStorageTest;
import entity.OrganizationTest;
import entity.TicketTest;
import entity.UserTest;
import handler.InputHandlerTest;
import handler.JsonFileHandlerTest;
import handler.SearchResultHandlerTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        runConfigManagerTest();
        runDataLoaderTest();
        runDataStorageTest();
        runOrganizationTest();
        runTicketTest();
        runUserTest();
        runInputHandlerTest();
        runJsonFileHandlerTest();
        runSearchResultHandlerTest();
    }

    private static void runConfigManagerTest() {
        Result result = JUnitCore.runClasses(ConfigManagerTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("ConfigManagerTest: \t Pass");
        }
    }

    private static void runDataLoaderTest() {
        Result result = JUnitCore.runClasses(DataLoaderTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("DataLoaderTest: \t Pass");
        }
    }

    private static void runDataStorageTest() {
        Result result = JUnitCore.runClasses(DataStorageTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("DataStorageTest: \t Pass");
        }
    }

    private static void runOrganizationTest() {
        Result result = JUnitCore.runClasses(OrganizationTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("OrganizationTest: \t Pass");
        }
    }

    private static void runTicketTest() {
        Result result = JUnitCore.runClasses(TicketTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("TicketTest: \t Pass");
        }
    }

    private static void runUserTest() {
        Result result = JUnitCore.runClasses(UserTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("UserTest: \t Pass");
        }
    }

    private static void runInputHandlerTest() {
        Result result = JUnitCore.runClasses(InputHandlerTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("InputHandlerTest: \t Pass");
        }
    }

    private static void runJsonFileHandlerTest() {
        Result result = JUnitCore.runClasses(JsonFileHandlerTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("JsonFileHandlerTest: \t Pass");
        }
    }

    private static void runSearchResultHandlerTest() {
        Result result = JUnitCore.runClasses(SearchResultHandlerTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("SearchResultHandlerTest: \t Pass");
        }
    }
}