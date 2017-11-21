package com.example.moish.carrentforcompany.model.backend;

import android.content.ContentValues;

import com.example.moish.carrentforcompany.model.entities.CarModel;
import com.example.moish.carrentforcompany.model.entities.Client;

/**
 * Created by moish on 16/11/2017.
 */

public class Functions {

    public static class ClientConst {
        public static final String ID = "_id";
        public static final String FIRSTNAME = "firtsname";
        public static final String LASTTNAME = "lastname";
        public static final String PHONE = "phone";
        public static final String EMAIL = "email";
        public static final String CREDITCARDNUMBER = "CreditCardNumber";
    }


    public static class CarModelConst {
        public static final String MODEL_ID = "_ModeId";
        public static final String COMPANY_NAME = "CompanyName";
        public static final String MODEL_NAME = "modelName";
        public static final String ENGINE_VOLUME = "engineVolume";
        public static final String ISAUTOMATIC = "isAutomatic";
        public static final String SEATING = "seating";
    }

    public static ContentValues CarModelToContentValues(CarModel carModel) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(CarModelConst.MODEL_ID, carModel.getModelCode());
        contentValues.put(CarModelConst.COMPANY_NAME, carModel.getCompanyName());
        contentValues.put(CarModelConst.MODEL_NAME, carModel.getModelName());
        contentValues.put(CarModelConst.ENGINE_VOLUME, carModel.getMotorVolume());
        contentValues.put(CarModelConst.ISAUTOMATIC, carModel.getAutomatic());
        contentValues.put(CarModelConst.SEATING, carModel.getNumberOfSeats());

        return contentValues;
    }

    public static ContentValues ClientToContentValues(Client client) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(Functions.ClientConst.ID, client.getId());
        contentValues.put(Functions.ClientConst.FIRSTNAME, client.getFirstName());
        contentValues.put(Functions.ClientConst.LASTTNAME, client.getLastName());
        contentValues.put(Functions.ClientConst.PHONE, client.getPhoneNumber());
        contentValues.put(Functions.ClientConst.EMAIL, client.getEmail());
        contentValues.put(Functions.ClientConst.CREDITCARDNUMBER, client.getCreditCardNumber());

        return contentValues;
    }

    public static Client contentValuesToClient(ContentValues contentValues) {
        Client client = new Client();
        client.setId(contentValues.getAsInteger(ClientConst.ID));
        client.setFirstName(contentValues.getAsString(ClientConst.FIRSTNAME));
        client.setLastName(contentValues.getAsString(ClientConst.LASTTNAME));
        client.setPhoneNumber(contentValues.getAsString(ClientConst.PHONE));
        client.setEmail(contentValues.getAsString(ClientConst.EMAIL));
        client.setCreditCardNumber(contentValues.getAsInteger(ClientConst.CREDITCARDNUMBER));

        return client;
    }


}