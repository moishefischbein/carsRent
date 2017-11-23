package com.example.moish.carrentforcompany.model.entities;

/**
 * Created by moish on 13/11/2017.
 */


public class Client {

    String lastName;
    String firstName;
    long id;
    String phoneNumber;
    String email;
    long creditCardNumber;


    public Client() {
    }

    public Client(String lastName, String firstName, long id, String phoneNumber, String email, long creditCardNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long ID) {
        this.id = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}