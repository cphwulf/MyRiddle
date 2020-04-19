package Util;
import java.sql.Connection;
import java.sql.SQLDataException;

public class DBConnector {

    private static DBConnector instance;

    // private constructor
    private DBConnector() {
        // url
        // credentials
        // database
        


    }

    public static DBConnector getInstance() {
        if (instance == null) {
            instance = new DBConnector();
        }
        return instance;
    }
    // static get instans


}
