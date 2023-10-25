package org.example.models;

public class User {
    public User(String firstName, String lastName, double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wallet = wallet;
    }
    private  String firstName;
    private  String lastName;
    private  double wallet;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
