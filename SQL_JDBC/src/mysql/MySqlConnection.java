package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {

        if(connection != null) {
            return connection;
        }

        String databaseName = "my_database";
        String url="jdbc:mysql://localhost:3306/" + databaseName;
        String user="Junaid";
        String password="123456";

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
