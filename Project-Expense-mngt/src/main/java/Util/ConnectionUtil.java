package Util;

import Constants.ExpenseConstants;
import Model.Expense;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Constants.ExpenseConstants.*;

public class ConnectionUtil {

    @Getter
    private static Connection connection;
    static {
        try {
            Class.forName(ExpenseConstants.MYSQL_DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class Not Found");
        } catch (SQLException e) {
            System.out.println("Invalid Credentials");
        }
    }

}