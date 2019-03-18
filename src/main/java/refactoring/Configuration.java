package refactoring;

// This class simulates a framework deep configuration class, static and untouchable.
public class Configuration {
    static String getPropertyFromDatabase(String parameter) {
        // connect to database
        // ...
        // value = connection.fetch(parameter)

        return "some_value_for_" + parameter;
    }
}
