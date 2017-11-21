package com.example.moish.carrentforcompany.model.backend;

import com.example.moish.carrentforcompany.model.datasource.List_DBManager;

/**
 * Created by moish on 16/11/2017.
 */

public class DBManagerFactory {
    static DB_manager manager = null;

    public static DB_manager getManager() {
        if (manager == null)
            manager = new List_DBManager(); //MySQL_DBManager();
        return manager;
    }
}
