package com.online.bookstore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.online.bookstore.constant.ResponseCode;
import com.online.bookstore.entity.BookStoreException;



public class DBUtil {

    private static Connection connection;

    static {

        try {

            Class.forName(DatabaseConfig.DRIVER_NAME);
            
            connection = DriverManager.getConnection(DatabaseConfig.CONNECTION_STRING, DatabaseConfig.DB_USER_NAME,
                    DatabaseConfig.DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();

        }

    }// End of static block

    public static Connection getConnection() throws BookStoreException {

        if (connection == null) {
            throw new BookStoreException(ResponseCode.DATABASE_CONNECTION_FAILURE);
        }

        return connection;
    }

}
