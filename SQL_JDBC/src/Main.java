import mysql.MySqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        // Using MySQL database connection;
        Connection connection = MySqlConnection.getConnection();

        // Create statement to run SQL-Command (Query)
        Statement statement = connection.createStatement();

        // Get all data from my_table;
        String sql = "SELECT * FROM my_table";

        // executeQuery returns obj of ResultSet which has all data in it;
        ResultSet result = statement.executeQuery(sql);

        // print all data of table on console;
        while (result.next()) {
            System.out.println(
                    result.getInt(1) + "\t"
                    + result.getString(2)
            );
        }

    }
}