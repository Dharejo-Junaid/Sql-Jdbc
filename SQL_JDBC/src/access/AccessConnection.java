package access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessConnection {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {

        if(connection != null) {
            return connection;
        }

        String accessDBFilePath = "my_access_database.accdb";
        String url="jdbc:ucanaccess://" + accessDBFilePath;
        String user="Junaid";
        String password="123456";

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
