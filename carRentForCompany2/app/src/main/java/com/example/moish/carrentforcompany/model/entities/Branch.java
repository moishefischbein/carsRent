package com.example.moish.carrentforcompany.model.entities;

/**
 * Created by moish on 13/11/2017.
 */
public class Branch {

    String City, Street, AdressNumber;
    int NumberOfParkingAvailable;
    int BranchNumber;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getAdressNumber() {
        return AdressNumber;
    }

    public void setAdressNumber(String adressNumber) {
        AdressNumber = adressNumber;
    }

    public int getNumberOfParkingAvailable() {
        return NumberOfParkingAvailable;
    }

    public void setNumberOfParkingAvailable(int numberOfParkingAvailable) {
        NumberOfParkingAvailable = numberOfParkingAvailable;
    }

    public int getBranchNumber() {
        return BranchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        BranchNumber = branchNumber;
    }

    public Branch() {
    }

    public Branch(String city, String street, String adressNumber, int numberOfParkingAvailable, int branchNumber) {
        City = city;
        Street = street;
        AdressNumber = adressNumber;
        NumberOfParkingAvailable = numberOfParkingAvailable;
        BranchNumber = branchNumber;
    }
}
