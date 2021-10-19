package databaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerDatabaseAccess {
    private static Connection connection;

    public CustomerDatabaseAccess() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "13811383");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
