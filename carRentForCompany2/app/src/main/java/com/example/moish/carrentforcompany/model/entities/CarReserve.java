package com.example.moish.carrentforcompany.model.entities;

import java.util.Calendar;

/**
 * Created by Daniel on 14/11/2017.
 */

public class CarReserve {

    int clientNumber;
    boolean isOpened;
    int carNumber;
    String rentBegginingDate;
    String rentEndDate;
    double startKilometers;
    double endKilometers;
    boolean isFueled;
    int litersFueled;
    double totalToPay;
    int reserveNumber_id;

    public CarReserve(int clientNumber, boolean isOpened, int carNumber, String rentBegginingDate,
                      String rentEndDate, double startKilometers, double endKilometers, boolean isFueled,
                      int litersFueled, double totalToPay, int reserveNumber_id) {

        this.clientNumber = clientNumber;
        this.isOpened = isOpened;
        this.carNumber = carNumber;
        this.rentBegginingDate = rentBegginingDate;
        this.rentEndDate = rentEndDate;
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.isFueled = isFueled;
        this.litersFueled = litersFueled;
        this.totalToPay = totalToPay;
        this.reserveNumber_id = reserveNumber_id;
    }
    public CarReserve(int clientNumber, boolean isOpened, int carNumber, String rentBegginingDate,
                      String rentEndDate, double startKilometers, double endKilometers,
                      boolean isFueled, double totalToPay, int reserveNumber_id) throws Exception {

        if (isFueled == true)
            throw new Exception("you forgot to write how many liters you put");

        this.clientNumber = clientNumber;
        this.isOpened = isOpened;
        this.carNumber = carNumber;
        this.rentBegginingDate = rentBegginingDate;
        this.rentEndDate = rentEndDate;
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.isFueled = false;
        this.totalToPay = totalToPay;
        this.reserveNumber_id = reserveNumber_id;
        this.litersFueled = 0;
    }

    public CarReserve() {
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getRentBegginingDate() {
        return rentBegginingDate;
    }

    public void setRentBegginingDate(String rentBegginingDate) {
        this.rentBegginingDate = rentBegginingDate;
    }

    public String getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(String rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public boolean isFueled() {
        return isFueled;
    }

    public void setFueled(boolean fueled) {
        isFueled = fueled;
    }

    public int getLitersFueled() {
        return litersFueled;
    }

    public void setLitersFueled(int litersFueled) {
        this.litersFueled = litersFueled;
    }

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }

    public int getReserveNumber_id() {
        return reserveNumber_id;
    }

    public void setReserveNumber_id(int reserveNumber_id) {
        this.reserveNumber_id = reserveNumber_id;
    }
}