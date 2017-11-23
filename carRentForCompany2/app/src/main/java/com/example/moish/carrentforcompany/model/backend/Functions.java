package com.example.moish.carrentforcompany.model.backend;

import android.content.ContentValues;

import com.example.moish.carrentforcompany.model.entities.Car;
import com.example.moish.carrentforcompany.model.entities.CarModel;
import com.example.moish.carrentforcompany.model.entities.CarReserve;
import com.example.moish.carrentforcompany.model.entities.Client;

import java.util.Calendar;

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

    public static class CarConst {
        public static final String CAR_NUMBER = "_id";
        public static final String MODEL = "model";
        public static final String KILOMETERS_TRAVELED = "kilometersTraveled";
        public static final String FIXED_BRANCH = "fixedBranch";
        }

    public static class CarReserveConst {
        public static final String RESERVE_NUMBER  = "_id";
        public static final String CLIENT_NUMBER = "clientNumber";
        public static final String IS_OPENED = "isOpened";
        public static final String RENT_BEGGINING_DATE = "rentBegginingDate";
        public static final String RENT_END_DATE = "rentEndDate";
        public static final String START_KILOMETERS = "startKilometers";
        public static final String END_KILOMETERS = "endKilometers";
        public static final String IS_FUELED = "isFueled";
        public static final String LITERS_FUELED = "litersFueled";
        public static final String TOTAL_TO_PAY = "totalToPay";
        public static final String CAR_NUMBER = "carNumber";
    }
    public static ContentValues CarModelToContentValues(CarModel carModel) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(CarModelConst.MODEL_ID, carModel.getModelCode_id());
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

    public static Car contentValuesToCar(ContentValues car){
        Car theCar = new Car();
        theCar.setCarNumber_id(car.getAsInteger(CarConst.CAR_NUMBER));
        theCar.setFixedBranch(car.getAsInteger(CarConst.FIXED_BRANCH));
        theCar.setKilometersTraveled(car.getAsDouble(CarConst.KILOMETERS_TRAVELED));
        theCar.setModel(car.getAsInteger(CarConst.MODEL));

        return theCar;
    }

    public static ContentValues carToContentValues(Car car) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(CarConst.MODEL, car.getModel());
        contentValues.put(CarConst.KILOMETERS_TRAVELED, car.getKilometersTraveled());
        contentValues.put(CarConst.FIXED_BRANCH , car.getFixedBranch());
        contentValues.put(CarConst.CAR_NUMBER, car.getCarNumber_id());

        return contentValues;
    }

    public static CarReserve contentValuesToCarReserve(ContentValues carReserve){
        CarReserve theCarReserve = new CarReserve();

        theCarReserve.setCarNumber(carReserve.getAsInteger(CarReserveConst.CAR_NUMBER));
        theCarReserve.setClientNumber(carReserve.getAsInteger(CarReserveConst.CLIENT_NUMBER));
        theCarReserve.setEndKilometers(carReserve.getAsDouble(CarReserveConst.END_KILOMETERS));
        theCarReserve.setFueled(carReserve.getAsBoolean(CarReserveConst.IS_FUELED));
        theCarReserve.setLitersFueled(carReserve.getAsInteger(CarReserveConst.LITERS_FUELED));
        theCarReserve.setOpened(carReserve.getAsBoolean(CarReserveConst.IS_OPENED));
        theCarReserve.setRentBegginingDate(carReserve.getAsString(CarReserveConst.RENT_BEGGINING_DATE));
        theCarReserve.setRentEndDate(carReserve.getAsString(CarReserveConst.RENT_END_DATE));
        theCarReserve.setReserveNumber_id(carReserve.getAsInteger(CarReserveConst.RESERVE_NUMBER));
        theCarReserve.setStartKilometers(carReserve.getAsDouble(CarReserveConst.START_KILOMETERS));
        theCarReserve.setTotalToPay(carReserve.getAsDouble(CarReserveConst.TOTAL_TO_PAY));

        return theCarReserve;
    }
    public static ContentValues carReserveToContentValues(CarReserve carReserve) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(CarReserveConst.TOTAL_TO_PAY, carReserve.getTotalToPay());
        contentValues.put(CarReserveConst.START_KILOMETERS, carReserve.getStartKilometers());
        contentValues.put(CarReserveConst.RESERVE_NUMBER, carReserve.getReserveNumber_id());
        contentValues.put(CarReserveConst.RENT_END_DATE, carReserve.getRentEndDate());
        contentValues.put(CarReserveConst.RENT_BEGGINING_DATE, carReserve.getRentBegginingDate());
        contentValues.put(CarReserveConst.IS_OPENED, carReserve.isOpened());
        contentValues.put(CarReserveConst.LITERS_FUELED, carReserve.getLitersFueled());
        contentValues.put(CarReserveConst.IS_FUELED, carReserve.isFueled());
        contentValues.put(CarReserveConst.END_KILOMETERS, carReserve.getEndKilometers());
        contentValues.put(CarReserveConst.CLIENT_NUMBER, carReserve.getClientNumber());
        contentValues.put(CarReserveConst.CAR_NUMBER, carReserve.getCarNumber());

        return contentValues;
    }


}