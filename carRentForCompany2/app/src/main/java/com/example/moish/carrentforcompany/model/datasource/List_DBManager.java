package com.example.moish.carrentforcompany.model.datasource;

import android.content.ContentValues;

import com.example.moish.carrentforcompany.model.backend.DB_manager;
import com.example.moish.carrentforcompany.model.backend.Functions;
import com.example.moish.carrentforcompany.model.entities.Branch;
import com.example.moish.carrentforcompany.model.entities.CarModel;
import com.example.moish.carrentforcompany.model.entities.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moish on 16/11/2017.
 */


    public class  List_DBManager implements DB_manager {

    static List<Client> clients;
    static List<CarModel> carModels;
    static List<Branch> branches;

    static {
        clients = new ArrayList<>();
        carModels = new ArrayList<>();
        branches = new ArrayList<>();
    }


    @Override
    public long addClient(ContentValues client) {

        clients.add(Functions.contentValuesToClient(client));
        return Functions.contentValuesToClient(client).getId();
    }

    @Override
    public boolean removeClient(long id) {
        return false;
    }

    @Override
    public boolean updateClient(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<Client> getClients() {
        return null;
    }

    @Override
    public long addCarModel(ContentValues carModel) {
        return 0;
    }

    @Override
    public boolean removeCarModel(long id) {
        return false;
    }

    @Override
    public boolean updateCarModel(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<CarModel> getCarModels() {
        return null;
    }

    @Override
    public long addBranch(ContentValues branch) {
        return 0;
    }

    @Override
    public boolean removeBranch(long id) {
        return false;
    }

    @Override
    public boolean updateBranch(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<Branch> getBranchs() {
        return null;
    }
}


