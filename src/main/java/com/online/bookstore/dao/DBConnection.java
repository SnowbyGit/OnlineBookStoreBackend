package com.online.bookstore.dao;

import com.online.bookstore.util.DBUtil;

public class DBConnection {

    public static DBUtil DB = new DBUtil();

    public static DBUtil dbConnection() {
        return DB;
    }

}
