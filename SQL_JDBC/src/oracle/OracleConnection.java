package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {

        if(connection != null) {
            return connection;
        }

        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="Junaid";
        String password="123456";

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
