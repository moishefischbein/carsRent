package com.example.moish.carrentforcompany.model.entities;

/**
 * Created by moish on 13/11/2017.
 */

public class CarModel {

    int modelCode;
    String companyName;
    String modelName;
    int motorVolume;
    Boolean isAutomatic;
    int numberOfSeats;

    public int getModelCode() {
        return modelCode;
    }

    public void setModelCode(int modelCode) {
        this.modelCode = modelCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(int motorVolume) {
        this.motorVolume = motorVolume;
    }

    public Boolean getAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.isAutomatic = automatic;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int seats) {
        this.numberOfSeats = seats;
    }

    public CarModel() {

    }

    public CarModel(int modelCode, String companyName, String modelName,
                    int motorVolume, Boolean isAutomatic, int numberOfSeats) {
        this.modelCode = modelCode;
        this.companyName = companyName;
        this.modelName = modelName;
        this.motorVolume = motorVolume;
        this.isAutomatic = isAutomatic;
        this.numberOfSeats = numberOfSeats;
    }
}