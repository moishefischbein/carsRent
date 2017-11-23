package com.example.moish.carrentforcompany.model.datasource;

import android.content.ContentValues;

import com.example.moish.carrentforcompany.model.backend.DB_manager;
import com.example.moish.carrentforcompany.model.backend.Functions;
import com.example.moish.carrentforcompany.model.entities.Branch;
import com.example.moish.carrentforcompany.model.entities.Car;
import com.example.moish.carrentforcompany.model.entities.CarModel;
import com.example.moish.carrentforcompany.model.entities.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static android.R.id.list;

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

    public boolean isThisClientExist(long id)
    {

        //if exist this Client in the List of clients
        for (Iterator<Client> iter = clients.iterator(); iter.hasNext(); ) {
            Client element = iter.next();
            if(element.getId()== id);

            return true;
        }
        return false;

    }
    @Override
    public long addClient(ContentValues client) {

        boolean isExistThisClient = isThisClientExist(Functions.contentValuesToClient(client).getId());
        if(isExistThisClient == false)
        {
          clients.add(Functions.contentValuesToClient(client));
          return Functions.contentValuesToClient(client).getId();
        }
     return 0;
    }


    @Override
    public boolean removeClient(long id) {

        for (Iterator<Client> iter = clients.iterator(); iter.hasNext(); ) {
            Client element = iter.next();
            if(element.getId()== id);

            iter.remove();
            return true;
        }
        return false;
    }

    @Override
    public boolean updateClient(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<Client> getClients() {
        return clients;
    }

    @Override
    public long addCarModel(ContentValues carModel) {

        carModels.add((Functions.contentValuesToCarModel(carModel)));
        return Functions.contentValuesToCarModel(carModel).getModelCode();
    }

    @Override
    public boolean removeCarModel(long id) {
        for (CarModel item : carModels) {
            if(item.getModelCode() == id) {
                carModels.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateCarModel(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<CarModel> getCarModels() {
        return carModels;
    }

    @Override
    public long addBranch(ContentValues branch) {

        branches.add(Functions.contentValuesToBranch(branch));
        return Functions.contentValuesToBranch(branch).getBranchNumber();
    }

    @Override
    public boolean removeBranch(long id) {

        for (Branch item : branches) {
            if(item.getBranchNumber() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateBranch(long id, ContentValues values) {
        return false;
    }

    @Override
    public List<Branch> getBranchs() {
      return branches;
    }
}


