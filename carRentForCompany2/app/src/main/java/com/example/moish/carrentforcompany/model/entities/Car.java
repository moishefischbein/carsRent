package com.example.moish.carrentforcompany.model.entities;

/**
 * Created by Daniel on 14/11/2017.
 */

public class Car {
    int fixedBranch;
    int model;
    double kilometersTraveled;
    int carNumber;

    public Car(int fixedBranch, int model, double kilometersTraveled, int carNumber) {
        this.fixedBranch = fixedBranch;
        this.model = model;
        this.kilometersTraveled = kilometersTraveled;
        this.carNumber = carNumber;
    }

    public Car() {
        fixedBranch = 0;
        model = 0;
        kilometersTraveled = 0;
        carNumber = 0;
    }

    public int getFixedBranch() {
        return fixedBranch;
    }

    public void setFixedBranch(int fixedBranch) {
        this.fixedBranch = fixedBranch;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getKilometersTraveled() {
        return kilometersTraveled;
    }

    public void setKilometersTraveled(double kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}